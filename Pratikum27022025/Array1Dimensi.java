/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum27022025;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Array1Dimensi {
    public static void main(String [] args){
        int A[],n,i;
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n]; //buat array ukuran n
        //mengisi array
        for(i=0;i<n;i++)
        {
            System.out.print("A["+i+"] = ");
            A[i] = in.nextInt();
        }
        int jumlah=0;
        //hitung jumlah dan rata-rata
        for(i=0;i<n;i++)
            jumlah=jumlah+A[i];
        //endfor
        float rata = (float)jumlah/n;
        //menentukan nilai terbesar dan terkecil versi 1
        System.out.println("Mencari nilai terbesar dan terkecil dengan perbandingan isi");
        int max = A[0];
        int min = A[0];
        for(i=1;i<n;i++){
            if (A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        //bagian pengulangan dan perbandingan disini:
        
        System.out.println("Nilai terbesar = "+max);
        System.out.println("Nilai terkecil = "+min);
        
        //menentukan nilai terbesar dan terkecil versi 2
        System.out.println("Mencari nilai terbesar dan terkecil dengan perbandingan index");
        int imax = 0;
        int imin = 0;
        for(i=1;i<n;i++){
            if (A[i]> A[imax]){
                imax=i;
            }
            if(A[i]< A[imin]){
                imin=i;
            }
        }
        
        System.out.println("Nilai terbesar = "+A[imax]+" Pada index ke-"+imax);
        System.out.println("Nilai terkecil = "+A[imin]+" Pada index ke-"+imin);
        
        //tampilkan isi array dan hasil perhitungan
        System.out.println("==Isi Array==");
        for(i=0;i<n;i++)
            System.out.print(A[i]+"\t");
        //endfor
        System.out.println("\nJumlah = "+jumlah);
        System.out.println("Rata-rata = "+rata);
    }
}
