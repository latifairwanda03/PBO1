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
public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch(){
        
    }
    public int ukuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public boolean getUkuranAir(){
        return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    @Override
    public void display(){
        System.out.println("Kelas SmartWatch");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+super.getKapasitasBaterai()+" mAh");
        System.out.println("Jumlah Kamera : "+super.getJumlahKamera());
        System.out.println("Ukuran Layar : "+this.ukuranLayar);
        System.out.println("Tahan Air : "+this.tahanAir);
    }
}

