package com.project.code;

import java.util.Scanner;

public class Manager{
    
    private int id, n;
    private int array[];
    private int search;
    private String name;
    private String address;
    private String city;
    private String email;
    private String phone;
    private String password;
    private String secretCode = "AnimalsPlanetsManager";
    
    Scanner in = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public int getN() {
        return n;
    }

    public int getSearch() {
        return search;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Manager(int id, String email, String password, String secretCode) {
        
        this.id = id;
        this.email = email;
        this.password = password;
        this.secretCode = secretCode;
    }
    
    public String updateManager(int id, String name, String address, String city, String email, String phone, String secretCode, String password){
        
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.secretCode = secretCode;
        this.password = password;
        
        return null;
    }
    
    public boolean checkPassword(String password){
        
        if(password.equals(password))
            
            return true;
        else
            return false;
    }
    
    public void searchCustInfo(){
        
        System.out.println("Enter value to find");  
        search = in.nextInt();
        
        for (id = 0; id < n; id++){
               
            if (array[id] == search)  
            {  
                System.out.println(search + " is present at location " + (id + 1) + ".");  
                break;  
            }  
        }  
         
        if (id == n)
             System.out.println(search + " isn't present in array.");  
    }
    
    public void insertCustInfo(){
        
        
    }
}
