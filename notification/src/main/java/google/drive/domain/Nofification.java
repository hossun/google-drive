package google.drive.domain;

import google.drive.domain.Notified;
import google.drive.NotificationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Nofification_table")
@Data

public class Nofification  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String msg;
    
    
    
    
    
    private Date sendDate;

    @PostPersist
    public void onPostPersist(){


        Notified notified = new Notified(this);
        notified.publishAfterCommit();

    }

    public static NofificationRepository repository(){
        NofificationRepository nofificationRepository = NotificationApplication.applicationContext.getBean(NofificationRepository.class);
        return nofificationRepository;
    }




    public static void notifyToUser(StreamProcessed streamProcessed){

        /** Example 1:  new item 
        Nofification nofification = new Nofification();
        repository().save(nofification);

        */

        /** Example 2:  finding and process
        
        repository().findById(streamProcessed.get???()).ifPresent(nofification->{
            
            nofification // do something
            repository().save(nofification);


         });
        */

        
    }
    public static void notifyToUser(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Nofification nofification = new Nofification();
        repository().save(nofification);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(nofification->{
            
            nofification // do something
            repository().save(nofification);


         });
        */

        
    }


}
