package com.plants.utils;

import com.plants.models.PlantDTO;

import java.util.List;

public class Utils {

    public static <T extends IFindable> T findById(String id, List<T> collection) {
        for (T item: collection) {
            if(item.id.equals(id)) {
                return item;
            }
        }
        return null;
    }
}
