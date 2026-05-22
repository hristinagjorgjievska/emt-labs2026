package mk.ukim.finki.emt.labb1.model.dto;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import mk.ukim.finki.emt.labb1.model.enums.Category;
import mk.ukim.finki.emt.labb1.model.enums.State;

public record DisplayAccommodationDto (
        Long id,
        String name,
        Category category,
        DisplayHostDto host,
        Integer numRooms,
        State state
){
    public static DisplayAccommodationDto from(Accommodation accommodation){
        return new DisplayAccommodationDto(
                accommodation.getId(),
                accommodation.getName(),
                accommodation.getCategory(),
                DisplayHostDto.from(accommodation.getHost()),
                accommodation.getNumRooms(),
                accommodation.getState()
        );
    }
}
