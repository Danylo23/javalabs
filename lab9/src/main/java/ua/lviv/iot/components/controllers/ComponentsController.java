package ua.lviv.iot.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.components.models.CoolingSystem;
import ua.lviv.iot.components.repositories.CoolingSystemRepository;

import javax.validation.Valid;

@RestController
@Validated
public class ComponentsController {
    @Autowired
    private CoolingSystemRepository coolingSystemRepository;

    @GetMapping("/components")
    public Iterable<CoolingSystem> getAllComponents() {

        return coolingSystemRepository.findAll();

    }

    @GetMapping("/components/{id}")
    public CoolingSystem getObject(@PathVariable Integer id) throws Exception {

        return (CoolingSystem) coolingSystemRepository.findById(id).orElseThrow(()
                -> new Exception());
    }

    @PostMapping("/components")
    CoolingSystem newCoolingSystem(@Valid @RequestBody CoolingSystem newCoolingSystem) {

        return coolingSystemRepository.save(newCoolingSystem);

    }

    @PutMapping("/components/{id}")
    CoolingSystem updateCoolingSystem(@Valid @RequestBody CoolingSystem newCoolingSystem, @PathVariable Integer id) {

        return coolingSystemRepository.findById(id)
                .map(collingSystem -> {
                    collingSystem.setfanSize(newCoolingSystem.getFanSize());
                    collingSystem.setWeight(newCoolingSystem.getWeight());
                    collingSystem.setName(newCoolingSystem.getName());
                    collingSystem.setPrice(newCoolingSystem.getPrice());
                    collingSystem.setPowerConsumption(newCoolingSystem.getPowerConsumption());
                    collingSystem.setProductYear(newCoolingSystem.getProductYear());

                    return coolingSystemRepository.save(collingSystem);
                })
                .orElseGet(() -> {
                    newCoolingSystem.setId(id);
                    return coolingSystemRepository.save(newCoolingSystem);
                });

    }

    @DeleteMapping("/components/{id}")
    void deleteCoolingSystem(@PathVariable Integer id) {

        coolingSystemRepository.deleteById(id);

    }


}
