package mk.ukim.finki.emt.labb1.web;

import mk.ukim.finki.emt.labb1.model.dto.CreateAccommodationDto;
import mk.ukim.finki.emt.labb1.model.dto.DisplayAccommodationDto;
import mk.ukim.finki.emt.labb1.service.application.AccommodationApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {

    private final AccommodationApplicationService accommodationApplicationService;


    public AccommodationController(AccommodationApplicationService accommodationApplicationService) {
        this.accommodationApplicationService = accommodationApplicationService;
    }

    @PostMapping
    public ResponseEntity<DisplayAccommodationDto> add(@RequestBody CreateAccommodationDto createAccommodationDto){
        return ResponseEntity.ok(accommodationApplicationService.add(createAccommodationDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisplayAccommodationDto> edit(@PathVariable Long id, @RequestBody CreateAccommodationDto createAccommodationDto){
        return ResponseEntity.ok(accommodationApplicationService.edit(id, createAccommodationDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DisplayAccommodationDto> delete(@PathVariable Long id){
        accommodationApplicationService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/rent")
    public ResponseEntity<DisplayAccommodationDto> markAsRented(@PathVariable Long id) {
        return ResponseEntity.ok(accommodationApplicationService.isRented(id));
    }
}
