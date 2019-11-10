package com.celltowerapp.model;

import javax.persistence.*;


/**
 * Created by user on 10.11.2019.
 */
@Entity
@Table(name="celltowers")
public class CellTower {

    @Id
    @Column(name="cellid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

   private String radio;

   private String mcc;

   private String net;

   private String area;

   private String cell;

   private String unit;

   private String lon;

   private String lat;

   private String range;

   private String samples;

   private String chargeable;

   private String created;

   private String updated;

   @Column(name="averagesignal")
   private String averageSignal;

    //no-arg constructor
    protected CellTower(){}

    //private constructor
    public CellTower(CellTowerBuilder builder) {
        this.radio = builder.radio;
        this.mcc = builder.mcc;
        this.net = builder.net;
        this.area = builder.area;
        this.cell = builder.cell;
        this.unit = builder.unit;
        this.lon = builder.lon;
        this.lat = builder.lat;
        this.range = builder.range;
        this.samples = builder.samples;
        this.chargeable = builder.chargeable;
        this.created = builder.created;
        this.updated = builder.updated;
        this.averageSignal = builder.averageSignal;
    }

    //getters
    public long getId(){
        return this.id;
    }
    public String getRadio(){
        return this.radio;
    }

    public String getMcc() {
        return mcc;
    }

    public String getNet() {
        return net;
    }

    public String getArea() {
        return area;
    }

    public String getCell() {
        return cell;
    }

    public String getUnit() {
        return unit;
    }

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }

    public String getRange() {
        return range;
    }

    public String getSamples() {
        return samples;
    }

    public String getChargeable() {
        return chargeable;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    public String getAverageSignal() {
        return averageSignal;
    }

    //static factory method
    public static CellTowerBuilder builder(){
        return new CellTowerBuilder();
    }


    //no setters to provide immutability



    @Override
    public String toString() {
        return "CellTower{" +
                "id=" + id +
                ", radio='" + radio + '\'' +
                ", mcc='" + mcc + '\'' +
                ", net='" + net + '\'' +
                ", area='" + area + '\'' +
                ", cell='" + cell + '\'' +
                ", unit='" + unit + '\'' +
                ", lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", range='" + range + '\'' +
                ", samples='" + samples + '\'' +
                ", chargeable='" + chargeable + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", averageSignal='" + averageSignal + '\'' +
                '}';
    }

    public static class CellTowerBuilder{

        private long id;
        private String radio;
        private String mcc;
        private String net;
        private String area;
        private String cell;
        private String unit;
        private String lon;
        private String lat;
        private String range;
        private String samples;
        private String chargeable;
        private String created;
        private String updated;
        private String averageSignal;

        public CellTowerBuilder radio(String radio){
            this.radio = radio;
            return this;
        }

        public CellTowerBuilder mcc(String mcc){
            this.mcc = mcc;
            return this;
        }
        public CellTowerBuilder net(String net){
            this.net = net;
            return  this;
        }

        public CellTowerBuilder area(String area){
            this.area = area;
            return this;
        }
        public CellTowerBuilder cell(String cell){
            this.cell = cell;
            return this;
        }
        public CellTowerBuilder unit(String unit){
            this.unit =unit;
            return this;
        }
        public CellTowerBuilder lon(String lon){
            this.lon = lon;
            return this;

        }
        public CellTowerBuilder lat(String lat){
            this.lat = lat;
            return this;
        }
        public CellTowerBuilder range(String range){
            this.range = range;
            return  this;
        }
        public CellTowerBuilder samples(String samples){
            this.samples = samples;
            return  this;
        }
        public CellTowerBuilder chargeable(String chargeable){
            this.chargeable = chargeable;
            return  this;
        }
        public CellTowerBuilder created(String created){
            this.created =created;
            return this;
        }
        public CellTowerBuilder updated(String updated){
            this.updated = updated;
            return  this;
        }
        public CellTowerBuilder averageSignal(String averageSignal){
            this.averageSignal = averageSignal;
            return this;
        }


        //return finaly constructed CellTower object
        public CellTower build(){
            CellTower cellTower = new CellTower(this);
            return cellTower;
        }

    }

}
