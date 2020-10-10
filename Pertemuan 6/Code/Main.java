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
public class Main {
    public static void main(String[] args) {
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Parlan");
        
        Dosen d1 = new Dosen();
        d1.setNama("Sutiyo");
        d1.setSKS(10);
        
        DaftarGaji df = new DaftarGaji(5);
        df.addPegawai(p1);
        df.addPegawai(d1);
        df.printGaji();
    }
}
