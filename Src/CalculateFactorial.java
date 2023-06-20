public class CalculateFactorial {
    public static class Factorial{

        int result;
        int key;

        public Factorial(int number, int x){

            result=number;
            key = x;
        }

    }

    public static Factorial getFactorial(int x){

        int result=1;
        for (int i = 1; i <= x; i++){

            result *= i;
        }
        return new Factorial(result, x);
    }
}
