package mk.ukim.finki.emt.laba1.service.application;

import mk.ukim.finki.emt.laba1.model.dto.CreateBookDto;
import mk.ukim.finki.emt.laba1.model.dto.DisplayBookDto;

//Operacii koi gi povikuva klientot preku API-to
//DisplayBookDto - toa sto go prikazuvame na klientot
//CreateBookDto - toa sto vleguva od klientot (pr. koga pravi promena na nekoja kniga ili koga se kreira nova, se brise itn)
public interface BookApplicationService {

    DisplayBookDto addBook(CreateBookDto createBookDto);

    DisplayBookDto updateBook(Long id, CreateBookDto createBookDto);

    DisplayBookDto deleteBookById(Long id);

    DisplayBookDto isBookRented(Long id);
}
