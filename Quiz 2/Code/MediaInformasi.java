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
public class MediaInformasi implements Penerbit{

    public int jmlHalaman;
    private int tahunSekarang;
    
    public int getTahunSekarang(int tahun){
        return this.tahunSekarang = tahun;
    }
    
    public void setJumlahHalaman(int jml){
        this.jmlHalaman = jml;
    }
    
    @Override
    public void reputasi() {
        System.out.println("Penerbit Ini Bereputasi!");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit : " + alamat);
    } 

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit Ini Berdiri Sejak Tahun : " + tahun);
        System.out.println("Sekarang Penerbit Ini Berusia : " + (this.tahunSekarang - tahun) + "Tahun ");
    }
    
}
