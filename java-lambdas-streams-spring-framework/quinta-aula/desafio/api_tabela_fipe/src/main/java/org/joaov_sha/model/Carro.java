package org.joaov_sha.model;

public class Carro {
    
    private String brand;
    private String codeFipe;
    private String fuel;
    private String fuelAcronym;
    private String model;
    private int modelYear;
    private String price;
    private PriceHistory priceHistory;
    private String referenceMonth;
    private int vehicleType;

    public Carro(String brand, String codeFipe, String fuel, String model, int modelYear, String price, PriceHistory priceHistory, String referenceMonth, int vehicleType){
        this.brand = brand;
        this.codeFipe = codeFipe;
        this.fuel = fuel;
        this.fuelAcronym = fuel.split("")[0].toUpperCase();
        this.model = model;
        this.modelYear = modelYear;
        this.price = price;
        this.priceHistory = priceHistory;
        this.referenceMonth = referenceMonth;
        this.vehicleType = vehicleType;
    }

    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getCodeFipe(){
        return codeFipe;
    }

    public void setCodeFipe(String codeFipe){
        this.codeFipe = codeFipe;
    }

    public String getFuel(){
        return fuel;
    }

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    private String getFuelAcronym(){
        return fuelAcronym;
    }

    public void setFuelAcronym(String fuelAcronym){
        this.fuelAcronym = fuelAcronym;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getModelYear(){
        return modelYear;
    }

    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public PriceHistory getPriceHistory(){
        return priceHistory;
    }

    public void setPriceHistory(PriceHistory priceHistory){
        this.priceHistory = priceHistory;
    }

    public String getReferenceMonth(){
        return referenceMonth;
    }

    public void setReferenceMonth(String referenceMonth){
        this.referenceMonth = referenceMonth;
    }

    public int getVehicleType(){
        return vehicleType;
    }

    public void setVehicleType(int vehicleType){
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Carro [brand=" + brand + ", codeFipe=" + codeFipe + ", fuel=" + fuel + ", fuelAcronym=" + fuelAcronym
                + ", model=" + model + ", modelYear=" + modelYear + ", price=" + price + ", priceHistory="
                + priceHistory + ", referenceMonth=" + referenceMonth + ", vehicleType=" + vehicleType + "]";
    }
}
