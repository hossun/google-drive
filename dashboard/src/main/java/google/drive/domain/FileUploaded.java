package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String userId;
    private String fileName;
    private Float fileSize;
    private String fileType;
    private Date uploadDate;
}
