class program23 {
    public static void main(String args[]) {
        try {
            int a = 20;
            int b = 0;

            int result = a / b;   // Causes ArithmeticException
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred: " + e);
        }
    }
}