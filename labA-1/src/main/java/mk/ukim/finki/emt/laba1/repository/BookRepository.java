package mk.ukim.finki.emt.laba1.repository;

import mk.ukim.finki.emt.laba1.model.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
