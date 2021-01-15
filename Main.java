import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dateA = new Date();
        System.out.println("Welcome to Gus' Taco Stand!!");
        System.out.print("Today's Date is ");
        System.out.println(date.format(dateA));

        Staff staffMember = new Staff();
        staffMember.Menu();
    }
}
