package TemelKavramlar;

public class Operatorler {

    public static void main(String[] args) {

        //operatorler

        int sayi1=1234;
        int sayi2=2344;
        int toplam=sayi1+sayi2;
        System.out.println(toplam);
        System.out.println(sayi1+sayi2);
        int buyukSayi=234234;
        int kalan=buyukSayi%23;
        System.out.println(kalan);

        int bolunen=344;
        int bolen=3;
        int bolum=bolunen/bolen;
        System.out.println(bolum);

        int islem=(23344+355)*23/2;
        System.out.println(islem);

        //kisa operatorler(shorthand operators)
        int x=2;
        int y=x++;
        int z=--x;
        System.out.println("x:" + x );
        System.out.println("y:" + y );
        System.out.println("z:" + z );

        //kendine ekleme
        x+=23; // x'in degerine 23 eklenir

        String yazi="ali topu at";
        yazi +=12+23;
        System.out.println(yazi);

        // asagida toplama gerceklesmez
        System.out.println("ali topu at" + 223+34);


        // asagida toplama gerceklesir
        System.out.println("ali topu at" + (223+34));
    }
}
