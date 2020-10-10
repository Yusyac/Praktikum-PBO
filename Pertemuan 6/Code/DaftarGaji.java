/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.Inheritance.Tugas;

/**
 *
 * @author USER
 */
public class DaftarGaji{
    
    private final Pegawai[] listPegawai;
    private int pegawai;
    
    public DaftarGaji(int pegawai){
        this.listPegawai = new Pegawai[pegawai];
    }
    
    public void addPegawai(Pegawai pegawai){
        listPegawai[this.pegawai] = pegawai;
        this.pegawai++;
    }
    
    public void printGaji(){
        for (int i = 0; i < this.pegawai; i++) {
            System.out.println(listPegawai[i].getNama() + " : Rp " + listPegawai[i].getGaji());
        }
    }
}
