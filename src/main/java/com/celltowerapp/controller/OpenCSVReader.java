package com.celltowerapp.controller;

import com.celltowerapp.model.CellTower;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10.11.2019.
 */
public class OpenCSVReader {



    public static List<CellTower> readFromCSV() {

        List<CellTower> cellTowersList = new ArrayList<>();
         int i =0;
         CSVReader reader = null;
        String fileName ="424.csv";
         try {
            // reader = new CSVReader(new FileReader("F:\\PROJECTS\\INTERVIEWTASK\\CELLTOWER\\src\\main\\java\\com\\celltowerapp\\controller\\424.csv"));
             reader = new CSVReader(new FileReader(fileName));
             String[] header = reader.readNext();
             String[] line;
             System.out.println(header[0]+" " +header[1] +" "+ header[2]);
             while((line = reader.readNext()) != null ){
                  i++;
                  if(i>1000)break;
             //    System.out.print(i + " ");

                 //System.out.println(line[0] + " " +line[1] +" "+line[2]);
                 //System.out.println(line.toString());
                 CellTower cellTower = CellTower.builder()
                         .radio(line[0])
                         .mcc(line[1])
                         .net(line[2])
                         .area(line[3])
                         .cell(line[4])
                         .unit(line[5])
                         .lon(line[6])
                         .lat(line[7])
                         .range(line[8])
                         .samples(line[9])
                         .chargeable(line[10])
                         .created(line[11])
                         .updated(line[12])
                         .averageSignal(line[13])
                         .build();
                 cellTowersList.add(cellTower);
//                 for(String l : line){
//                     System.out.print(" "+l);
//
//                 }
//                 System.out.print(" \n");
                 for(CellTower cell : cellTowersList) {
           //          System.out.println("333 \n" + cell.toString());
                    //System.out.println("Directory =  "+new File(".").getAbsolutePath());
                 }
             }
         }catch (IOException e){
             e.printStackTrace();
         }
         System.out.print("Method finished");
         return cellTowersList;
    }





}
