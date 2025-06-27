/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum20052025;

/**
 *
 * @author Lenovo
 */
public class TestPolymorphism {
    public static void main(String[]args){
        //objek biasa
        Elektronik barang1 = new Elektronik();
        barang1.setMerek("Samsung");
        barang1.setTahunProduksi(2025);
        barang1.setGaransi(2);
        barang1.display();
        System.out.println("");
        
        SmartWatch barang2 = new SmartWatch();
        barang2.setMerek("Samsung");
        barang2.setTahunProduksi(2024);
        barang2.setGaransi(2);
        barang2.setKapasitasBaterai(100);
        barang2.setJumlahKamera(1);
        barang2.setUkuranLayar(10);
        barang2.setTahanAir(true);
        barang2.display();
        System.out.println("");
        
        //polymorphism
        Elektronik barang3 = new Laptop();
        barang3.setMerek("HP");
        barang3.setTahunProduksi(2025);
        barang3.setGaransi(2);
        barang3.setMerek("Samsung");
        ((Laptop)barang3).setKapasitasRAM(14);
        ((Laptop)barang3).setUkuranLayar(32);
        barang3.display();
        System.out.println("");
        
        Smartphone barang4 = new SmartWatch();
        barang4.setMerek("Apple");
        barang4.setTahunProduksi(2024);
        barang4.setGaransi(3);
        barang4.setKapasitasBaterai(100);
        barang4.setJumlahKamera(1);
        ((SmartWatch)barang4).setUkuranLayar(1500);
        ((SmartWatch)barang4).setTahanAir(true);
        barang4.display();
        System.out.println("");
    }
}


