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
public class Pintu {

    private String bahanDasar;
    private String kunciPintu;
    private String pemasangan;
    private int panjang, lebar;
    private int berat;
    
    public void dasarBahan(String newValue){
        bahanDasar = newValue;
    }

    public void jenisKunciPintu(String newValue) {
        kunciPintu = newValue;
    }

    public void pengoperasian(String newValue) {
        pemasangan = newValue;
    }

    public void tambahPanjang(int increment) {
        panjang = panjang + increment;
    }

    public void tambahLebar(int increment) {
        lebar = lebar + increment;
    }

    public void tambahBerat(int increment) {
        berat = berat + increment;
    }

    public void cetakInfo() {
        System.out.println("Bahan Dasar : " + bahanDasar);
        System.out.println("Kunci Pintu : " + kunciPintu);
        System.out.println("Pemasangan : " + pemasangan);
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Berat : " + berat);
    }
}
