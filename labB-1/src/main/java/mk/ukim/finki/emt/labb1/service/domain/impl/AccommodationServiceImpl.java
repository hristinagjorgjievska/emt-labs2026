package mk.ukim.finki.emt.labb1.service.domain.impl;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import mk.ukim.finki.emt.labb1.model.enums.State;
import mk.ukim.finki.emt.labb1.model.exceptions.AccommodationNotFoundException;
import mk.ukim.finki.emt.labb1.repository.AccommodationRepository;
import mk.ukim.finki.emt.labb1.service.domain.AccommodationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationServiceImpl implements AccommodationService {

    private final AccommodationRepository accommodationRepository;

    public AccommodationServiceImpl(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }


    @Override
    public Accommodation findById(Long id) {
        return accommodationRepository.findById(id).orElseThrow(() -> new AccommodationNotFoundException("The accommodation you are looking for cannot be found!"));
    }

    @Override
    public List<Accommodation> findAll() {
        return accommodationRepository.findAll();
    }

    @Override
    public Accommodation add(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    @Override
    public Accommodation edit(Long id, Accommodation accommodation) {
        Accommodation accommodationToEdit = findById(id);
        accommodationToEdit.setName(accommodation.getName());
        accommodationToEdit.setCategory(accommodation.getCategory());
        accommodationToEdit.setHost(accommodation.getHost());
        accommodationToEdit.setNumRooms(accommodation.getNumRooms());
        accommodationToEdit.setState(accommodation.getState());
        return accommodationRepository.save(accommodationToEdit);
    }

    @Override
    public Accommodation delete(Long id) {
        Accommodation accommodation = findById(id);
        State state = accommodation.getState();

        if (accommodation.getState().equals(State.BAD)){
             accommodationRepository.delete(accommodation);
        }

        return accommodation;
    }

    @Override
    public Accommodation isRented(Long id) {
        Accommodation accommodation = findById(id);
        accommodation.setIsRented(true);
        return accommodationRepository.save(accommodation);
    }
}
