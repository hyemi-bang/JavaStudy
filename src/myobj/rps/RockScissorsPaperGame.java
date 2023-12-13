package myobj.rps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RockScissorsPaperGame {
	
	final private static String[] ShapeLabels= {"가위", "바위", "보"};

	final public static int Rock = 0;
	final public static int Scissors = 1;
	final public static int Paper = 2;
	
	private int win;
	private int draw;
	private int lose;
	

	public RockScissorsPaperGame() {
		// 파일에서 꺼내서 win/draw/lose를 꺼내서 채울 것
		
		try {
			FileInputStream in = new FileInputStream("myfiles/record.sav"); // 파일을 읽지 못했을때의 예외작업
			
			byte[] arr = new byte[4];
			// 처음에 읽는 4개의 바이트는 하나의 전적을 의미한다
			
			in.read(arr);
			win = byteArrayToInt(arr); 
			in.read(arr);
			draw = byteArrayToInt(arr); 
			in.read(arr);
			lose = byteArrayToInt(arr); 
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fight(int shape) {
		//가위바위보 모양 모양과 점수를 만들어 출력할 준비를 한다
		// 모양과 번호를 누적시켜 출력하면 된다.
		
		int userShape = shape;
		int computerShape = (int)(Math.random() * 3);
		
		System.out.println();
		System.out.println("YOU\t\tCOM");
		System.out.printf("%s\tVS\t%s\n", ShapeLabels[userShape], ShapeLabels[computerShape]);
		
		if((userShape+1) % 3 == computerShape) {
			System.out.print("사용자 승리");
			++win;
		} else if((computerShape+1) % 3 == userShape ) {
			System.out.print("사용자 패배");
			++lose;
		} else {
			System.out.print("무승부");
			++draw;
		}
		System.out.printf("(사용자 현재 전적 : %s승 %s무 %s패)", win, draw, lose);
		
	}
	
	final public static int byteArrayToInt(byte[] bytes) {
		
		int value = 0;
		//for(int i = 0 ; i < arr.length; ++i) { 
		//for(int i = 0 ; i < 4; ++i) {  // int는 4바이트이므로 크기가 4인 바이트 배열 생성
		//	value += (arr[i]<< (32 - (i+1) * 8));
			// 데이터 타입 크기 초과가 일어나서 128이 넘어가면 오버플로우가 발생한다 수정이 필요하다
//			value |= arr[0];
//			value = value << 8;
		//}

		value |= bytes[0] << 24;
		value |= (bytes[1] & 0xFF) << 16;
		value |= (bytes[2] & 0xFF) << 8;
		value |= (bytes[3] & 0xFF);

		return value;
	}
	final public static byte[] intToByteArray(int value) {
		// 인트값이 하나 들어온다  ex 255^일때 => 2진법으로 바꾸면 1111 1111 (맨 앞의 1은 부호비트)
		// (0000 0000 / 0000 0000 / 0000 0000 / 1111 1111) 
		// => byte[]로는 {0, 0, 0, -128}이다.
	    return new byte[] {
	            (byte)(value >>> 24), // 비트 쉬프트 연산자, 오른쪽으로 24칸 민 값을 byte값으로 내라 
	            (byte)(value >>> 16), // 쉬프트 연산은 이진수 표현을 기반으로 수행되며, 연산에 참여하는 값들의 비트를 이동
	            (byte)(value >>> 8), 
	            (byte)value};
	}
	
	// 현재 전적을 기록하는 기능
	public void save() {
		try {
			FileOutputStream out = new FileOutputStream("myfiles/record.sav");// 확장자는 꼭 txt일 필요는 없다
			// 현재 win,draw,lose는 인트타입이고 이 자리는 바이트가 오는 자리니까
			// 바이트 1자리에 승.무.패 넣으면 문제가 생길 수 있다 (128이 넘으면 -127이 나오는 문제 발생)
			// 구글에 java integer to byte array 검색 [https://stackoverflow.com/questions/2183240/java-integer-to-byte-array]
			
			out.write(intToByteArray(win));
			out.write(intToByteArray(draw));
			out.write(intToByteArray(lose));
	
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}



