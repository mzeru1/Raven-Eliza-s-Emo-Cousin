package com.company;

import java.util.ArrayList;

public class Invoice {
    private String name;
    private ArrayList<String> adressList;
    private String phone;

    public Invoice() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAdressList(ArrayList<String> adressList){
        this.adressList = adressList;
    }
    public ArrayList getAdressList(){
        return adressList;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    public String toString(){
        String nameof =   "your name is : " + getName();
        String adressof = "you adress is : " + " ";
        String output = "";
                for(String i:adressList){
                     output = i + " \n";
                }
       return nameof + "\n" + output +"\n"+"your phone number is : %d"+ phone;

    }
   // return System.out.printf(" \S \S \S \d ", nameof,adressof,phoneHold,phoneof)

}
