package com.project.code;

public class PetManagement{
    
    private int ID;
    private String AdoptPurch_Time;
    private String date;
    private double price;
    private double totalBill;
    private String AdoptedorPurchased;

    public int getID() {
        return ID;
    }

    public String getAdoptPurch_Time() {
        return AdoptPurch_Time;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public String getAdoptedorPurchased() {
        return AdoptedorPurchased;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAdoptPurch_Time(String AdoptPurch_Time) {
        this.AdoptPurch_Time = AdoptPurch_Time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void setAdoptedorPurchased(String AdoptedorPurchased) {
        this.AdoptedorPurchased = AdoptedorPurchased;
    }
    
    public boolean checkPassword(Manager obj){
        
        if(obj.getPassword().equals(obj.getPassword()))
            
            return true;
        else
            return false;
    }
    
    public void giveAdopPurchInfo(){
        
        
    }
    
}
