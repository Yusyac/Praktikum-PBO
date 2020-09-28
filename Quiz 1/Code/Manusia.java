package Encapitulation.Model;

public class Manusia {

   private int umur;
    private String nama;
    private boolean dewasa = true;
    
    public Manusia(){
    }
    
    public Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public boolean getDewasa(){
        return dewasa;
    }
    
   public void setDewasa(boolean dewasa){
       this.dewasa = dewasa;
   }

    
    public void info(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Dewasa : " + this.dewasa);
    }
}