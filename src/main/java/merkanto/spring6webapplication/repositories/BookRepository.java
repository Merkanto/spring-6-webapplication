package merkanto.spring6webapplication.repositories;

import merkanto.spring6webapplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
