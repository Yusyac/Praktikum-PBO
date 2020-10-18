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
public class Inheritance1 {
    
    public static void main(String[] args) {
        
        Manajer M = new Manajer();
        
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.dataManajer();
        
        Staff S = new Staff();
        
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.dataStaff();
        
        StaffTetap ST = new StaffTetap("Budi", "Malang", "LakiLaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.dataStaffTetap();
        
        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.dataStaffHarian();
                
    }
}
