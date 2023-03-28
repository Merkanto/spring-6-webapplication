package merkanto.spring6webapplication.services;

import merkanto.spring6webapplication.domain.Author;
import merkanto.spring6webapplication.domain.Book;

public interface AuthorService {

    Iterable<Author> findAll();
}
