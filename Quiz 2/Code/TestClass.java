/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.Quiz.Quiz2;

/**
 *
 * @author USER
 */
public class TestClass {
    
    public static void proses(MediaInformasi med){
        if(med instanceof Majalah){
            System.out.println("Majalah Adalah Media Informasi!");
        } else if (med instanceof Buku){
            System.out.println("Buku Adalah Media Informasi!");
        }
    }
    
    public static void main(String[] args) {
        Majalah maj =new Majalah();
        Buku buk = new Buku();
        proses(maj);
        proses(buk);
        
        MediaInformasi medMaj = new Majalah();
        medMaj.setJumlahHalaman(46);
        medMaj.reputasi();
        medMaj.alamatPenerbit("Malang");
        int tahunSekarang = medMaj.getTahunSekarang(2020);
        medMaj.tahunBerdiri(1995);
        
        MediaInformasi medBuk = new Buku();
        medBuk.setJumlahHalaman(340);
        medBuk.reputasi();
        medBuk.alamatPenerbit("Surabaya");
        medBuk.getTahunSekarang(2030);
        medBuk.tahunBerdiri(1978);
        
    }
}
