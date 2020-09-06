/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.berbasis.objek;

/**
 *
 * @author user
 */
public class WadahAir {
    
    private String jenis;
    private int volume, berat, isi;
    
    public void JenisWadah (String newValue){
        jenis = newValue;
    }
    
    public void volumeWadah (int newValue){
        volume = newValue;
    }
    
    public void tambahIsi (int increment){
        isi = isi + increment;
    }
    
    public void kurangIsi (int decrement){
        isi = isi - decrement;
    }
    
    public void tambahBerat (int increment){
        berat = berat + increment;
    }
    
    public void kurangBerat (int decrement){
        berat = berat - decrement;
    }
    
    public void cetakInfo(){
        System.out.println("Jenis : " + jenis);
        System.out.println("Volume : " + volume);
        System.out.println("Isi : " + isi);
        System.out.println("Berat : " + berat);
    }
}
