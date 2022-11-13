package ClassesAndObjects;

public class MainClass2 {

    public static void main(String[] args) {

        Araba araba1= new Araba("kirmizi",5,true);

        Araba araba2=araba1;

        //compiler error
        //araba1.kapasite=3;
        //araba2.renk="beyaz";
         araba1.bilgiAl();
         araba2.bilgiAl();



    }
}
