package google.drive.infra;

import google.drive.domain.*;
import google.drive.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DashboardViewHandler {

    @Autowired
    private DashboardRepository dashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1 (@Payload FileUploaded fileUploaded) {
        try {

            if (!fileUploaded.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.setUserId(fileUploaded.getUserId());
            dashboard.setFileId(String.valueOf(fileUploaded.getId()));
            dashboard.setFineSize(fileUploaded.getFileSize());
            dashboard.setFileName(fileUploaded.getFileName());
            dashboard.setUpdateDate(fileUploaded.getUploadDate());
            dashboard.setIsUploaded(ture);
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenIndexed_then_UPDATE_1(@Payload Indexed indexed) {
        try {
            if (!indexed.validate()) return;
                // view 객체 조회

                List<Dashboard> dashboardList = dashboardRepository.findByFileId(String.valueOf(indexed.getFileId()));
                for(Dashboard dashboard : dashboardList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    dashboard.setIsIndexed("true");
                // view 레파지 토리에 save
                dashboardRepository.save(dashboard);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenStreamProcessed_then_UPDATE_2(@Payload StreamProcessed streamProcessed) {
        try {
            if (!streamProcessed.validate()) return;
                // view 객체 조회

                List<Dashboard> dashboardList = dashboardRepository.findByFileId(String.valueOf(streamProcessed.getFileId()));
                for(Dashboard dashboard : dashboardList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    dashboard.setVideoUrl(streamProcessed.getVideoUrl());
                // view 레파지 토리에 save
                dashboardRepository.save(dashboard);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

