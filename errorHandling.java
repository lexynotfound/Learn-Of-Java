/* 
 * Kurnia Raihan Ardian 
 * 2122.01.0018
 * Sistem Informasi
 */
//Statement try-catch
public class errorHandling {
    public static void main(String[] args) {
       /*  int angka = 7;
        int hasil = angka / 0;
        System.out.println(hasil); */

        try {
           // pernyataan yang berpotensi mengakibatkan Exception
           int angka = 7;
           int hasil = angka / 0;
           System.out.println(hasil);
       } catch (ArithmeticException ex) {
           // pernyataan disini akan di eksekusi jika terjadi Exception
           System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
       }

       //Contoh Kasus Lainnya
       try {
           // pernyataan yang berpotensi mengakibatkan Exception
           String[] siswa = new String[2];
           siswa[0] = "Wildan";
           siswa[1] = "Ferdi";
           siswa[2] = "Taufiq";
           System.out.println(siswa[4]);
       } catch (ArrayIndexOutOfBoundsException ex) {
           // pernyataan disini akan di eksekusi jika terjadi Exception
           System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
       }

       // Multiple catch
       /*
        * Dalam bahasa pemrograman java, kita dapat menggunakan catch lebih dari satu,
        * untuk menangkap jenis exception yang berbeda pada pernyataan didalam try.
        * 
        * Pada contoh berikut ini, kita akan menggabungkan kedua program yang
        * sebelumnya sudah kita buat menjadi satu, didalam program tersebut kita akan
        * menangkap 2 jenis exception yang berbeda, yaitu ArithmeticException dan
        * ArrayIndexOutOfBoundsException.
        */
       try {
           String[] siswa = new String[2];
           siswa[0] = "Raihan";
           siswa[1] = "Eka";
           siswa[2] = "Jati";
           System.out.println(siswa[4]);
           // ====================================
           int angka = 7;
           int hasil = angka / 0;
           System.out.println(hasil);
       } catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
       } catch (ArithmeticException ex2) {
           System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
       }

       // Finally
       /*
        * Statement finally digunakan untuk mengeksekusi kode program jika terjadi
        * exception atau tidak terjadi exception, jadi blok kode didalamnya akan terus
        * di eksekusi pada kondisi apapun.
        */
       try {
           // pernyataan yang berpotensi mengakibatkan Exception
           int angka = 10;
           int hasil = angka / 0;
           System.out.println(hasil);
       } catch (ArithmeticException ex) {
           // pernyataan disini akan di eksekusi jika terjadi Exception
           System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
       } finally {
           /*
            * Pernyataan disini akan di eksekusi jika terjadi Exception
            * Ataupun tidak terjadi Exception
            */
           System.out.println("Program Diakhiri");
       }
    }
}
