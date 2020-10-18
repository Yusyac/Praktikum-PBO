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
public class Staff extends Karyawan{
    
    public int lembur, potongan;
    
    public Staff(){
        
    }
    
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void dataStaff(){
        System.out.println("----------------- Data Staff --------------------");
        super.dataKaryawan();
        System.out.println("Lembur              : Rp " + lembur);
        System.out.println("Potongan            : Rp " + potongan);
        System.out.println("Total Gaji          : Rp " + (gaji + lembur - potongan));
    }
}
