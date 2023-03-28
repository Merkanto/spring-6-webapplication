package merkanto.spring6webapplication.services;

import merkanto.spring6webapplication.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
