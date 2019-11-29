package factorial;

public class Factorial {

    public static void main(String[] args) {

        int condicion;
        int factorial;

        condicion = 8;

        int inicio;
        if (condicion == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (inicio = condicion; inicio >= 1; inicio--) {
                factorial = factorial * inicio;
            }
        }

        System.out.println(factorial);

    }

}
