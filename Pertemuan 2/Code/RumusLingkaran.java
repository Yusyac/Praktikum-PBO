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
public class RumusLingkaran {
    
    public double phi = 3.14;
    public double r;
    
    public double luasLingkaran(){
        return phi * r * r;
    }
    
   public double kelilingLingkaran(){
       return 2 * phi * r;
   }
}
