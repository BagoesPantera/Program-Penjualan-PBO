package penjualan;//nama oackage

import java.util.Scanner;//mengimport scanner

public class Barang {//class barang
    int hargabrg;//membuat integer hargabrg
    int musik;//membuat integer musik
    int jumlah;//membuat integer jumlah
    public static void olahraga(){//method olahraga
        Scanner inputdiol = new Scanner(System.in);//inisiasi objek inputdiol ke Scanner
        System.out.println("Pilih Alat Olahraga");//mencetak Pilih Alat Olahraga
        System.out.println("======================");//mencetak =========
        System.out.println("1.Sepatu bola"); //mencetak 1.Sepatu bola
        System.out.println("2.Jaket bola"); //mencetak 2.Jaket bola
        System.out.println("3.Baju bola"); //mencetak 3.Baju bola
        System.out.println("4.Pelindung Betis");//mencetak 4.Pelindung Betis
        System.out.print("Masukkan pilihan :");//mencetak Masukkan pilihan :
        int pilih1=inputdiol.nextInt(); //menscan pilihan dari user
        switch(pilih1){//membaca pilihan dari user 
            case 1:
                Barang sepatubola=new Barang();//inisiasi objek sepatu bola
                sepatubola.altolahraga(600000);//memanggil method altolahraga yang berisikan int
                break;//menghentikan case
            case 2:
                Barang jaketbola=new Barang();
                jaketbola.altolahraga(400000); 
                break;
            case 3:
                Barang bajubola=new Barang();
                bajubola.altolahraga(350000); 
                break;
            case 4:
                Barang pelindungbetis=new Barang();
                pelindungbetis.altolahraga(50000);
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
    public static void musik(){//method musik
        Scanner	inputdimsk = new Scanner(System.in);//inisiasi objek inputdimsk ke Scanner
        System.out.println("======================");//mencetak =======
        System.out.println("Pilih Alat Musik ");//mencetak Pilih Alat Musik
        System.out.println("======================");//mencetak ============
        System.out.println("1.Gitar"); //mencetak 1.Gitar
        System.out.println("2.Drum"); //mencetak 2.Drum
        System.out.println("3.Bass"); //mencetak 3.Bass
        System.out.println("4.Keyboard"); //mencetak 4.Keyboard
        System.out.println("5.Saxophone"); //mencetak 5.Saxophone
        System.out.print("Masukkan pilihan :");//mencetak Masukkan pilihan :
        int pilih2=inputdimsk.nextInt(); //membaca inputan user
        switch(pilih2){//membaca pilihan
            case 1:
            Barang gitar=new Barang();//inisiasi objek gitar di class Barang
            gitar.altmusik(800000,1); //memanggil method altmusik dengan 2 parameter
            break;//menghentikan case
            case 2:
            Barang drum=new Barang();
            drum.altmusik(12000000,1); 
            break;
            case 3:
            Barang bass=new Barang();
            bass.altmusik(2500000,1); 
            break;
            case 4:
            Barang keyboard=new Barang();
            keyboard.altmusik(4000000,1); 
            break;
            case 5:
            Barang saxophone=new Barang();
            saxophone.altmusik(5500000,1); 
            break;
            default:
            System.out.println("Pilihan tidak ada");
            break;
        }
    }    
    void altolahraga(int hargabrg){//void altolahraga dengan parameter hargabrg
        int jumlahbrgolrg;//membuat variabel jumlahbrgolrg tipe data integer
        Scanner inputaltol = new Scanner(System.in);//inisiasi inputaltol ke Scanner
        System.out.print("jumlah barang");//mencetak jumlah barang
        int jumlahbrg = inputaltol.nextInt();//membaca inputan user   
        jumlahbrgolrg = jumlahbrg * hargabrg; //menghitung jumlahbrgolrg
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");//mencetak >>>>>>>
        System.out.println("Harga Bayar : "+jumlahbrgolrg);//mencetak hargabayar dan hasil hitung jumlahbrgolrg
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");//mencetak >>>>>>>>>>
    }
    void altmusik(int jumlah, int musik){//void altmusik dengan parameter jumlah dan musik
        int jumlahbrgmsk;//membuat variabel jumlahbrgmsk bertipedata integer
        Scanner inputaltmsk = new Scanner(System.in); //inisiasi objek inputaltmsk ke SCanner
        System.out.print("Jumlah barang:");//meencetak Jumlah barang:
        int jmlbrg=inputaltmsk.nextInt(); // membaca inputan dari user
        jumlahbrgmsk=(jmlbrg*musik*jumlah);//menghitung nilai dari variabel jumlahbrgmsk
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");//mencetak>>>>>>>>>>>>>
        System.out.println("Harga Bayar	: "+jumlahbrgmsk);//mencetak harga bayar dan nilai dari variabel jumlahbrgmsk
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");//mencetak >>>>>>>>>>>>>>>>>>>>>>>
    }
}