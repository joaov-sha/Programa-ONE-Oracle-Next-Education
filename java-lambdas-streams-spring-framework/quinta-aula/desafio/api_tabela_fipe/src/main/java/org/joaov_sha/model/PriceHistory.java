package org.joaov_sha.model;

public class PriceHistory {
    
    private String month;
    private String price;
    private String reference;

    public PriceHistory(String month, String price, String reference){
        this.month = month;
        this.price = price;
        this.reference = reference;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getReference(){
        return reference;
    }

    public void setReference(String reference){
        this.reference = reference;
    }

    @Override
    public String toString(){
        return String.format("\"month\": \"%s\",%n\"price\": \"%s\",%n\"reference\": \"%s\"",month, price, reference);
    }
}
