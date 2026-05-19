package mk.ukim.finki.emt.laba1.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.laba1.model.enums.Category;
import mk.ukim.finki.emt.laba1.model.enums.State;

@Table(name = "books")
@Entity
@Data
@NoArgsConstructor
public class Book extends BaseAuditableEntity{

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Enumerated(EnumType.STRING)
    private State state;

    private Integer availableCopies;
}
