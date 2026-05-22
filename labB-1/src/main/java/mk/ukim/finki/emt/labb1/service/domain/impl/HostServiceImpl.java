package mk.ukim.finki.emt.labb1.service.domain.impl;

import mk.ukim.finki.emt.labb1.model.domain.Host;
import mk.ukim.finki.emt.labb1.model.exceptions.HostNotFoundException;
import mk.ukim.finki.emt.labb1.repository.HostRepository;
import mk.ukim.finki.emt.labb1.service.domain.HostService;
import org.springframework.stereotype.Service;

@Service
public class HostServiceImpl implements HostService {

    private final HostRepository hostRepository;

    public HostServiceImpl(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Override
    public Host findById(Long id) {
        return hostRepository.findById(id).orElseThrow(() -> new HostNotFoundException("The host you are looking for cannot be found!"));
    }
}
