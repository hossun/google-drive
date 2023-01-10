package google.drive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import google.drive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired NofificationRepository nofificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StreamProcessed'")
    public void wheneverStreamProcessed_NotifyToUser(@Payload StreamProcessed streamProcessed){

        StreamProcessed event = streamProcessed;
        System.out.println("\n\n##### listener NotifyToUser : " + streamProcessed + "\n\n");


        

        // Sample Logic //
        Nofification.notifyToUser(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileUploaded'")
    public void wheneverFileUploaded_NotifyToUser(@Payload FileUploaded fileUploaded){

        FileUploaded event = fileUploaded;
        System.out.println("\n\n##### listener NotifyToUser : " + fileUploaded + "\n\n");


        

        // Sample Logic //
        Nofification.notifyToUser(event);
        

        

    }

}


