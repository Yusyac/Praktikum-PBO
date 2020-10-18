/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inheritance.Tugas;

/**
 *
 * @author USER
 */
public class PC extends Komputer {
     public int ukuranMonitor;

    public PC(){

    }
    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("-------------------- PC -------------------------");
        super.tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor + " inch");
    }
}
