package kondratyev.com.spring5webapp.repositories;

import kondratyev.com.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}