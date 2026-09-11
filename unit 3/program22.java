class program22 {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            int c = a / b;   // Exception occurs here
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        }

        System.out.println("Program executed successfully after exception handling.");
    }
}