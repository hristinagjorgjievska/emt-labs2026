package mk.ukim.finki.emt.laba1.model.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity { //site modeli imaat ID i zatoa samo ID imame vo nea

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
