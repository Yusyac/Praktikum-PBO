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
public class MataKuliah {
    private String kode;
    private String nama;
    private Mahasiswa mahasiswa;
    private Dosen dosen;
    private RuangKelas ruangKelas;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public RuangKelas getRuangKelas() {
        return ruangKelas;
    }

    public void setRuangKelas(RuangKelas ruangKelas) {
        this.ruangKelas = ruangKelas;
    }
    
    public void info(){
        System.out.println("Kode Mata Kuliah: " + this.kode);
        System.out.println("Nama Mata Kuliah: " + this.nama);
        System.out.println("Ruang Kelas");
        this.ruangKelas.info();
        System.out.println("Dosen Pengajar");
        this.dosen.info();
        System.out.println("Mahasiswa");
        this.mahasiswa.info();
    }
}
