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
public class Buku extends MediaInformasi{
    
    @Override
    public void setJumlahHalaman(int jml){
        this.jmlHalaman = jml;
        System.out.println("Buku Ini Memiliki : " + this.jmlHalaman + "Halaman ");
        System.out.println("Jika Di hitung Dengan Covernya : " + (this.jmlHalaman + 4) + "Halaman ");
    }
    @Override
    public void reputasi() {
        System.out.println("Penerbit Buku Ini Bereputasi!");
    }
}
