package Encapitulation.Model;

public class Pria {

    private Manusia pria;
    private Wanita istri;
    private int umur;
    private String nama;
    private boolean dewasa = true;

    public Pria() {
    }

    public Pria(int umur, String nama, boolean dewasa, Wanita istri) {
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
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

    public void setIstri(Wanita istri) {
        this.istri = istri;
    }

    public Wanita getIstri() {
        return istri;
    }

    //public void setDewasa(boolean dewasa){
    //if(getUmur() >= 22){
    //dewasa = true;
    // System.out.println("Istri : " + this.istri);
    //} else {
    // System.out.println("Pria Ini Masih Kuliah");
    //}
    // }
    public void info() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
        System.out.println("Dewasa : " + this.dewasa);
        System.out.println("Istri : " + this.getIstri());
    }
}
