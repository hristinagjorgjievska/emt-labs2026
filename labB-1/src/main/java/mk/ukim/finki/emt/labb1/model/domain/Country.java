package mk.ukim.finki.emt.labb1.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "countries")
@Data
public class Country extends BaseEntity{

    private String name;

    private String continent;
}
