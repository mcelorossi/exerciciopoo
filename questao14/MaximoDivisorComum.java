package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("MDC(8, 2) = " + MDC(8, 2));
        System.out.println("MDC(20, 4) = " + MDC(20, 4));
    }

    public static int MDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MDC(b, a % b);
        }
    }
}
