package com.plants.services;

import com.plants.models.*;
import com.plants.repositories.PlantsRepository;
import com.plants.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {
    @Autowired
    PlantsRepository _db;

    // CRUD
    // Create a plant
    public String createPlant(CreatePlantModel model) {
        // TEMP: create id - this will be handled by the database later
        String id = java.util.UUID.randomUUID().toString();

        // create plant DTO
        PlantDTO plantDTO = new PlantDTO();
        plantDTO.name = model.name;
        plantDTO.id = id;

        // add plant DTO to repository
        _db.plants.add(plantDTO);
        // return create plant model
        return id;
    }

    // Get one plant by id
    public GetPlantModel getPlantById(String id) {
        // search database for plant matching id
        PlantDTO plantDTO = Utils.findById(id, _db.plants);

        // if not found return null
        if(plantDTO == null) { return null; }

        // create new GetPlantModel and transfer data from DTO
        GetPlantModel getPlantModel = new GetPlantModel();
        getPlantModel.id = id;
        getPlantModel.name = plantDTO.name;

        // return GetPlantModel
        return getPlantModel;
    }
    // Get all plants
    public List<GetPlantModel> getAllPlants() {

        return null;
    }
    // Update a plant
    public UpdatePlantModel updatePlant(UpdatePlantModel model) {

        return model;
    }
    // Delete a plant
    public Boolean deletePlant(String id) {

        return true;
    }
}
