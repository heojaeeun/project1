package hje;
import java.util.Scanner;

public class Pj1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String cd; //스트링으로 nextint 받기 안됨 
		int cd;
		int c1;
		int c2;
		
			System.out.println();
			System.out.println("안녕하세요.");
			System.out.println("캘린더와 다이어리중 무엇을 이용하시겠습니까?");
			System.out.println();
			
			do {
				System.out.print("캘린더-> 1 / 다이어리-> 2 >> ");
				cd = sc.nextInt();
				if(cd == 1) {
					System.out.println();
					System.out.println("캘린더를 꺼내오는 중입니다......");
					System.out.println();
					System.out.println("원하는 작업을 선택해 주세요!");
					
					do {
						System.out.print("일정 확인-> 1/ 일정 추가-> 2 >> ");
						c1 = sc.nextInt();
						if(c1==1) {
							System.out.println();
							System.out.println("해당 날짜를 입력해주세요.");
							WeekDay wd = new WeekDay();
							wd.input();
							String result = wd.week();
							wd.week();
							wd.result1();
							System.out.println();
							System.out.println();
							wd.result1();
							System.out.print(wd.week()+"요일");
							System.out.println("의 일정을 확인하겠습니다.");
							
							
						} else if (c1==2) {
							System.out.println();
							System.out.println("일정을 추가하고싶은 날짜를 입력해주세요.");
							WeekDay wd = new WeekDay();
							wd.input();
							String result = wd.week();
							wd.week();
							System.out.println();
							wd.result1();
							System.out.print(wd.week()+"요일");
							System.out.print("에 일정을 추가하겠습니다.");
							System.out.println("일정 입력/ 일정 없음 -> \"없음\" 입력");
							System.out.println();
							Pj2 nt = new Pj2();
							nt.noteString1();
							wd.result1();
							System.out.print(wd.week()+"요일의 일정은 다음과 같습니다.");
							
							
							String arr[] = new String[3];
							for(int i=0; i<arr.length; i++) {
								
							}
							
							
							
							
							
							} else {
							System.out.println();
							System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						}
					}while(c1!=1 && c1!=2);
					
				} else if (cd ==2){
					System.out.println();
					System.out.println("다이어리를 꺼내오는 중입니다...");
				} else {
					System.out.println();
					System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
					System.out.println();
				}
			}while(cd!=1 && cd!=2);
		
		
	}

}