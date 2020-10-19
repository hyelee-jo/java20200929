package chap09.lecture.localClass;

public class MyAppLocalVariable {
	public static void main(String[] args) {
		int i = 1;

		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
//				i+= 1;
			}
		}
//		args = new String[3];
//		i +=1;		
	}

}
