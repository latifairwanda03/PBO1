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
public abstract class kendaraan {
    protected String merk;
    protected int tahun;
    
    public kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public void nyalakan(){
        System.out.println("Kendaraan dinyalakan.");
    }
    public void matikan(){
        System.out.println("Kendaraan dimatikan.");
}
    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
    
}
