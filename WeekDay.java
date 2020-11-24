package hje;

import java.util.Scanner;

public class WeekDay {

	static int y;
	private static int m;
	private static int d;

	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 >> ");
		y = sc.nextInt();
		System.out.print("월 >> ");
		m = sc.nextInt();
		System.out.print("날짜 >> ");
		d = sc.nextInt();
	}
	
	String week() {
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] weekNames = {"일","월","화","수","목","금","토"};
		
		int nalsu, i, w;
		
		if(y%4==0&&y%100!=0||y%400==0) { //입력년도 y가 윤년이라면
			months[1] = 29;
		}else {
			months[1] = 28;
		}
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for(i=0; i<(m-1); i++)
			nalsu += months[i];
		
		nalsu += d;
		
		w = nalsu%7;
		
		return weekNames[w];
	}
	void print(String day) {
		System.out.printf(">> %d년 %m월 %d일 %s요일",y,m,d,day);
	}
	void result1() {
		System.out.print(y+"년 "+m+"월 "+d+"일 ");
	}
	int result2() {
		return m+d;
	}
	
	public static void main(String[] args) {
		WeekDay wd = new WeekDay();
		wd.input();
		wd.week();
		
		
		System.out.print(y+"년 "+m+"월 "+d+"일 ");
		System.out.println(wd.week()+"요일 ");
		
		
	}

	

}
