class program24 {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            int c = a / b;  
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
