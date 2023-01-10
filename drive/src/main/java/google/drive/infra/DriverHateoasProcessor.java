package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DriverHateoasProcessor implements RepresentationModelProcessor<EntityModel<Driver>>  {

    @Override
    public EntityModel<Driver> process(EntityModel<Driver> model) {

        
        return model;
    }
    
}
