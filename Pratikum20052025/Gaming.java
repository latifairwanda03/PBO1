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
public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        
    }
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    public int getRefreshRate(){
        return refreshRate;
    }
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas RAM : "+super.getKapasitasRAM());
        System.out.println("Ukuran Layar : "+super.getUkuranLayar());
        System.out.println("Kartu Grafis : "+this.kartuGrafis);
        System.out.println("Refresh Rate : "+this.refreshRate);
    }
}

