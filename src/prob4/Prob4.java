package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scanner.close();
	}
	
	public static char[] reverse(String str) {
		
		char[] c = str.toCharArray();
				
		for(int i =0; i<(c.length/2)+1; i++){
			char a;
			a=c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=a;
		}
		
		return c;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
