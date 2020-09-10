/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videogame;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Transaksi {
    public static void main(String[] args) {
        Scanner rose = new Scanner(System.in);
        VideoGame vg = new VideoGame();
        
        System.out.println("=================================================");
        System.out.println("=                 DAFTAR GAME                   =");
        System.out.println("=================================================");
        System.out.println("= 1. Medal Of Honor V   Rp. 10000               =");
        System.out.println("= 2. Black              Rp. 15000               =");
        System.out.println("= 3. NFS Most Wanted    Rp. 15000               =");
        System.out.println("=================================================");
        
        System.out.println("=================================================");
        System.out.println("=           Formulir Peminjaman Game            =");
        System.out.println("=================================================");
        System.out.print("= ID : ");
        vg.id = rose.next();
        System.out.print("= Nama : ");
        vg.nama = rose.next();
        System.out.print("= Member : ");
        vg.member = rose.next();
        System.out.print("= Game : " );
        vg.game = rose.nextInt();
        switch (vg.game) {
            case 1:
                System.out.println("Medal Of Honor");
                vg.harga = 10000;
                break;
            case 2:
                System.out.println("Black");
                vg.harga = 15000;
                break;
            default:
                System.out.println("NFS Most Wanted");
                vg.harga = 15000;
                break;
        }
        System.out.println("= Harga : " + vg.harga);
        System.out.print("= Lama Sewa (Hari) : ");
        vg.lamaSewa = rose.nextInt();
        System.out.println("=================================================");
        
        System.out.println("=================================================");
        System.out.println("=               BUKTI TRANSAKSI                 =");
        System.out.println("=================================================");
        System.out.println("= ID : " + vg.id                                  );
        System.out.println("= Nama : " + vg.nama                              );
        System.out.println("= Game : " + vg.game                          );
        System.out.println("= Harga : " + vg.harga                            );
        System.out.println("= Lama Sewa : " + vg.lamaSewa                     );
        System.out.println("= Total Harga : Harga X Lama Sewa               =");
        System.out.println("= Total Harga : " + vg.transaksi()                );
        System.out.println("=================================================");
               
                        
    }
}
