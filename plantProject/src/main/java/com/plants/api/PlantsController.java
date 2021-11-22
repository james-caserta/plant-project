package com.plants.api;

import com.plants.models.CreatePlantModel;
import com.plants.models.GetPlantModel;
import com.plants.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PlantsController {
    @Autowired
    PlantService _plantService;


    //CRUD
    // Create a plant
    @PostMapping("/plants")
    public String createPlant(@RequestBody CreatePlantModel model) {
        return _plantService.createPlant(model);
    }
    // Read (get) a plant
    @GetMapping("/plants/{id}")
    public GetPlantModel getPlant(@PathVariable String id) throws ResponseStatusException {
        GetPlantModel plant = _plantService.getPlantById(id);
        if(plant == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No plant by id: " + id);
        return plant;
    }
    // Read (get) all plants
    @GetMapping("/plants")
    public String getAllPlants() {
        return "getAll";
    }
    // Update a plant
    @PutMapping("/plants/{id}")
    public String updatePlant(@PathVariable String id) {
        return "update";
    }
    // Delete a plant
    @DeleteMapping("/plants/{id}")
    public String deletePlant(@PathVariable String id) {
        return "delete";
    }
}
