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
public class Rektor {
    
    public void beriSertifikatCumLaude(ICumLaude mahasiswa){
        System.out.println("Saya Rektor, Memberikan Sertifikat CumLaude.");
        System.out.println("Silahkan Perkenalkan Diri Anda.");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("-------------------------------------------------");        
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya Rektor, Memberikan sertifikat Mawapres");
        System.out.println("Selamat!, Bagaimana Anda bisa Berprestasi?");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.menjuaraiKompetensi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("-------------------------------------------------");
    }
}
