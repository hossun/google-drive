package google.drive.domain;

import google.drive.domain.FileUploaded;
import google.drive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Driver_table")
@Data

public class Driver  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String fileName;
    
    
    
    
    
    private Float fileSize;
    
    
    
    
    
    private String fileType;
    
    
    
    
    
    private Date uploadDate;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static DriverRepository repository(){
        DriverRepository driverRepository = DriveApplication.applicationContext.getBean(DriverRepository.class);
        return driverRepository;
    }






}
