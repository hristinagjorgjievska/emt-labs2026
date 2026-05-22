package mk.ukim.finki.emt.labb1.model.dto;

import mk.ukim.finki.emt.labb1.model.domain.Country;

public record DisplayCountryDto(
        String name,
        String continent
) {

    public static DisplayCountryDto from(Country country){
        return new DisplayCountryDto(
                country.getName(),
                country.getContinent()
        );
    }
}
