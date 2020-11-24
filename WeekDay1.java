
package hje;
import java.util.Calendar;
import java.util.Scanner;

public class WeekDay1{
	
	Calendar cal = Calendar.getInstance();
	
	int year = cal.get(Calendar.YEAR);
	int mon = cal.get(Calendar.MONTH);
	int date = cal.get(Calendar.DAY_OF_MONTH);
	int day = cal.get(Calendar.DAY_OF_WEEK);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d;
		WeekDay1 wd = new WeekDay1();
		System.out.println("년도를 입력해 주세요");
		y = sc.nextInt();
		y = wd.year;
		System.out.println("월을 입력해 주세요");
		m = sc.nextInt();
		m = wd.mon;
		System.out.println("날짜를 입력해 주세요");
		d = sc.nextInt();
		d = wd.date;
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		
		
	}
}
