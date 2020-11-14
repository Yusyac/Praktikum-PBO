/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.Tugas;

/**
 *
 * @author USER
 */
public class Singa extends Binatang implements IKarnivora{
    
    private String suara;
    private String warnaBulu;
    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Jenis   : Karnivora");
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan : Daging");
    }
    
    public void displayData(){
        System.out.println("Nama    : " + getNama());
        System.out.println("Jumlah Kaki : " + getKaki());
        System.out.println("Suara   : " + this.suara);
        System.out.println("Warna Bulu  : " + this.warnaBulu);
    }
}
