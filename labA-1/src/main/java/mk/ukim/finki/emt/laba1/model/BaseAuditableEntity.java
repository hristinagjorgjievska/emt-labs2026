package mk.ukim.finki.emt.laba1.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseAuditableEntity extends BaseEntity{ //ovaa klasa se koristi za site entiteti koi gi imaat id, createdAt i updatedAt (osven Country)

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
