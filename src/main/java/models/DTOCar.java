package models;

public class DTOCar implements DTOInterface {


    Integer Id ;
    String Make;
    String Model;
    String Year;
    String Color;
    String VIN;

    public DTOCar() {
    }

    public DTOCar(Integer Id, String Make, String Model, String Year, String Color, String VIN) {
        this.Id=Id;
        this.Make=Make;
        this.Model=Model;
        this.Year=Year;
        this.Color=Color;
        this.VIN=VIN;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }


}
