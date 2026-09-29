class program36 {

    interface Test {
        void show();
    }

    public static void main(String[] args) {

        Test obj = new Test() {
            public void show() {
                System.out.println("This is a Nested Interface");
            }
        };

        obj.show();
    }
}