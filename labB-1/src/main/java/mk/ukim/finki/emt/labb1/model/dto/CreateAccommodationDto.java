package mk.ukim.finki.emt.labb1.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import mk.ukim.finki.emt.labb1.model.domain.Host;
import mk.ukim.finki.emt.labb1.model.enums.Category;

public record CreateAccommodationDto(
        @NotBlank
        String name,
        @NotNull
        Category category,
        @NotNull
        Long hostId,
        @Positive
        Integer numRooms
) {

    public Accommodation to(Host host){
        return new Accommodation(name, category, host, numRooms);
    }
}
