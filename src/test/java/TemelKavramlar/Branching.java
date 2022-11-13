package TemelKavramlar;

public class Branching {

    public static void main(String[] args) {

        disifade:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                if (j<30){
                    System.out.println("i: " + i + " --j: " + j);
                } else {
                    break disifade;
                }

            }

        }
    }
}
