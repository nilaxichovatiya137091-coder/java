class program35 {

    void display() {

        class Local {
            void show() {
                System.out.println("This is a Local Inner Class");
            }
        }

        Local obj = new Local();
        obj.show();
    }

    public static void main(String[] args) {

        program35 p = new program35();
        p.display();
    }
}