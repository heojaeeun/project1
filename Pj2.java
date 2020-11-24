package hje;

import java.util.Scanner;

public class Pj2 {
	
	Scanner sc = new Scanner(System.in);
	String note1, note2, note3;
	
	String[][] cal = new String[365][3];
	
//	public void noteString() {
//		for(int i=0; i<cal.length; i++) {
//			for(int j=0; j<cal[i].length; j++) {
//				switch(j) {
//				case 0: System.out.println("오전 일정 입력 :");
//					note1 = sc.next();
//					System.out.println();
//					sc.nextLine();
//				case 1: System.out.println("오후 일정 입력 :");
//					note2 = sc.next();
//					sc.nextLine();
//					System.out.println();
//				case 2: System.out.println("저녁 일정 입력 :");
//					note3 = sc.next();
//					System.out.println();
//				} break;
//			}break;
//		}System.out.println("일정 추가 완료!");
//	}
	
	public void noteString1() {
		WeekDay wd = new WeekDay();
		wd.result2();
		String[][] cal1 = new String[1231][3];
		for(int i=0; i<3; i++) {
			switch(i) {
			case 0: System.out.println("오전 일정 입력\n");
			note1 = sc.next();
			cal1[wd.result2()][i] = note1;
			case 1: System.out.println("오후 일정 입력\n");
			note2 = sc.next();
			cal1[wd.result2()][i] = note2;
			case 2: System.out.println("저녁 일정 입력\n");
			note3 = sc.next();
			cal1[wd.result2()][i] = note3;
			}break;
		}
		
	}
	
	public void noteExt() {
		WeekDay wd = new WeekDay();
		wd.result2();
		String[][] cal1 = new String[1231][3];
		for(int i=0; i<3; i++) {
			if(i==0) {
				System.out.print("오전 : ");
				System.out.println(cal1[wd.result2()][i]);
			}else if(i==1) {
				System.out.println("오후 : ");
				System.out.println(cal1[wd.result2()][i]);
			}else if(i==2) {
				System.out.println("저녁 : ");
				System.out.println(cal1[wd.result2()][i]);
			}break;
			
		}
		}
	
	public static void main(String[] args) {
		
		Pj2 nt = new Pj2();
		nt.noteString1();
		
	}

}
