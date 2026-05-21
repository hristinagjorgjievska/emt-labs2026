package mk.ukim.finki.emt.laba1.service.domain.impl;

import mk.ukim.finki.emt.laba1.model.domain.Author;
import mk.ukim.finki.emt.laba1.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.emt.laba1.repository.AuthorRepository;
import mk.ukim.finki.emt.laba1.service.domain.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    public final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException("Author you are looking for is not found."));
    }
}
