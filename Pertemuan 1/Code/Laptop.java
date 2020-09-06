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
public class Laptop {
    
    private String merek;
    private String Cpu, Gpu, memori, penyimpanan;
    private String OS;
    private int Ram, ram, berat, layar;
    
    public void merekLaptop (String newValue){
        merek = newValue;
    }
    
    public void CpuLaptop (String newValue){
        Cpu = newValue;
    }
    
    public void GpuLaptop (String newValue){
        Gpu = newValue;
    }
    
    public void RamLaptop (int newValue){
        Ram = newValue;
    }
    
    public void tambahRam (int increment ){
        ram = Ram + increment;
    }
    
    public void tipeMemori (String newValue){
        memori = newValue;
    }
    
    public void tipePenyimpanan (String newValue){
        penyimpanan = newValue;
    }
    
    public void ukuranLayar (int newValue){
        layar = newValue;
    }
    
    public void Oslaptop (String newValue){
        OS = newValue;
    }
    
    public void beratLaptop (int newValue){
        berat = newValue;
    }
    
    public void cetakInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("CPU : " + Cpu);
        System.out.println("GPU : " + Gpu);
        System.out.println("RAM (GB): " + Ram);
        System.out.println("Tambah RAM (GB) : " + ram);
        System.out.println("Tipe Memori : " + memori);
        System.out.println("Tipe Penyimpanan : " + penyimpanan );
        System.out.println("Ukuran Layar (Inches) : " + layar);
        System.out.println("OS : " + OS);
        System.out.println("Berat : " + berat);
    }
    
}
