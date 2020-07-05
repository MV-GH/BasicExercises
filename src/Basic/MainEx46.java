package Basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainEx46 {

    public static void main(String[] args) {
        System.out.println("This program returns the system time");
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();

        System.out.println(df.format(calobj.getTime()));
    }

}
