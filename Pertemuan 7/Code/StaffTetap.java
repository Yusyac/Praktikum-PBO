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
public class StaffTetap extends Staff{
    
    public String golongan;
    public int asuransi;
    
    public StaffTetap(){
        
    }
    
    public StaffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void dataStaffTetap(){
        System.out.println("-------------- Data Staff Tetap -----------------");
        super.dataStaff();
        System.out.println("Golongan            : " + golongan);
        System.out.println("Jumlah Asuransi     : " + asuransi);
        System.out.println("Gaji Bersih         : Rp " + (gaji + lembur - potongan - asuransi));
    }
}
