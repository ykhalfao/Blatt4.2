package h1;

public class H1_Main {
    public static void main(String[] args) {
        double price = 0;
        int zone =500;
        switch(zone) {
            case 6:
                price = 4.00;
                break;
            case 5:
                price += 0.7;
            case 4:
                price +=2.85;
                break;
            case 3:
                price +=0.5;
            case 2:
                price +=0.35;
            case 1:
                price +=2.00;
        }
        System.out.println("Gesamter Preis "+price+"€" );
    }
}
