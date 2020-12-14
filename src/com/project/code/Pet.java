package com.project.code;

import java.util.Scanner;

public class Pet {
    
    private int ID;
    private String petName;
    private String catagory;
    private String breed;
    private String colour;
    private String gender;
    private String age;
    private String status;
    
    private String bird = "Bird";
    private String dog = "Dog";
    private String cat = "Cat";
    
    Scanner userInput = new Scanner(System.in);
   
    public int getID() {
        return ID;
    }

    public String getPetName() {
        return petName;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getStatus() {
        return status;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public String getGender() {
        return gender;
    }
    
    public String getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public Pet(int ID, String petName, String catagory, String breed, String colour, String gender, String age, String status) {
        this.ID = ID;
        this.petName = petName;
        this.catagory = catagory;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }
    
    public boolean checkPassword(Manager obj){
        
        if(obj.getPassword().equals(obj.getPassword()))
            
            return true;
        else
            return false;
    }
    
    public void selectPetCatagory(){
        
        System.out.println("Enter pets name: ");
        petName = userInput.next();
        
        System.out.println("Please varify your name by typing Bird, Dog, Cat");
        
        while (true) {
            String input = userInput.next();
            if (input == bird) {
                System.out.println("Pet name is: " + petName);
            }
            if (input == dog) {
                System.out.println("Pet name is: " + petName);
            }
            if (input == cat) {
                System.out.println("Pet name is: " + petName);
            }   
        }    
    }
    
    public void insertPetInfo(){
        
    }

}
