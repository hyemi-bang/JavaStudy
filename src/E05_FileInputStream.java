import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("myfiles/emails.txt");
			
			// .readAllBytes() : 해당 파일의 모든 데이터들을 byte[]로 읽어버린다.
			//byte[] allBytes = in.readAllBytes(); // catch 절 필요
					
			// byte[]도 다시 String타입으로 쉽게 바꿀 수 있다.
			//System.out.println(new String(allBytes));
			//System.out.println(Arrays.toString(allBytes)); // [97, 109, 101, 114, 105, 99, 97, 110, 111, 64, 106, 116, 98~~~ 출력
			
			/*
			  .read(byte[] b) : 내가 전달한 배열의 크기만큼 읽어주는 메서드
			  
			  the total number of bytes read into the buffer, or -1 if there is no more data because the end ofthe file has been reached.
			  파일의 마지막(EOF)에 도달하면 -1을 리턴한다.
			  읽은 내용이 있다면 몇 byte로 읽었는지 길이를 반환한다
			*/
			//byte[] buffer = new byte[4096];
			
			//int len;
			//while ((len = in.read(buffer)) != -1) {
			//	System.out.println("유효길이 : " + len);
			//	System.out.println(Arrays.toString(buffer));
				
				// byte[] 에서 유효한 길이 까지만 문자열로 만들 수 있다.
			//	System.out.println(new String(buffer, 0 , len)); // 길이를 직접적으로 정해줄 수 있다.		
			//}
			
			// read() : 한 바이트씩 읽는다. 마지막에 도달하면 -1을 리턴한다
			int b;
			
			while ((b = in.read()) != -1) {
				System.out.print((char)b);
			}
			
			in.close(); // Stream 이라 반드시 닫아줘야한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
