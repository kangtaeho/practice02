package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		//Randomize 하기
		Random random = new Random();
		int number = random.nextInt(100);// 넣어준 값이 100이면 0~99까지의 임의 수 가 나옴
		
		System.out.println("random에서 임의로 뽑은 수 : "+number+"\n");
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요(1~100) : ");
		
		int i = 1;
		
		while(true){	
			
		Scanner scanner = new Scanner(System.in);
		System.out.print(i+">>");
		String answer= scanner.nextLine();
		int strNum = Integer.parseInt(answer);
		
		if(strNum==number){
			System.out.println("정답입니다.");
		}
		else if(strNum<number){
			System.out.println("더 높이");
		    System.out.println("다시 입력하시겠습니까?");
		    i++;
		    continue;		
		}
		else if(strNum>number){
			System.out.println("더 낮게");
		    System.out.println("다시 입력하시겠습니까?");
		    i++;
		    continue;		
		}
		
		System.out.println(answer.equals("y")==false);
		}
		
	}
}