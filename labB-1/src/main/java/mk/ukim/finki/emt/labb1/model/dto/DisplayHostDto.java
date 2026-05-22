package mk.ukim.finki.emt.labb1.model.dto;

import mk.ukim.finki.emt.labb1.model.domain.Host;

public record DisplayHostDto(
        String name,
        String surname,
        DisplayCountryDto countryDto
) {

    public static DisplayHostDto from(Host host){
        return new DisplayHostDto(
                host.getName(),
                host.getSurname(),
                DisplayCountryDto.from(host.getCountry())
        );
    }
}
