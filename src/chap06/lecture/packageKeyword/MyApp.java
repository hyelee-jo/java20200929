package chap06.lecture.packageKeyword;
//ctrl + shift + o (모든 import 소환)
import java.util.Scanner;
import java.util.*;
//import java.lang.String;

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 
			= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "java";
		String str2 = "css";
		
		ArrayList list = new ArrayList();
	}
}


