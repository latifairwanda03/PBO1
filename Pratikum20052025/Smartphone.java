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
public class Smartphone extends Elektronik{
    int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone(){
        
    }
    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    @Override
    public void display(){
        System.out.println("Kelas Smartphone");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+this.kapasitasBaterai +" mAh");
        System.out.println("Jumlah Kamera : "+this.jumlahKamera);
    }
}
