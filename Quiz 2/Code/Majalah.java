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
public class Majalah extends MediaInformasi{

    @Override
    public void setJumlahHalaman(int jml){
        this.jmlHalaman = jml;
        System.out.println("Majalah Ini Memiliki : " + this.jmlHalaman + "Halaman ");
        System.out.println("Jika Di hitung Dengan Covernya : " + (this.jmlHalaman + 2) + "Halaman ");
    } 
    @Override
    public void reputasi() {
        System.out.println("Penerbit Majalah Ini Bereputasi!");
    }

}
