package h2;

public class H2_Main_original {
    public static void main(String[] args) {
        int input = 11;
        boolean x = true;
        boolean y = true;
        switch (input) {

            case 0:
                boolean x0 = false;
                boolean y0 = false;
                x=x0;
                y=y0;
                break;
            case 1:
                boolean x1 = false;
                boolean y1 = true;
                x=x1;
                y=y1;
                break;
            case 10:
                boolean x10 = true;
                boolean y10 = false;
                x=x10;
                y=y10;
                break;
            case 11:
                boolean x11 = true;
                boolean y11 = true;
                x=x11;
                y=y11;
                break;
        }
        boolean E1= true;
        boolean E2= true;
        boolean E3= true;
        if (x == true) {
            boolean E1_1= true;
            E1=E1_1;
        }else {
            boolean E1_2=false;
            E1=E1_2;
        }
        if (y) {
            boolean E2_1= true;
            E2=E2_1;
        }else {
            boolean E2_2= false;
            E2=E2_2;
        }
        if (x!=y) {
            boolean E3_1= true;
            E3=E3_1;
        }else {
            boolean E3_2= false;
            E3=E3_2;
        }
        if (E1&&E2) {
            boolean a= true;
            System.out.println("a ist: "+a);
        }else {
            boolean a2= false;
            System.out.println("a ist: "+a2);
        }
        if (E1||E3) {
            boolean b= true;
            System.out.println("b ist: "+b);
        }else {
            System.out.println("b ist: false");
        }

        if (x&&y) {
            boolean c= false;
            System.out.println("c ist: "+c);
        }
        else if (x&&!y) {
            boolean c= true;
            System.out.println("c ist: "+c);
        }
        else if (!x&&y) {
            boolean c= false;
            System.out.println("c ist: "+c);
        }
        else if (!x&&!y) {
            boolean c= true;
            System.out.println("c ist: "+c);
        }else {
            System.out.println("c ist: false");
        }

    }
}
