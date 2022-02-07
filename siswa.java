/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class siswa {
    Scanner input = new Scanner(System.in);
    String nama,kelas,mata_pelajaran;
    int nomor_absen, nilai;
    void data(){
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Kelas : ");
        kelas = input.nextLine();
        System.out.print("Nomor Absen : ");
        nomor_absen = input.nextInt();
        System.out.print("Mata Pelajaran : ");
        mata_pelajaran = input.next();
        System.out.print("Masukkan Rata-rata nilai rapor semeseter 1-5 : ");
        nilai = input.nextInt();
        if(nilai>=75){
            System.out.println("Selamat Anda Lulus dalam mata pelajaran "+mata_pelajaran);
        } else{
            System.out.println("Maaf Anda Harus Mengulang Pembelajaran atau Tidak Lulus");
        }
        
    }
    
}
