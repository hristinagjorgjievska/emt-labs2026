package mk.ukim.finki.emt.labb1.model.dto;

import mk.ukim.finki.emt.labb1.model.domain.Country;
import mk.ukim.finki.emt.labb1.model.domain.Host;

public record CreateHostDto(
        String name,
        String surname,
        Long countryId
) {

    public Host to(Country country){
        return new Host(name, surname, country);
    }
}
