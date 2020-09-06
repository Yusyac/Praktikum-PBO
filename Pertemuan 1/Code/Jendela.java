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
public class Jendela {
    
    private String jenis, dasarBahan;
    private int panjang, lebar, berat;
    
    public void bahan (String newValue){
        dasarBahan = newValue;
    }
    
    public void jenisJendela (String newValue){
        jenis = newValue;
    }
    
    public void panjang1 (int newValue){
        panjang = newValue;
    }
    
    public void lebar1 (int newValue){
        lebar = newValue;
    }
    
    public void berat1 (int newValue){
        berat = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Jenis : " + jenis);
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Berat : " + berat);
                
    }
}
