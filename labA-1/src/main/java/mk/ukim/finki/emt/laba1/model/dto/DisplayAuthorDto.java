package mk.ukim.finki.emt.laba1.model.dto;

import mk.ukim.finki.emt.laba1.model.domain.Author;

public record DisplayAuthorDto(
        Long id,
        String name,
        String surname,
        DisplayCountryDto countryDto
) {
    public static DisplayAuthorDto from(Author author){
        return new DisplayAuthorDto(
                author.getId(),
                author.getName(),
                author.getSurname(),
                DisplayCountryDto.from(author.getCountry())
        );
    }
}
