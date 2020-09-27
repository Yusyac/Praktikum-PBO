/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.Relasi.Jurusan;

/**
 *
 * @author Personal User
 */
public class Mahasiswa {
    private int nim;
    private String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public int getNim() {
        return nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void info(){
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
    }
}
