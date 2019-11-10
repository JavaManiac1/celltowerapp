package com.celltowerapp.controller;

import com.celltowerapp.model.CellTower;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * Created by user on 10.11.2019.
 */
public class ObjectToJson {

    public static List<String> objectToJson(List<CellTower> cellTowerList){
        ObjectMapper objectMapper = new ObjectMapper();

       // for (CellTower cell : cellTowerList){
            objectToJson(cellTowerList);
        //}
        return null;
    }
}
