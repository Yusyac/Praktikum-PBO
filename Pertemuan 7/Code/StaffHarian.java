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
public class StaffHarian extends Staff{
    
    public int jamKerja;
    
    public StaffHarian(){
        
    }
    
    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jamKerja ){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jamKerja = jamKerja;
    }
    
    public void dataStaffHarian(){
        System.out.println("-------------- Data Staff Harian -----------------");
        super.dataStaff();
        System.out.println("Jam Kerja           : " + jamKerja + " Jam ");
        System.out.println("Gaji Bersih         : Rp " + (gaji * jamKerja + lembur - potongan));
    }
}
