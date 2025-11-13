package h3;

public class H3_Main {
    public static void main(String[] args) {
        float clesiusFloat = 14.2F;
        float fahrenheitFloat;
        double celsiusDouble = 14.2;
        double fahrenheitDouble;

        fahrenheitFloat = (clesiusFloat * 9 / 5) + 32; //Wenn 9 / 5 in Klammern steht funktioniert der Code einwandfrei :)
        fahrenheitDouble = (celsiusDouble * 9 / 5) + 32;
        System.out.println("Fahrenheit ist mit float " + fahrenheitFloat +" Fahrenheit ist mit double "+ fahrenheitDouble);
    }

}

