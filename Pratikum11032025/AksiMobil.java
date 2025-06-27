/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum11032025;

/**
 *
 * @author Lenovo
 */
public class AksiMobil {
    public static void main(String[] args){
        //TODO code applicatiion logic here
        //buat object baru
        Mobil mobilku=new Mobil ();
        Mobil mobilkedua=new Mobil ();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="Hitam";
        System.out.println("------------------");
        System.out.println("Data mobil 1");
        System.out.println("Merk mobil = "+mobilku.merk);
        System.out.println("Plat mobil = "+mobilku.plat);
        System.out.println("Tahun keluaran = "+mobilku.tahun);
        System.out.println("Warna mobil = "+mobilku.warna);
        //pemanggil method
        mobilku.MobilAktif(); //tanpa return
        System.out.println(mobilku.SuaraMobil());//return
        
       
        mobilkedua.merk="Avanza";
        mobilkedua.plat="BA 1011 L";
        mobilkedua.tahun=2006;
        mobilkedua.warna="White";
        System.out.println("------------------");
        System.out.println("Data mobil 2");
        System.out.println("Merk mobil = "+mobilku.merk);
        System.out.println("Plat mobil = "+mobilku.plat);
        System.out.println("Tahun keluaran = "+mobilku.tahun);
        System.out.println("Warna mobil = "+mobilku.warna);
        //pemanggilan method
        
        
       
    }
    
}
