package mk.ukim.finki.emt.laba1.model.dto;

import mk.ukim.finki.emt.laba1.model.domain.Book;

//vo record se stavaat site atributi koi sakame klientot da gi vidi
public record DisplayBookDto( //strukturata na JSON-ot koj kje go primi klientot (Sekoe pole: eden kluc vo JSON)
        Long id,
        String name,
        String category, //iako e enum, JSON ne poznava enumeracii, samo za tekst
        DisplayAuthorDto authorDto,
        String state,
        Integer availableCopies
) {

    public static DisplayBookDto from(Book book){ //Ova e converter - zema Book entitet od bazata i go pretvora vo BookDisplayDto
        return new DisplayBookDto(
                book.getId(),
                book.getName(),
                book.getCategory().name(),
                DisplayAuthorDto.from(book.getAuthor()),
                book.getState().name(),
                book.getAvailableCopies()
        );
    }
}
