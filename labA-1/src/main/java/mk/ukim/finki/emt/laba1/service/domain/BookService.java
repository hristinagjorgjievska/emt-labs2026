package mk.ukim.finki.emt.laba1.service.domain;

import mk.ukim.finki.emt.laba1.model.domain.Book;

public interface BookService {
    Book findBookById(Long id);

    Book addBook(Book book);

    Book updateBook(Long id, Book book);

    Book deleteBookById(Long id);

    Book isBookRented(Long id);
}
