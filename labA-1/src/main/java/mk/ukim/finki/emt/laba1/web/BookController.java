package mk.ukim.finki.emt.laba1.web;

import mk.ukim.finki.emt.laba1.model.dto.CreateBookDto;
import mk.ukim.finki.emt.laba1.model.dto.DisplayBookDto;
import mk.ukim.finki.emt.laba1.service.application.BookApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class BookController {

    private final BookApplicationService bookApplicationService;

    public BookController(BookApplicationService bookApplicationService) {
        this.bookApplicationService = bookApplicationService;
    }

    @PostMapping("/book")
    public ResponseEntity<DisplayBookDto> addBook(@RequestBody CreateBookDto createBookDto){
        DisplayBookDto book = bookApplicationService.addBook(createBookDto);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/{id}/book")
    public ResponseEntity<DisplayBookDto> updateBook(@PathVariable Long id, @RequestBody CreateBookDto createBookDto){
        DisplayBookDto book = bookApplicationService.updateBook(id, createBookDto);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{id}/book")
    public ResponseEntity<DisplayBookDto> deleteBookById(@PathVariable Long id){
        DisplayBookDto book = bookApplicationService.deleteBookById(id);
        return ResponseEntity.ok(book);
    }

    @PatchMapping("/{id}/book/isRented")
    public ResponseEntity<DisplayBookDto> isBookRented(@PathVariable Long id){
        DisplayBookDto book = bookApplicationService.isBookRented(id);
        return ResponseEntity.ok(book);
    }


}
