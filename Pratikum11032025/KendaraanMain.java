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
import java.util.Scanner;
public class KendaraanMain {
    public static void main(String[] args){
        //TODO cod eapplication logic here
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        int knd;
        
        System.out.print("Masukkan jenis kendaraan = ");
                jenis=in.nextLine();
        System.out.println("Masukkan merk kendaraan = ");
                merk=in.nextLine();
        System.out.print("Tahun keluaran = ");
                tahun=in.nextInt();
            in.nextLine();//untuk membersihkan
        System.out.print("Masukkan warna kendaraan = ");
                warna=in.nextLine();
         System.out.print("Harga sewa kendaraan = ");
                harga=in.nextInt();
         System.out.print("Kecepatan kendaraan / jam= ");
        int Knd = in.nextInt();
                
                
        //objek baru -- class Kendaraan 
        Kendaraan kend=new Kendaraan (jenis,merk,tahun,warna);
        kend.InfoKendaraan();
        kend.cekHarga(harga);
        kend.CekKendaraan(Knd);
        
    }
}
