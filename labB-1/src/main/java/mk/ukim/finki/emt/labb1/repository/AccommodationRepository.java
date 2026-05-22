package mk.ukim.finki.emt.labb1.repository;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}
