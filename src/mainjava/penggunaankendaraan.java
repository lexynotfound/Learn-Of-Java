package mainjava;
import kendaraan.Bike;
public class penggunaankendaraan {

    public static void main(String[] args){
        System.out.println("Sepeda A");
        Bike sepeda=new Bike();
        Bike.make="Sepeda A";
        sepeda.move();
        sepeda.printDetail();
        System.out.println("Sepeda B");
        Bike motor=new Bike("l","aloy", "Radial", "swalloy","Sepeda B");
        motor.move();
        motor.printDetail();
    }
}