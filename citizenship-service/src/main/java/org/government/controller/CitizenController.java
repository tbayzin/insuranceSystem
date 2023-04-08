package org.government.controller;



import org.government.model.Citizen;
import org.government.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/client")
    public Citizen save(@RequestBody Citizen citizen) {
        citizenService.saveCitizen(citizen);
        return citizen;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/citizen/{id}")
    public void delete(@PathVariable Long id) {
        citizenService.delete(id);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/client/{id}")
    public Citizen get(@PathVariable Long id) {
        return citizenService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("citizens")
    public Iterable<Citizen> getAll() {
        return citizenService.findAll();
    }

}
