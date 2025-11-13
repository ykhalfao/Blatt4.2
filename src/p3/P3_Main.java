package p3;

public class P3_Main {
    public static void main(String[] args) {
        int SpaltenTabelle= 1;
        switch(SpaltenTabelle) {
            case 1:
                boolean x1 = true;
                boolean y1 = true;
                boolean a = !(x1!=y1 && x1==y1);
                boolean b = x1||true;
                boolean c = x1&& false;
                boolean d = (x1&&!y1) || (!x1);
                System.out.println("Spalte 1: a  "+a+"  b  "+ b+"  c  "+ c+"  d  "+ d);

            case 2:
                boolean x2 = true;
                boolean y2 = false;
                boolean a2 = !(x2!=y2 && x2==y2);
                boolean b2 = x2||true;
                boolean c2 = x2 && false;
                boolean d2 = (x2&&!y2) || (!x2);
                System.out.println("Spalte 2: a  "+a2+"  b  "+ b2+"  c  "+ c2+"  d  "+ d2);

            case 3:
                boolean x3 = false;
                boolean y3 = true;
                boolean a3 = !(x3!=y3 && x3==y3);
                boolean b3 = x3||true;
                boolean c3 = x3 && false;
                boolean d3 = (x3&&!y3) || (!x3);
                System.out.println("Spalte 3: a  "+a3+"  b  "+ b3+"  c  "+ c3+"  d  "+ d3);

            case 4:
                boolean x4 = false;
                boolean y4 = false;
                boolean a4 = !(x4!=y4 && x4==y4);
                boolean b4 = x4||true;
                boolean c4 = x4 && false;
                boolean d4 = (x4&&!y4) || (!x4);
                System.out.println("Spalte 4: a  "+a4+"  b  "+ b4+"  c  "+ c4+"  d  "+ d4);



        }
    }
}
