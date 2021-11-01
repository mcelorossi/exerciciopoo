package exercicio02;

public class Exercicio_02 {
    public static void main(String[] args) {
        for(int x = -100; x < 100; x++) {
            for (int y = -100; y < 100; y++) {
                if (x + y == 100 || x + y == -100) {
                    System.out.println("X = " + x + " e Y = " + y);
                }
            }
        }
    }
}
