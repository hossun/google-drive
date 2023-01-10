package google.drive.domain;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="nofifications", path="nofifications")
public interface NofificationRepository extends PagingAndSortingRepository<Nofification, Long>{

}
