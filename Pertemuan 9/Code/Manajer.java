/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.over.Percobaan;

/**
 *
 * @author USER
 */
public class Manajer extends Karyawan{
    
    private double tunjangan;
    private String bagian;
    private Staff st[];
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan(){
        return this.tunjangan;
    }
    
    public void setBagian(String bagian){
        this.bagian = bagian;
    }
    
    public String getBagian(){
        return this.bagian;
    }
    
    public void setstaff(Staff st[]){
        this.st = st;
    }
    
    public void viewStaff(){
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------------------------------------");
    }
    
    public void lihatInfo(){
        System.out.println("Manajer         : " + this.getBagian());
        System.out.println("NIP             : " + this.getNip());
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Golongan        : " + this.getGolongan());
        System.out.println("Tunjangan       : Rp " + this.getTunjangan());
        System.out.println("Gaji            : Rp " + this.getGaji());
        System.out.println("Bagian          : " + this.getBagian());
        this.viewStaff();
    }
    
    @Override
    public double getGaji(){
        return super.getGaji() + tunjangan;
    }
}
