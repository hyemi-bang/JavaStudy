import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E06_CharcterStream {
	
	/*
	
		# InputStream, OutputStream
		-byte단위로 데이터를 입출력하는 클래스
		-데이터를 byte로 분해해서 사용하기 때문에 다소 불편한 점이 있다.
		
		# Reader / Writer
		- char 단위로 데이터를 입출력하는 클래스
		- 데이터를 char 단위로 전달하면 클래스에서 알아서 byte단위로 분해하여 Stream 저장한다.(Writer)
		- 스트림으로 읽은 데이터를 프로그래머에게 전달할때 알아서 char으로 합쳐서 전달한다. (Reader)
	*/

	public static void main(String[] args) {
		
		// 데이터를 문자단위로 다룬다는 것  -> Charset을 사용한다는 것
		// 똑같은 2진법 데이터 문자해석 방식(charset)에 따라 다른 문자가 될 수 있다
		// 이것을 결정하는것은 생성자에서 사용할 때 결정 할 수 있다. 
		
		// Charset 종류 : UTF-8, EUC-KR, MS949  등등 ( 한글 번호가 다를 수도 같을 수도 )
		
		// FileWriter 문자단위로 파일에 쓸 수 있는 output
		try {
			FileWriter out = new FileWriter("myfiles/test2.txt", Charset.forName("EUC-KR"));// 생성자로 파일이나 경로를 달라고 한다
			// byte 타입으로 변환을 신경쓰지 않고 문자단위로 데이터를 전송할 수 있다.
			out.append('A');
			out.append('B');
			out.append('C');
			out.append(" ");
			
			out.append("Hello~ world\n");
			out.append("한글 가능\n");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		FileReader in = null;
		try {
			in = new FileReader("myfiles/test2.txt", Charset.forName("EUC-KR"));
			
			//read() : 한 문자씩 읽는다. 파일의 끝에 도달하면 -1을 리턴한다.
			//int ch;			
//			while((ch= in.read()) != -1){// 예외처리가 필요하다
//			System.out.print((char)ch);
//			}

			// read(char[]) : 전달한 배열 크기만큼 잉ㄺ는다.
			// 읽은 글자의 길이를 반환하고 파일의 끝에 도달하면 -1을 리턴한다.
			
			char[] buff = new char[1024];
			int len = in.read(buff);
			// char[]과 길이를 사용해 문자열 인스턴스를 생성할 수 있다.
			System.out.println(new String(buff, 0, len));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close를 finally문에 하면 100% 확률로 닫을 수 있다.
			// close를 finally문으로 넣으며렴 파일 리터를 try문 밖으로 빼야한다.
			try {
				if (in != null) {
					in.close(); // 예외처리가 필요하다
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
