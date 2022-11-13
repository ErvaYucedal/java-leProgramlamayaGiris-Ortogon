package TemelKavramlar;

public class Donguler {
    public static void main(String[] args) throws InterruptedException {
//WHILE
        // 0 dan 1000 e kadar olan sayilari listele
        int i=0;
        while (i<1000)
        {
            System.out.println(i);
            i++;
         //   Thread.sleep(10);

        }

        // FOR

        for (int j = 0; j < 1000; j++) {
            System.out.println(j);

        }


        // BREAK AND CONTINUE

        int x=0;
        while(++x<0){
            if (x==50) break;
            System.out.println(x);

        }

        x=0;
        while (++x<100){
            if(x==50) break;
            System.out.println(x);
        }
    }
}
