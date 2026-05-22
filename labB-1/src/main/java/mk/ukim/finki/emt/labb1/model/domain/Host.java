package mk.ukim.finki.emt.labb1.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "hosts")
@Data
public class Host extends BaseAuditableEntity{

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    public Host() {

    }

    public Host(String name, String surname, Country country) {
        super();
    }
}