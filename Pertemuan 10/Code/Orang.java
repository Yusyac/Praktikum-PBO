/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.percobaan.Abstract;

/**
 *
 * @author USER
 */
public class Orang {
    
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama){
        this.nama = nama;
    }
    
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("------------------------------------------------");
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Pe;iharaanku Berjalan Dengan Cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------------");
    }
}
