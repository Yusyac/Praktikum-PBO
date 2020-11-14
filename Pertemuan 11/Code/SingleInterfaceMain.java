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

public class SingleInterfaceMain {
    
    public static void main(String[] args) {
        Rektor rektor = new Rektor();
        
        Mahasiswa mhs = new Mahasiswa("Charlie");
        Sarjana sarjanaCumLaude = new Sarjana("Dini");
        PascaSarjana masterCumLaude = new PascaSarjana("Elok");
        
        rektor.beriSertifikatCumLaude(sarjanaCumLaude);
        rektor.beriSertifikatCumLaude(masterCumLaude);
    }
}
