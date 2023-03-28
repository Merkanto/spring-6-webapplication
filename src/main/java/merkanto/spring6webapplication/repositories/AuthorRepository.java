package merkanto.spring6webapplication.repositories;

import merkanto.spring6webapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
