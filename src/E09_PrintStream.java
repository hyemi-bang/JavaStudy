import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E09_PrintStream {
	
	/*
		# PrintStream
		- 문자를 훨씬 편리하게 출력할 수 있는 기능을 가지고 있는 클래스
		- println(), printf), print() 등을 사용할 수 있다.
		- BufferedStream, BufferedWriter => 성능 증가
		- PrintStream, PrintWriter => 편리함 증가
		
		 System.out >>>
		 PrintWriter out = new PrintWriter(outputStream or writer); 
		 이렇게 사용하여 여러 방향으로 출력할 수 있다.
	*/

	public static void main(String[] args) {

		
		try(FileWriter fout = new FileWriter(new File("myfiles/print.txt"));// 이 파일로 전송되어 출력된다.
			BufferedWriter bout = new BufferedWriter(fout);
			PrintWriter out = new PrintWriter(bout);
		) {
			
			out.printf("%s는 %d원 입니다.\n","사과", 800);
			out.print("Hello, world!");
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
