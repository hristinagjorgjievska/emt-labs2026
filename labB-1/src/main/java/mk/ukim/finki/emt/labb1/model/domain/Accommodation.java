package mk.ukim.finki.emt.labb1.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import mk.ukim.finki.emt.labb1.model.enums.Category;
import mk.ukim.finki.emt.labb1.model.enums.State;

@Entity
@Table(name = "accommodations")
@Data
public class Accommodation extends BaseAuditableEntity{

    private String name;

    private Category category;

    @ManyToOne
    private Host host;

    private Integer numRooms;

    private State state;

    public Accommodation() {}

    public Accommodation(String name, Category category, Host host, Integer numRooms) {
        super();
    }
}