package com.plants.repositories;

import com.plants.models.PlantDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlantsRepository {
    public List<PlantDTO> plants = new ArrayList(){{
        add(new PlantDTO() {{
            id = "1"; name = "snake plant";
        }});
        add(new PlantDTO() {{
            id = "2"; name = "jade plant";
        }});
        add(new PlantDTO() {{
            id = "3"; name = "spider plant";
        }});
    }};
}
