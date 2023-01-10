package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String videoUrl;
    private Date processDate;
    private String userId;
}


