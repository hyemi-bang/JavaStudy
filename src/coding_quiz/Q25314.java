package baekjoon_ac;

import java.util.Scanner;

public class Q25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String print = "long ";

		for (int i = 0; i < n; ++i) {
			if (n % 4 == 0 && 4 <= n && n <= 1000) {
				n = n / 4;
			}
			System.out.print(print + "");
		}
		System.out.print("int");

	}

}

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	num /= 4;
//	String answer = "";
//	for (int i = 0; i < num; i++) {
//		answer += "long ";
//	}
//	System.out.println(answer + "int");
//}
//
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int result = N/4;
//        for (int i = 1; i <= result; i++ ){
//
//                System.out.print("long ");
//            }
//             System.out.print("int");
//
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int number = n / 4; 
//
//        StringBuilder dataType = new StringBuilder("long"); 
//        
//     
//        for (int i = 1; i < number; i++) {
//            dataType.append(" long");
//        }
//
//        System.out.println(dataType + " int");
//    }
//}