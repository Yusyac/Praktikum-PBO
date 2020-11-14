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
public class Sarjana extends Mahasiswa implements ICumLaude, IBerprestasi{

    public Sarjana(String nama){
        super(nama);
    }
    
    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, Namaku " + super.nama);
        System.out.println("Aku Berkuliah Di Kampus");
    } 
    
    @Override
    public void lulus() {
        System.out.println("Aku Sudah Menyelesaikan Sripsi");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK Ku lebih dari 3.51");
    }

    @Override
    public void menjuaraiKompetensi() {
        System.out.println("Saya telah Menjuarai Kompetisi Nasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya Menerbitkan artikel di Jurnal Nasional");
    }
}
