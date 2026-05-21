package mk.ukim.finki.emt.laba1.model.dto;

import jakarta.validation.constraints.Positive;
import mk.ukim.finki.emt.laba1.model.domain.Author;
import mk.ukim.finki.emt.laba1.model.domain.Book;
import mk.ukim.finki.emt.laba1.model.enums.Category;
import mk.ukim.finki.emt.laba1.model.enums.State;

public record CreateBookDto(
        String name,
        Category category, //vo Create se koristat enumeracii bidejki JSON kje go pretvori vo Category stringot
        Long authorId,
        State state,
        @Positive
        Integer availableCopies
) {
    public Book toBook(Author author){
        return new Book(name, category, author, state, availableCopies);
    }
}
