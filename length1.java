//캘린더 다중배열 길이 구하는 용도.
//2019 01 01~2021 12 31


package hje;


import java.text.SimpleDateFormat;
import java.util.Date;

public class length1 {

	public static void main(String[] args) throws Exception {
		System.out.println(diffOfDate("20190101", "20211231"));
	  }

	 

	  public static long diffOfDate(String begin, String end) throws Exception
	  {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

	 

	    Date beginDate = formatter.parse(begin);
	    Date endDate = formatter.parse(end);

	 

	    long diff = endDate.getTime() - beginDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);

	 

	    return diffDays;

	}

}