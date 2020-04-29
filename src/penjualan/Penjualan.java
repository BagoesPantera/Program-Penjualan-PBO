package penjualan;//nama package

import java.util.Scanner;//mengimport Scanner untuk menscan inputan dari user

public class Penjualan extends Barang{ // class penjualan yang di extends ke class barang
    public static void pilihan(){// method pilihan
        Scanner input = new Scanner (System.in);//inisiasi objek input ke Scanner
        System.out.println("=====================================");//mencetak =====
        System.out.println(" PAK PRAS SPORT & MUSIC ");//mencetak  PAK PRAS SPORT & MUSIC
        System.out.println("=====================================");//mencetak ====
        System.out.println("=====================================");//mencetak ==
        System.out.println(" BELANJA APA?");//mencetak BELANJA APA?
        System.out.println("1. Alat olahraga");//mencetak 1. Alat olahraga
        System.out.println("2. Alat Musik"); //mencetak 2. Alat Musik
        System.out.println("3. Keluar");//mencetak 3. Keluar
        System.out.print("Masukkan pilihan :");//mencetak Masukkan pilihan :
        Penjualan Barang = new Penjualan();//inisiasi objek Barang ke class Penjualan
        int pilih = input.nextInt(); //menbaca/menscan inputan berupa integer dari user
        switch(pilih){//membaca pemilihannya kalau int 1 akan masuk ke case 1 kalau int 2 akan masuk ke case 2. selain itu akan masuk ke default
            case 1: 
                Barang.olahraga();//memanggil method olahraga
                break;//menghentikan case
            case 2:
                Barang.musik(); //memanggil method musik
                break;//menghentikan case
            case 3:
                System.exit(0);//keluar dari program
                break;
            default:
                System.out.println("Pilihan tidak ada");//mencetak Pilihan tidak ada
        }
        
    }
    public static void main(String[] args) {// main method
    Penjualan panggil = new Penjualan();// inisiasi objek panggil 
    for(int i = 1;;i++){//pengulangan
        panggil.pilihan();//memanggil method pilihan 
    }
    }
}
