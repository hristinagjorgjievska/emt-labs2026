package mk.ukim.finki.emt.laba1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "countries")
@Entity
@Data
@NoArgsConstructor
public class Country extends BaseEntity{

    private String name;

    private String continent;
}
