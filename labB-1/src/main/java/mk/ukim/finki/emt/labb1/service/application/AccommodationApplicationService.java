package mk.ukim.finki.emt.labb1.service.application;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import mk.ukim.finki.emt.labb1.model.dto.CreateAccommodationDto;
import mk.ukim.finki.emt.labb1.model.dto.DisplayAccommodationDto;

public interface AccommodationApplicationService {

    DisplayAccommodationDto findById(Long id);

    DisplayAccommodationDto add(CreateAccommodationDto createAccommodationDto);

    DisplayAccommodationDto edit(Long id, CreateAccommodationDto createAccommodationDto);

    void delete(Long id);

    DisplayAccommodationDto isRented(Long id);
}
