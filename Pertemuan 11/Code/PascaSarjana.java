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
public class PascaSarjana extends Mahasiswa implements ICumLaude, IBerprestasi {

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa, Namaku " + super.nama);
        System.out.println("Aku Berkuliah Di Kampus");
    }

    @Override
    public void lulus() {
        System.out.println("Saya sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK Ku lebih dari 3.71");
    }

    @Override
    public void menjuaraiKompetensi() {
        System.out.println("Saya telah menjuarai kompetensi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
}
