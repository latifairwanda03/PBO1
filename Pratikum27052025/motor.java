/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum27052025;

/**
 *
 * @author user
 */
public class motor extends kendaraan{
    private String jenisHelm;
    private int cc;
    
    public motor(String merk, int tahun, String jenisHelm, int par1){
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    
    public String getJenisHelm(){
        return jenisHelm;
    }
    
    public void setjenisHelm(String jenisHelm){
        this.jenisHelm = jenisHelm;
    }
    
    public int getCc(){
        return cc;
    }
    
    public void setCc(int cc){
        this.cc = cc;
    }
    
    public void nyalakan(){
        String merk = null;
        System.out.println("Motor " + merk + " dinyalakan dengan kunci");
    }
    
    public void matikan(){
        String merk = null;
        System.out.println("Mobil " + merk + " dimatikan.");
    }

    public void info(){
        String merk = null;
        String tahun = null;
        System.out.println("Motor "+ merk + ", Tahun " + tahun + ", " + "CC: " + cc + ", helm: " + jenisHelm);
    }

    public void periksaKondisi() {
        System.out.println("Periksa rantai, oli mesin, dan rem");
    }

    public void servis() {
        String merk = null;
        System.out.println("Mobil " + merk + " perlu servis rutin");
    }
}