package mk.ukim.finki.emt.laba1.service.application.impl;

import mk.ukim.finki.emt.laba1.model.domain.Author;
import mk.ukim.finki.emt.laba1.model.domain.Book;
import mk.ukim.finki.emt.laba1.model.dto.CreateBookDto;
import mk.ukim.finki.emt.laba1.model.dto.DisplayBookDto;
import mk.ukim.finki.emt.laba1.service.application.BookApplicationService;
import mk.ukim.finki.emt.laba1.service.domain.AuthorService;
import mk.ukim.finki.emt.laba1.service.domain.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookApplicationServiceImpl implements BookApplicationService {

    private final BookService bookService;
    private final AuthorService authorService; //bidejki klientot prakja samo authorId, a tuka preku findBookById vo repository, kje go najdeme koj e Author

    public BookApplicationServiceImpl(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    //Tuka dobivame podatoci od klientot (createBookDto) i treba da go konvertirame vo CreateBookDto
    @Override
    public DisplayBookDto addBook(CreateBookDto createBookDto) {
        Author author = authorService.findAuthorById(createBookDto.authorId()); //treba da go najdeme bidejki klientot ni prakja samo authorId
        Book book = createBookDto.toBook(author); //konvertitame od CreateBookDto vo Book
        Book saved = bookService.addBook(book); //Ja zacuvuvame konvertiranata book vo baza
        return DisplayBookDto.from(saved); // ja konvertirame zacuvanata kniga od Book vo DisplayBookDto i toa go vrakjame do klientot
    }

    @Override
    public DisplayBookDto updateBook(Long id, CreateBookDto createBookDto) {
        Author author = authorService.findAuthorById(createBookDto.authorId());
        Book book = createBookDto.toBook(author);
        Book updated = bookService.updateBook(id, book);
        return DisplayBookDto.from(updated);
    }

    @Override
    public DisplayBookDto deleteBookById(Long id) {
        return DisplayBookDto.from(bookService.deleteBookById(id));
    }

    @Override
    public DisplayBookDto isBookRented(Long id) {
        return DisplayBookDto.from(bookService.isBookRented(id));
    }
}
