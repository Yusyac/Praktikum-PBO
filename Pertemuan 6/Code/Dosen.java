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
public class Dosen extends Pegawai{
    
    private int jumlahSKS;
    private  final int tarifSKS = 120000;
    
    public Dosen(){
        
    }
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    
    public int getSKS(){
        return this.jumlahSKS;
    }
    
    @Override
    public int getGaji(){
        int gaji = jumlahSKS * tarifSKS;
        return gaji + super.getGaji();
    }
}
