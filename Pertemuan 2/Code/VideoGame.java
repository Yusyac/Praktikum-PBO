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
public class VideoGame{
    
    public int game;
    public int harga;
    public int lamaSewa;
    public String id;
    public String nama;
    public String member;
    
    public int transaksi(){
        return harga * lamaSewa;
    }
}
