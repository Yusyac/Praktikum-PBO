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
public class SepedaMotor extends Mesin{
    
    private Mesin mesin;
    private String merkMotor;
    
    public SepedaMotor(String merkMotor, String merkMesin){
        super.setMerek(merkMesin);
        this.merkMotor = merkMotor;
    }
    
    public void setMerekMotor(String merkMotor){
        this.merkMotor = merkMotor;
    }
    
    public String getMerkMotor(){
        return this.merkMotor;
    }
    
    public String getMerekMesin(){
        return super.getMerek();
    }
    
    public void tambahKecepatanMotor(){
        if(getMerekMesin().equalsIgnoreCase("Honda")){
            tambahKecepatan();
        } else {
            tambahKecepatan();
        }
    }
    
    public void kurangKecepatanMotor(){
        if(getMerekMesin().equalsIgnoreCase("Honda")){
            kurangKecepatan();
        } else {
            kurangKecepatan();
        }
    }
}
