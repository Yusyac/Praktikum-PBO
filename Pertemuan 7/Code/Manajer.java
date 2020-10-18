/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inheritance.Percobaan;

/**
 *
 * @author USER
 */
public class Manajer extends Karyawan{
    
    public int tunjangan;
    
    public Manajer(){
        
    }
    
    public void dataManajer(){
        System.out.println("---------------- Data Manajer -------------------");
        super.dataKaryawan();
        System.out.println("Tunjangan           : Rp " + tunjangan);
        System.out.println("Total Gaji          : Rp " + (super.gaji + tunjangan));
    }
}
