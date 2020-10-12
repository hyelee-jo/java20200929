package chap05.textbook;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 = num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

} // 메뉴 초록 재생표시옆 아래방향삼각형 누르고 Run cofigurations Arguments 탭 클릭 program argument 자리에
 // 10+20 입력해 보기
