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
public class MutipleInterfaceMain {
    
    public static void main(String[] args) {
        Rektor rektor = new Rektor();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        rektor.beriSertifikatMawapres(sarjanaCum);
        rektor.beriSertifikatMawapres(masterCum);
    }
}
