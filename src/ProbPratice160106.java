import java.util.Random;
import java.util.Scanner;

public class ProbPratice160106 {

	public static void main(String[] args) {
		
		//random이란
		Random ran = new Random(); //Random 객체생성및 변수 설정 // Random();의 괄호안에 숫자를 넣으면 랜덤수가 고정이 된다.
		int ranNum = ran.nextInt(100); //0~99까지의 임의의 수 출력
		System.out.println("0~100까지의 임의의 수 : "+ranNum+"\n");
		
		//equal매소드의 이해
		System.out.print("hello world를 정확하게 입력하세요 : ");
		String a ="hello world";
		
		Scanner scan = new Scanner(System.in);
				
		while(true){
		String str =scan.nextLine();
		
		if(a.equals(str)){ //equal메소드는 괄화 안 즉, str의 문자열과 String 변수 a안에 있는 변수가 같으면 참, 다르면 거짓을 생성하는 매소드 이다.
			System.out.println("정답입니다! 잘하셨습니다.\n");
			break;
		}
		else{
			System.out.println("다시입력하세요!");
			continue;
		}
		}
		
		//toCharArray의 이해
		System.out.print("문자열 입력 : ");
		String toChar = scan.nextLine();
		char[] strChar = toChar.toCharArray();//toCharArray는 String의 값을 하나하나의 char의 배열로 바꾸어주는 기능을 가지고 있다. (문자열을 문자로)
		System.out.println("strChar[0]출력 : "+strChar[0]);
		System.out.println("strChar[2]출력 : "+strChar[2]);
		
		
	}

}
