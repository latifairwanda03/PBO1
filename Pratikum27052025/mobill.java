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
public class mobill extends kendaraan {
    private int jumlahPintu;
    private String transmisi;

    public mobill(String merk, int tahun, int jumlahPintu, String transmisi) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getTransmisi(){
        return transmisi;
    }
    
    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }

    @Override
    public void nyalakan() {
        System.out.println("Mobil " + merk + " dinyalakan dengan ");
    }

    @Override
    public void matikan() {
        System.out.println("Mobil " + merk + " dimatikan. ");
    }

    @Override
    public void info() {
        System.out.println("Mobil " + merk + ", Tahun " + tahun + jumlahPintu + " Pintu, Transmisi: " + transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa oli, rem, dan tekanan ban mobil " + merk + ".");
    }

    @Override
    public void servis() {
        System.out.println("Mobil " + merk + " dijadwalkan servis setiap 10.000 km. ");
    }
}