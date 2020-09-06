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
public class MainDemo {
    
    public static void main(String[] args) {
        
        Pintu pnt1 = new Pintu();
        Pintu pnt2 = new Pintu();
        WadahAir air1 = new WadahAir();
        WadahAir air2 = new WadahAir();
        Jendela jndl = new Jendela();
        Laptop ltp1 = new Laptop();
        LaptopGaming ltp2 = new LaptopGaming();
        
        
        pnt1.dasarBahan("Kayu");
        pnt1.jenisKunciPintu("HandleSet");
        pnt1.pengoperasian("Engsel");
        pnt1.tambahPanjang(3);
        pnt1.tambahLebar(2);
        pnt1.tambahBerat(10);
        pnt1.cetakInfo();
        System.out.println();
        pnt2.dasarBahan("Kayu Dan Kaca");
        pnt2.jenisKunciPintu("Sliding Door Lock");
        pnt2.pengoperasian("Geser");
        pnt2.tambahPanjang(3);
        pnt2.tambahLebar(2);
        pnt2.tambahBerat(8);
        pnt2.cetakInfo();
        System.out.println();
        air1.JenisWadah("Botol");
        air1.volumeWadah(2);
        air1.tambahIsi(1);
        air1.tambahBerat(1);
        air1.cetakInfo();
        System.out.println();
        air2.JenisWadah("Galon");
        air2.volumeWadah(19);
        air2.tambahIsi(19);
        air2.tambahBerat(19);
        air2.cetakInfo();
        System.out.println();
        jndl.bahan("Kayu Dan Kaca");
        jndl.jenisJendela("Awning Windows");
        jndl.panjang1(2);
        jndl.lebar1(1);
        jndl.berat1(3);
        jndl.cetakInfo();
        System.out.println();
        ltp1.merekLaptop("Lenovo Yoga 900 13");
        ltp1.CpuLaptop("Intel Core i5");
        ltp1.GpuLaptop("Integrated Intel HD Graphic");
        ltp1.RamLaptop(8);
        ltp1.tipeMemori("DDR3L");
        ltp1.tipePenyimpanan("SSD");
        ltp1.ukuranLayar(14);
        ltp1.Oslaptop("Windows 10");
        ltp1.beratLaptop(1);
        ltp1.cetakInfo();
        System.out.println();
        ltp2.merekLaptop("ASUS TUF Gaming FX505DV");
        ltp2.CpuLaptop("AMD Ryzen 7 3750H");
        ltp2.GpuLaptop("AMD Radeon R2 Graphic");
        ltp2.VgaLaptop("NVIDIA GeForce RTX 2060");
        ltp2.RamLaptop(16);
        ltp2.tambahRam(16);
        ltp2.tipeMemori("DDR4");
        ltp2.tipePenyimpanan("HDD And SSD");
        ltp2.ukuranLayar(16);
        ltp2.Oslaptop("Windows 10");
        ltp2.beratLaptop(2);
        ltp2.cetakInfo();
    }
}
