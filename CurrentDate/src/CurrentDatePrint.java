import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class CurrentDatePrint {
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);
		
		DateFormat dff = new SimpleDateFormat("YYYY/MM/dd");
		String datee = dff.format(date);
		System.out.println(datee);
		
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		
		
		
	}

}
