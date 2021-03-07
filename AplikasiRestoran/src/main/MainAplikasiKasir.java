/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Toping;


/**
 *
 * @author Akmal
 */
public class MainAplikasiKasir {
  
    public DaftarMenu daftarMenu;
    
    public static double PAJAK_PPH = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    
    public static void main(String[] args) {
        // Inisialisasi kelas Scanner untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Tambahan
        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;
        // end of tambahkan
        
        MainAplikasiKasir app = new MainAplikasiKasir();
        // tampilkan daftar Menu
        app.generateDaftarMenu();
        // mulai transaksi
        System.out.println("============ TRANSAKSI ============");
        
        // ambil data transaksi
        System.out.print("No Transaksi : ");
        no_transaksi = input.next();
        System.out.print("Pemesanan : ");
        nama_pemesan = input.next();
        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.print("Makan ditempat? [Y/N] ");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")) {
            System.out.println("Nomor Meja : ");
            no_meja = input.next();
        }
    }
    
    public void generateDaftarMenu() {
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Tomyam Spicy"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Rasa Indomie"));
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SFC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
        
        daftarMenu.tampilDaftarMenu();

    }
}
