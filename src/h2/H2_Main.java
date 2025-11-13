package h2;

public class H2_Main {
    public static void main(String[] args) {
        int input = 11;
        boolean x = (input == 10 || input == 11);
        boolean y = (input == 1 || input == 11);

        boolean E1 = x;
        boolean E2 = y;
        boolean E3 = x != y;

        boolean a = E1 && E2;
        boolean b = E1 || E3;
        boolean c = (x && y) ? false : (x && !y) ? true : (!x && y) ? false : true;

        System.out.println("a ist: " + a);
        System.out.println("b ist: " + b);
        System.out.println("c ist: " + c);
    }
}
