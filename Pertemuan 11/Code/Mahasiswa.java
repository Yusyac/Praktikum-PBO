/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.Percobaan;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, Namaku " + this.nama);
        System.out.println("Aku Berkuliah Di Kampus");
    }
}
