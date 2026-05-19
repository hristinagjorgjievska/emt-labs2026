package mk.ukim.finki.emt.laba1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "authors")
@Entity
@Data
@NoArgsConstructor
public class Author extends BaseAuditableEntity{

    private String name;

    private String surname;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
