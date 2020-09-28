package Encapitulation.Model;

public class Wanita {

    private Manusia wanita;
    private Pria suami;
    private int umur;
    private String nama;
    private boolean dewasa = true;

    public Wanita() {
    }

    public Wanita(int umur, String nama, boolean dewasa, Pria suami) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
        this.suami = suami;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean getDewasa() {
        return dewasa;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }


    public Pria getSuami() {
        return suami;
    }

    public void setSuami(Pria suami) {
        this.suami = suami;
    }

    // public void setDewasa(boolean dewasa){
    //if(getUmur() >= 20){
    // dewasa = true;
    // System.out.println("Suami : " + this.suami);
    // } else {
    //  System.out.println("Wanita Ini Masih Kuliah");
    // }
    //  }
    public void info() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Dewasa : " + this.dewasa);
        System.out.println("Suami : " + this.getSuami());
    }
}
