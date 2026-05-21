package mk.ukim.finki.emt.laba1.service.domain.impl;

import mk.ukim.finki.emt.laba1.model.domain.Book;
import mk.ukim.finki.emt.laba1.model.exceptions.BookNotFoundException;
import mk.ukim.finki.emt.laba1.repository.BookRepository;
import mk.ukim.finki.emt.laba1.service.domain.BookService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("The book you are searching for is not found."));
    }

    @Override
    public Book addBook(Book book) {
       return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Book bookToUpdate = findBookById(id);
        bookToUpdate.setName(book.getName());
        bookToUpdate.setCategory(book.getCategory());
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setState(book.getState());
        bookToUpdate.setAvailableCopies(book.getAvailableCopies());
        return bookRepository.save(bookToUpdate);
    }


    @Override
    public Book deleteBookById(Long id) {
        Book bookToDelete = findBookById(id);
        bookRepository.deleteById(id);
        return bookToDelete;
    }

    @Override
    public Book isBookRented(Long id) {
        Book isRented = findBookById(id);
        isRented.setAvailableCopies(isRented.getAvailableCopies() - 1);
        return bookRepository.save(isRented);
    }
}
