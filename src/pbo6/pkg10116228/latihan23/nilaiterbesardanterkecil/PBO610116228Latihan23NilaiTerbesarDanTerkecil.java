/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 10116228
 * Deskripsi Program: Program ini berisi program yang menampilkan nilai terbesar
 * dan terkecil dari nilai mahasiswa
 */
public class PBO610116228Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;

        System.out.println("===program nilai terbesar dan "
                + "terkecil Nilai mahasiswa===");
        System.out.println("Masukkan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.println("Masukkan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int [nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.println("Masukkan Nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            
        }
        int max = 0;
        for (int val : nilai) {
            if ( max < val){
                max = val;
            }
    }
        System.out.println("Nilai terbesar adalah " + max);
        
        int min = nilai[0];
        for (int val : nilai) {
            if(val < min) { 
                min = val;
            }
    
        }
        System.out.println("nilai terkecil adalah " + min);
        System.out.println("Petugas : " + Nama);
        
    }
    
}
