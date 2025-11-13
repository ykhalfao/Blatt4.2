package p2;

public class P2_Main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        int intResult;
        double x = 1.5, y = 2.3;
        double doubleResult;
        double a1 = (int) a;
        double b1 = (int) b;
        double c1 = (int) c;
        int teilaufgaben= 5;
        switch(teilaufgaben) {
            case 1:
                intResult = c -a * 3;
                System.out.println("Teilaufgabe (a) Frage 1: int. Frage 2: moeglich "+intResult);
                break;
            case 2:
                intResult = c / b;
                System.out.println("Teilaufgabe (b) Frage 1: int. Frage 2: nicht moeglich "+intResult);
                break;
            case 3:
                intResult = a + b / c;
                System.out.println("Teilaufgabe (c) Frage 1: int. Frage 2: nicht moeglich "+intResult);
                break;
            case 4:
                doubleResult = c1 / b1;
                System.out.println("Teilaufgabe (d) Frage 1: eig. int jetzt double. Frage 2: nicht moeglich ohne typ Umwandlung "+doubleResult);
                break;
            case 5:
                doubleResult = c1 + a1 / b1;
                System.out.println("Teilaufgabe (e) Frage 1: eig. int jetzt double. Frage 2: nicht moeglich ohne typ Umwandlung "+doubleResult);
                break;
            case 6:
                doubleResult = x + y * b;
                System.out.println("Teilaufgabe (d) Frage 1: double. Frage 2: moeglich ohne typ Umwandlung "+doubleResult);
                break;
            default:
                System.out.println("kein Teil der Aufgabe ");
        }
    }
}