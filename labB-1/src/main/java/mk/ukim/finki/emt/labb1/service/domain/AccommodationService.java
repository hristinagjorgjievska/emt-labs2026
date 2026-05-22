package mk.ukim.finki.emt.labb1.service.domain;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;

import java.util.List;

public interface AccommodationService {

    Accommodation findById(Long id);

    List<Accommodation> findAll();

    Accommodation add(Accommodation accommodation);

    Accommodation edit(Long id, Accommodation accommodation);

    Accommodation delete(Long id);

    Accommodation isRented(Long id);
}
