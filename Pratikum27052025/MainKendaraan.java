/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum27052025;

/**
 *
 * @author Lenovo
 */
public class MainKendaraan {
    public static void main(String[] args){
        mobill mobil = new mobill("Toyota Avanza", 2022, 4, "Automatic");
        motor motor = new motor("Yamaha NMAX", 2023, "Full Face", 155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
    }
}
