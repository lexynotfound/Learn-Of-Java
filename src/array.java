public class array
{
public static void main (String args[])
{
        //Deklarasi array 2 dimensi
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"},        
        };

        //Menampilkan isi array dengan perulangan
        for (int i=5;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+" ");
            }
            System.out.println();
        }
    }
}