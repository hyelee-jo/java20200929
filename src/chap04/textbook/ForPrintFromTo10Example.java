package chap04.textbook;

public class ForPrintFromTo10Example {
	public static void main(String[] args) {
		// 1 -> 2 -> code -> 3 -> 2
		
		
		// 1~10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 11~20
		System.out.println("===================");
		for(int i=11; i<=20; i++) {
			System.out.println(i);
		}
		
		// 1~9 홀수만
		System.out.println("===================");
		for(int i=1; i<=9; i+=2) {
			System.out.println(i);
		}
		
		
		// 10~1
		System.out.println("===================");
		for(int i = 10; i>=1; i--)
			System.out.println(i);
		
		// 10~2 짝수만
		System.out.println("===================");
		for(int i=10; i>=2; i-=2)
			System.out.println(i);
		
		
		
	
	}
	
	

}
