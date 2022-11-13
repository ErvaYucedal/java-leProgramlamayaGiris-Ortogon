package TemelKavramlar;

public class TipDonusum {

    public static void main(String[] args) {

        // imlicit cast

        long sonuc=234 + 566;

        int x1=344;
        int x2=656;
        double sonuc2=x1+x2;

        // explicit cast
        double d1=344.322;
        double d2= 433.344;

        int sonuc3=(int)d1+(int)d2;

        //Yuvarlama gerekirse
        //Math.floor(a) --> asagi yuvarlama
        //Math.ceil(a)--> yukari yuvarlama

        byte b1=23+45;

        //compiler error
        //byte b2= 23+ 250;

        byte b3=32;
        byte b4=34;

        byte byteToplam=(byte)(b3+b4);
        System.out.println(byteToplam);

        short s1=2334;
        short s2=4555;
        // casting olmazsa compiler error
        // short shortSonuc= s1+ s2;

     //   short shortSonuc=s1/2;


    }
}
