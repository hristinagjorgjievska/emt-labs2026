package mk.ukim.finki.emt.labb1.model.domain;

import jakarta.persistence.*;
import lombok.Data;
import mk.ukim.finki.emt.labb1.model.enums.Category;
import mk.ukim.finki.emt.labb1.model.enums.State;

@Entity
@Table(name = "accommodations")
@Data
public class Accommodation extends BaseAuditableEntity{

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    private Host host;

    private Integer numRooms;

    @Enumerated(EnumType.STRING)
    private State state;
}
