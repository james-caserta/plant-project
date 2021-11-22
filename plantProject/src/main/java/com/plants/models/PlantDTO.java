package com.plants.models;

import com.plants.utils.IFindable;

import java.util.List;

public class PlantDTO implements IFindable {
    public String id;
    public String lightLevel;
    public String careLevel;
    public String size;
    public String picture;
    public String name;
    public String genusName;
    public String speciesName;
    public String description;
    public List<String> aliases;

}
