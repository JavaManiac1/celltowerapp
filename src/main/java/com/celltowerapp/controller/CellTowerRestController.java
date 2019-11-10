package com.celltowerapp.controller;

import com.celltowerapp.model.CellTower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.celltowerapp.controller.ObjectToJson.objectToJson;

/**
 * Created by user on 10.11.2019.
 */
@RestController
@RequestMapping("/api")
public class CellTowerRestController {

    CellTower celltower = CellTower.builder()
            .radio("Lte")
            .mcc("2")
            .build();

    @GetMapping("/celltowers")
    public List<CellTower> getAllCellTowers(){

         List<CellTower> cells = OpenCSVReader.readFromCSV();
          return  cells;
       //  List<String> jsoncells = new ArrayList<>();
       //  jsoncells = objectToJson(cells);

    }
}
