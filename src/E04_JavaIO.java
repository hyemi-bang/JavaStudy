import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {
	
	/*
	 # JavaIO (Input - Output)
	 - 자바에서는 스트림이라는 개념을 통해 프로그램의 입출력을 다룬다
	
	 - 프로그램으로 데이터가 들어오는 것을 입력 / input (불러오기 : 하드디스크에서 내용을 입력오는 것)
	 - 프로그램에서 데이터가 나가는 것을 출력 / output (메모장에서 -> 하드디스크로 현재 내용을 전부 출력하는 것)
	  
	 
	 # Stream 스트림
	 - 데이터가 전송되는 통로
	 - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다
	 - 데이터들이 프로그램에서 나가는 통로를 OutputStream
	 - 데이터가 스트림을 통해 전송되기 위해서는 해당 데이터를 byte타입으로 변환시켜야한다.
	  -> byte타입이 0과 1로의 변환이 쉽기 때문이다.
	  
	  
	 
	*/
	
	public static void main(String[] args) {
		
		//Java.io.FileOutPutStream :: 파일로 데이터를 내보내기 위한 스트림
		try {
			FileOutputStream out = new FileOutputStream("myfiles;test.txt");
			
			out.write(65);
			out.write(66);
			out.write(67);
			
			out.write(("Hello, world!!!".getBytes()));
			out.write(("안녕하세요~".getBytes()));
			
			// 다 사용한 스트림은 반드시 수동으로 닫아줘야한다. (닫아야하는 시점을 자바가 스스로 결정하지 못함) 꼭 닫아줘야한다. 닫지 않을 경우 메모리를 계속 잡아먹기에 컴퓨터가 멈출수도 있다
			out.close();
			System.out.println("쓰기완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("쓰다가 문제가 생겼습니다.");
		}
		
	}

}
