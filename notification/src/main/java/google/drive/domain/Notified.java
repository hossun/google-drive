package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;
    private String userId;
    private String msg;
    private Date sendDate;

    public Notified(Nofification aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
