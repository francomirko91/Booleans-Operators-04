public class Start {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;

        boolean result = (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println(result);


        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;

        boolean result2 = (x * x - y * y / 2 != 12) || !t && f;
        System.out.println(result2);


    }
}
