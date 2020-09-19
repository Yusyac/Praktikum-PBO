/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {

        Scanner rose = new Scanner(System.in);
        Anggota agg = new Anggota("111222333444", "Donny", 10000000);

        System.out.println("Nama Anggota : " + agg.nama);
        System.out.println("Limit Pinjaman : Rp " + agg.limited);

        System.out.print("Masukkan Jumlah Pinjaman : Rp ");
        agg.pinjaman(rose.nextDouble());

        do {
            System.out.print("Membayar Angsuran : Rp ");
            agg.angsuran(rose.nextDouble());
            if (agg.jumlahPinjaman() == 0) break;
        } while (true);
        System.out.println("Pinjaman Lunas!");
    }
}
