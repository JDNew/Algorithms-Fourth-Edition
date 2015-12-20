package chapterOneExercise;

import java.util.Scanner;

public class OnePointOne {

	public static void main(String[] args) {
		//exercise1_1_1();
		//exercise1_1_2();
		//exercise1_1_3();
		//exercise1_1_4();
		//exercise1_1_5();
		//exercise1_1_6();
		exercise1_1_7();
		

	}

	

	/**
	 * 习题1.1.1
	 */
	private static void exercise1_1_1() {
		System.out.println("(0+15)/2 = " + (0 + 15) / 2);
		System.out.println("2.0e -6 * 100000000.1 = " + (2.0 * Math.pow(10, -6)) * 100000000.1);
		System.out.println("true&&false || true && true = " + (true && false || true && true));
	}

	private static void exercise1_1_2() {

		System.out.println("(1 + 2.236 ) / 2 =  " + ((1 + 2.236) / 2) + ", its type is  " + judgeType((1 + 2.236) / 2));
		System.out.println("1 + 2 + 3 + 4.0 = " + (1 + 2 + 3 + 4.0) + ", its type is  " + judgeType(1 + 2 + 3 + 4.0));
		System.out.println("4.1 >= 4 = " + (4.1 >= 4) + ", its type is  " + judgeType(4.1 >= 4));
		System.out.println("1 +2 + \"3\" = " + (1 + 2 + "3") + ", its type is " + judgeType(1 + 2 + "3"));

	}

	private static String judgeType(Object object) {
		if (object instanceof String) {
			return "String";
		} else if (object instanceof Integer) {
			return "int";
		} else if (object instanceof Double) {
			return "double";
		} else if (object instanceof Boolean) {
			return "boolean";
		}

		return null;
	}

	private static void exercise1_1_3() {
		System.out.println("please input three integers : ");
		Scanner scanner = new Scanner(System.in);
		int integer1 = scanner.nextInt();
		int integer2 = scanner.nextInt();
		int integer3 = scanner.nextInt();
		
		System.out.println(judgeEqual(integer1 , integer2 , integer3));
	
	}

	private static String judgeEqual(int integer1, int integer2, int integer3) {
		if(integer1 == integer2 && integer2 == integer3){
			return "equal" ;
		}else {
			return "not equal";
		}
		
	}
	
	private static void exercise1_1_4() {
		//a.  没有then这个关键字
		//b. 判断条件缺少了括号
		//c. 没有问题
		//d. c = 0 少了结束符号“；”
		
	}
	
	private static void exercise1_1_5() {
		System.out.println("please input two doubles : ");
		Scanner scanner = new Scanner(System.in);
		double double1 = scanner.nextDouble();
		double double2 = scanner.nextDouble();
		
		System.out.println(judgeBetween0to1(double1 , double2));
		
	}

	private static boolean judgeBetween0to1(double double1, double double2) {
		if( 0 < double1 && double1 < 1){
			if (0 < double2 && double2 < 1) {
				return true;
			}
		}else {
			return false;
		}
		
		return false;
		
	}
	
	private static void exercise1_1_6() {
	 /**
	  * 0
	  * 1
	  * 1
	  * 2
	  * 3
	  * 5
	  * 8
	  * 13
	  * 21
	  * 34
	  * 55
	  * 89
	  * 144
	  * 233
	  * 377
	  * */
		int f = 0;
		int g = 1;
		for(int i = 0 ; i < 15 ; i ++){
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}

	private static void exercise1_1_7() {
		a();
		b();
		c();
		
	}

	private static void a() {
		double t = 9.0;
		while(Math.abs(t - 9.0 / t) > .001)
			t = (9.0 / t + t) / 2.0;
		System.out.printf("%.5f\n" , t);
		
	}
	
	private static void b() {
		int sum = 0 ;
		for(int i = 1 ; i < 1000 ; i ++){
			for(int j = 0 ;  j < i ; j ++){
				sum ++;
			}
		}
		System.out.println(sum);
		
	}
	
	private static void c() {
		int sum = 0 ;
		for(int i =1 ; i < 1000 ; i *= 2)
			for (int j = 0; j < 1000; j++) {
				sum ++;
			}
		System.err.println(sum);
		
	}


	



	
}
