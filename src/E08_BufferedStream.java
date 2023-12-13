import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E08_BufferedStream {
	
	/*
	
		#Buffer (버퍼)
		- 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송하는 것
		- BufferedReader / Writer : 버퍼를 사용하고 문자 단위로 데이터를 입출력
		- BufferedInputStream / OutputStream : 버퍼를 사용하고 바이트 단위로 데이터를 입출력
	*/

	public static void main(String[] args) {
		
		File f = new File("myfiles/emails.txt");
		
		// 기존의 FileReader에 버퍼 기능을 추가해 사용할 수 있다.
		try (
			FileReader fin = new FileReader(f);
			BufferedReader in = new BufferedReader(fin);
		){
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//new BufferedInputStream();
		//new BufferedWriter();
		//new BufferedOutputStream(); 각각 필요한 것들과 엮어서 사용하라
		
		// System.in 은 inputStream 이기 때문에 바이트 단위로 입력받을 수 있다.
		// 즉 프로그램에서는 콘솔에서 발생한 입력을 byte 단위로 전송 받게 된다. 
		BufferedInputStream in = new BufferedInputStream (System.in);
		
		try {
			System.out.print(">>");
			int data = in.read();
			
			System.out.println(data);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// InputStreamReader() : 전달받은 byte단위의 InputStream을 문자단위로 조립해주는 중간 클래스 
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			System.out.print("isr >>");
			int ch = isr.read();
			System.out.println((char)ch);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// BufferedReader 콘솔의 내용을 문자로 다루면서 한 줄씩 입력받기위해 업그레이드 해서 사용한다
		BufferedReader bin = new BufferedReader(isr);
		
		try {
			System.out.println("buffered >>");
			String line = bin.readLine();
			
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
