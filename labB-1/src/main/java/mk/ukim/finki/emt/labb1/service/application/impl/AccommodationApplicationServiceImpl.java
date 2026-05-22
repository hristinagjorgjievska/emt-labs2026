package mk.ukim.finki.emt.labb1.service.application.impl;

import mk.ukim.finki.emt.labb1.model.domain.Accommodation;
import mk.ukim.finki.emt.labb1.model.domain.Host;
import mk.ukim.finki.emt.labb1.model.dto.CreateAccommodationDto;
import mk.ukim.finki.emt.labb1.model.dto.DisplayAccommodationDto;
import mk.ukim.finki.emt.labb1.service.application.AccommodationApplicationService;
import mk.ukim.finki.emt.labb1.service.domain.AccommodationService;
import mk.ukim.finki.emt.labb1.service.domain.HostService;
import org.springframework.stereotype.Service;

@Service
public class AccommodationApplicationServiceImpl implements AccommodationApplicationService {

    private final AccommodationService accommodationService;
    private final HostService hostService;

    public AccommodationApplicationServiceImpl(AccommodationService accommodationService, HostService hostService, HostService hostService1) {
        this.accommodationService = accommodationService;
        this.hostService = hostService1;
    }


    @Override
    public DisplayAccommodationDto findById(Long id) {
        return DisplayAccommodationDto.from(accommodationService.findById(id));
    }

    @Override
    public DisplayAccommodationDto add(CreateAccommodationDto dto) {
        Host host = hostService.findById(dto.hostId());
        Accommodation accommodation = dto.to(host);
        return DisplayAccommodationDto.from(accommodationService.add(accommodation));
    }

    @Override
    public DisplayAccommodationDto edit(Long id, CreateAccommodationDto dto) {
        Host host = hostService.findById(dto.hostId());
        Accommodation accommodation = dto.to(host);
        return DisplayAccommodationDto.from(accommodationService.edit(id, accommodation));
    }

    @Override
    public void delete(Long id) {
        accommodationService.delete(id);
    }

    @Override
    public DisplayAccommodationDto isRented(Long id) {
        return DisplayAccommodationDto.from(accommodationService.isRented(id));
    }
}