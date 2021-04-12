import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        adding(x, y);
        subtract(x, y);
        multiply(x, y);

    }
    public static void adding(int x, int y){
        int result = x + y;
        out.println(result);
        }

    public static void subtract(int x, int y){
        int result = x - y;
        out.println(result);
    }

     public static void multiply (int x, int y){
        int result = x * y;
        out.println(result);
        }


}



