/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.UTS;

/**
 *
 * @author USER
 */
public class Mesin {
    
    private String merek;
    private double kecepatan;
    
    public Mesin(){
        
    }
    
    public void setMerek( String merekMesin){
        this.merek = merekMesin;
    }
    
    public String getMerek(){
        return this.merek;
    }
    
    public double getKecepatan(){
        return this.kecepatan;
    }
    
    public void tambahKecepatan(){
        if(getMerek().equalsIgnoreCase("Honda")) {
            if(this.kecepatan <= 100){
                this.kecepatan += 10;
                System.out.println(getKecepatan() + " Km/Jam ");
            } else {
                System.out.println("Kecepatan Sudah Mencapai Maximum!");
            } 
        } else {
            if(this.kecepatan <= 100){
                this.kecepatan += 15;
                System.out.println(getKecepatan() + " Km/Jam ");
            } else {
                System.out.println("Kecepatan Sudah Mencapai Maximum!");
            } 
        }
    }
    
    public void kurangKecepatan(){
        if(getMerek().equalsIgnoreCase("Honda")) {
            this.kecepatan -= 5;
            System.out.println(getKecepatan() + " Km/Jam ");
        } else {
            this.kecepatan -= 10;
            System.out.println(getKecepatan() + " Km/Jam ");
        }
    } 
}
