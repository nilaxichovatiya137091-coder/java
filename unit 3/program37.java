import java.text.SimpleDateFormat;
import java.util.Date;

class program37 {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Format 1: " + f1.format(date));
        System.out.println("Format 2: " + f2.format(date));
        System.out.println("Format 3: " + f3.format(date));
        System.out.println("Format 4: " + f4.format(date));
    }
}