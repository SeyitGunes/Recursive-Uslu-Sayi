import java.util.Scanner;

public class Recursive {
    static int usAlma(){
        Scanner can = new Scanner(System.in);

        System.out.println("a^b");
        System.out.println("a değerini giriniz: ");
        int a = can.nextInt();
        System.out.println("b değerini giriniz: ");
        int b = can.nextInt();
        int total = 1;
        for (int i = 1; i<= b; i++){
            total *= a;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(usAlma());
    }
}
