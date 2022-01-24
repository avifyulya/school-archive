/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan_buku_bekas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Penjualan_buku_bekas {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //judul
        System.out.println("==========================================");
        System.out.print("==============");
        System.out.print("DATA TOKO BUKU");
        System.out.println("==============");
        System.out.println("==========================================");
        //inti
        System.out.print("----");
        System.out.print("Keterangan Cabang Toko Buku");
        System.out.println("----");
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Cabang : ");
        int jumlah_cabang = input.nextInt();
        int a;
        for (a = 1; a <= jumlah_cabang; a++) {
            System.out.println("Keterangan " + a);
            Scanner data = new Scanner(System.in);
            System.out.print("Cabang Toko : ");
            String cabang_toko = data.nextLine();
            System.out.print("Alamat : ");
            String alamat = data.nextLine();
            System.out.print("Data buku yang akan diinput di cabang " + cabang_toko + " : ");
            int jumlahdatabukuyangakandiinput = input.nextInt();
            //data buku
            int b;
            for (b = 1; b <= jumlahdatabukuyangakandiinput; b++) {
                System.out.print("======");
                System.out.print("Data Buku " + b);
                System.out.println("======");
                String buku;
                int harga_awal, harga_bekas, jumlah_buku;
                System.out.print("Nama Buku : ");
                buku = input.next();
                System.out.print("Harga Awal : ");
                harga_awal = input.nextInt();
                System.out.print("Harga Bekas : ");
                harga_bekas = input.nextInt();
                System.out.print("Jumlah Buku yang terjual : ");
                jumlah_buku = input.nextInt();
                if (harga_awal < harga_bekas) {
                    int untung;
                    untung = jumlah_buku * harga_bekas - jumlah_buku * harga_awal;
                    System.out.println("Untung yang didapat : " + untung);
                } else if (harga_awal > harga_bekas) {
                    int rugi;
                    rugi = jumlah_buku * harga_awal - jumlah_buku * harga_bekas;
                    System.out.println("Rugi yang didapat : " + rugi);
                } else {
                    System.out.println("Invalid");
                }
            }
            //penutup
            System.out.println("===========");
            System.out.print("==");
            System.out.print("Selesai");
            System.out.println("==");
            System.out.println("===========");
            System.out.println("TERIMA KASIH KAMI UCAPKAN DARI CABANG " + cabang_toko);
        }
    }
}
