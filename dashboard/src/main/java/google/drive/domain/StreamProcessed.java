package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String videoUrl;
    private Date processDate;
    private String userId;
}
