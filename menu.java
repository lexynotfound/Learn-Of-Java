package menu;
import java.util.Scanner;
/* UTS 
Nama : Kurnia Raihan Ardian
    : 2122.01.0018
Sistem Informasi
*/

public class menu{

    public static void main(String[] args){
    
        try(Scanner key = new Scanner(System.in)) {
            //Deklarasi Variable
            String nama;
            int jumlah, menu, noMeja, nasi, mie, bakso, teh, esjeruk;
            //Definisi Variable atay nilai
            nasi = 15000;
            mie = 20000;
            bakso = 13000;
            teh = 10000;
            esjeruk = 5000;
            System.out.println("===================================================");
            System.out.print("Silahkan Masukkan Nama Anda : ");
            nama = key.nextLine();
            System.out.print("Silahkan Masukkan No Meja:  ");
            noMeja = key.nextInt();
            System.out.println("===================================================");
            System.out.println("Selamat Datang di Restoran Kurnia Raihan Family\n");
            do {
                System.out.println("===================================================");
                System.out.println("Menu Makanan");
                System.out.println("1. Nasi Goreng");
                System.out.println("2. Mie Ayam");
                System.out.println("3. Bakso");
                System.out.println("4. Teh Manis");
                System.out.println("5. Es Jeruk");
                System.out.println("6. Keluar");
                System.out.println("===================================================");
                System.out.print("Silahkan Pilih Menu : ");
                menu = key.nextInt();
                switch (menu) {
                    case 1:
                    System.out.println("===================================================");
                    System.out.println("Nama Pemesan :" + nama);
                    System.out.println("Pesanan : Nasi Goreng");
                    System.out.println("No Meja Anda Adalah : " + noMeja);
                        System.out.print("Masukkan Jumlah Nasi Goreng : ");
                        jumlah = key.nextInt();
                        System.out.println("Total Harga : " + (nasi * jumlah));
                        break;
                    case 2:
                    System.out.println("===================================================");
                    System.out.println("Nama Pemesan :" + nama);
                    System.out.println("Pesanan : Mie Ayam");
                    System.out.println("No Meja Anda Adalah : " + noMeja);
                        System.out.print("Masukkan Jumlah Mie Ayam : ");
                        jumlah = key.nextInt();
                        System.out.println("Total Harga : " + (mie * jumlah));
                        break;
                    case 3:
                    System.out.println("===================================================");
                    System.out.println("Nama Pemesan :" + nama);
                    System.out.println("Pesanan : Bakso");
                    System.out.println("No Meja Anda Adalah : " + noMeja);
                        System.out.print("Masukkan Jumlah Bakso : ");
                        jumlah = key.nextInt();
                        System.out.println("Total Harga : " + (bakso * jumlah));
                        break;
                    case 4:
                    System.out.println("===================================================");
                    System.out.println("Nama Pemesan :" + nama);
                    System.out.println("Pesanan : Teh Manis");
                    System.out.println("No Meja Anda Adalah : " + noMeja);
                        System.out.print("Masukkan Jumlah Teh Manis : ");
                        jumlah = key.nextInt();
                        System.out.println("Total Harga : " + (teh * jumlah));
                        break;
                    case 5:
                    System.out.println("===================================================");
                    System.out.println("Nama Pemesan :" + nama);
                    System.out.println("Pesanan : Es Jeruk");
                    System.out.println("No Meja Anda Adalah : " + noMeja);
                        System.out.print("Masukkan Jumlah Es Jeruk : ");
                        jumlah = key.nextInt();
                        System.out.println("Total Harga : " + (esjeruk * jumlah));
                        break;
                        default:
                        System.out.println("===================================================");
                        System.out.println("Terima Kasih Telah Berkunjung");
            }
        } while (menu != 6);
    }
    
    }   
}