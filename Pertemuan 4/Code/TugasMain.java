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
public class TugasMain {
    public static void main(String[] args){
        
            Mahasiswa mhs = new Mahasiswa(12345, "Odading");
            Dosen dsn = new Dosen(1234567, "Mang Oleh");
            RuangKelas kelas = new RuangKelas("L15A1");
            MataKuliah matkul = new MataKuliah("PBO", "Praktikum Pemograman Berbasis Objek");

            matkul.setMahasiswa(mhs);
            matkul.setDosen(dsn);
            matkul.setRuangKelas(kelas);
            matkul.info();
    }
}
