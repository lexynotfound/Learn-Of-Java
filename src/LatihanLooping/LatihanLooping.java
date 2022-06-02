package LatihanLooping;
import java.util.Random;

public class LatihanLooping{
    public static void main(String[] args){
        //for loop
        //printPrima(30);
        //while do
        //printHello(1);
        //do while
        //inputPassword();
        Random r=new Random();
        int i;
        float x;
        for(i=0;i<=20;i++){
            x=r.nextFloat();
            System.out.println(x);
        }
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
