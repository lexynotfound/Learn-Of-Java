/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author raiha
 */
public class LearnLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //for loop
        //printPrima(30);
        //while do
        //printHello(1);
        //do while
        inputPassword();
    }
    static void printPrima(int max){
            if (max >=2){
                System.out.println("2");
                for (int i=3;i<=max;i++){
                System.out.println(","+1);
                }
            }
        }
        int countFactor(int a){
            int count=0;
            for(int i=1;i<=a;i++){
                if (a%i==0){
                    count++;
                }
            }
            return count;
        }
        static void printHello(int jumlah){
            while(jumlah<=100){
                System.out.println("Hellow");
                jumlah++;
            }
        }
        static void getFactorial(){
            int n=91;
            int factor=2;
            while(n%factor!=0){
                factor++;
            }
            System.out.println("faktorial " +factor);
        }
        static  void inputPassword(){
            String phrase="tes";
            do{
                System.out.println("Input Password");
            } while(!phrase.equals("tes"));
        }
}
