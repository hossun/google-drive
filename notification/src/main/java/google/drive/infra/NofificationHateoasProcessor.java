package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class NofificationHateoasProcessor implements RepresentationModelProcessor<EntityModel<Nofification>>  {

    @Override
    public EntityModel<Nofification> process(EntityModel<Nofification> model) {

        
        return model;
    }
    
}
