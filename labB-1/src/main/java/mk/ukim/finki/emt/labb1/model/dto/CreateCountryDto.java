package mk.ukim.finki.emt.labb1.model.dto;

import mk.ukim.finki.emt.labb1.model.domain.Country;

public record CreateCountryDto(
        String name,
        String continent
) {
    public Country to(){
        return new Country(name, continent);
    }
}
