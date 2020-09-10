/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videogame;

/**
 *
 * @author user
 */
public class Barang {
    public static void main(String[] args) {
        ClassBarang brg = new ClassBarang();
        ClassBarang brg1 = new ClassBarang();
        
        brg.kode = "101";
        brg.namaBarang = "Adidas Football Shoes";
        brg.hargaDasar = 1500000;
        brg.diskon = 10;
        brg.hitungHargaJual();
        brg.tampilData();
        
        brg1.kode = "102";
        brg1.namaBarang = "Nike Football Shoes";
        brg1.diskon = 15;
        brg1.hargaDasar = 1800000;
        brg1.hitungHargaJual();
        brg1.tampilData();
    }
}
