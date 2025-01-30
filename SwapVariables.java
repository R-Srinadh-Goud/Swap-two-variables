public class SwapVariables {
    public static void main(String[] args) {
        int a = 5, b = 10;
        // Using third variable to swap a variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

