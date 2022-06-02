package kendaraan;
public class Bike {

        private String handlerBars;
        private String frame, tyres, seatType;
        public static String make;

        //constructor
        public Bike(){
            this.make="Cycles";
        }
        public Bike(String handle, String frame, String tyres, String seat, String nama){
            this.frame=frame;
            this.tyres=tyres;
            this.handlerBars=handle;
            seatType=seat;
            this.make=nama;
        }

        public void printDetail() {
            System.out.println(this.make+"\n"+"this bike"+this.frame+ "tyres"+ this.tyres+ "\n"+ "with handle"+this.handlerBars);
        }


        public void move(){
            System.out.println("Bisa Maju");
        }
}