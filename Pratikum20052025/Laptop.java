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
public class Laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas RAM : "+this.kapasitasRAM +" gb");
        System.out.println("Ukuran Layar : "+this.ukuranLayar +" inchi"); 
    }
}

