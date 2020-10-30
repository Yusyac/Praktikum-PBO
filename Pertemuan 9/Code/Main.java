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
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Program Testing Class Manajer & Staff");
        Manajer man[] = new Manajer[2];
        Staff st1[] = new Staff[2];
        Staff st2[] = new Staff[3];
        
        man[0] = new Manajer();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1] = new Manajer();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        st1[0] = new Staff();
        st1[0].setNama("Usman");
        st1[0].setNip("0003");
        st1[0].setGolongan("2");
        st1[0].setLembur(10);
        st1[0].setGajiLembur(10000);
        
        st1[1] = new Staff();
        st1[1].setNama("Anugrah");
        st1[1].setNip("0005");
        st1[1].setGolongan("2");
        st1[1].setLembur(10);
        st1[1].setGajiLembur(55000);
        man[0].setstaff(st1);
        
        st2[0] = new Staff();
        st2[0].setNama("Hendra");
        st2[0].setNip("0004");
        st2[0].setGolongan("3");
        st2[0].setLembur(15);
        st2[0].setGajiLembur(5500);
        
        st2[1] = new Staff();
        st2[1].setNama("Arie");
        st2[1].setNip("0006");
        st2[1].setGolongan("4");
        st2[1].setLembur(5);
        st2[1].setGajiLembur(100000);
        
        st2[2] = new Staff();
        st2[2].setNama("Mentari");
        st2[2].setNip("0007");
        st2[2].setGolongan("3");
        st2[2].setLembur(6);
        st2[2].setGajiLembur(20000);
        man[1].setstaff(st2);
        
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
