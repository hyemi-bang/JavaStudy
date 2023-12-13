package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_Copy1 {

	// myfiles의 파일들 중 .txt 파일들을 mytxts에 복사
	// myfiles의 파일들 중 그림 파일들을 myimages폴더에 복사

	public static void main(String[] args) {

		// 현재 파일들이 있는
		File originalDirectory = new File("C:/JavaFullstack_hm/Javastudy/javaStudy/myfiles/");
		// 폴더들 생성하기
		File txtDirectory = new File("C:/JavaFullstack_hm/Javastudy/javaStudy/mytxts/");
		File imgDirectory = new File("C:/JavaFullstack_hm/Javastudy/javaStudy/myimages/");
		txtDirectory.mkdir();
		imgDirectory.mkdir();

		// 생성한 폴더에 복사

		File[] files = originalDirectory.listFiles();
		// listFiles() : 해당 디렉토리 내부의 파일들을 File[]로 반환한다 // 파일목록들을 가져온다

		// 파일을 반복돌리면서 txt,img 파일 해당 폴더에카피
		for (File file : files) {
			if (file.isFile() && file.getName().endsWith(".txt")) {
				// 해당파일 인스턴스가 파일인가?
				// "".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 검사한다
				try {
					FileReader reader = new FileReader(file);
					FileWriter writer = new FileWriter(new File(txtDirectory, file.getName()));
					char[] buffer = new char[(int) file.length()]; // read(char[]) : 전달한 배열 크기만큼 읽는다.
					int bytesRead;

					while ((bytesRead = reader.read(buffer)) != -1) {
						writer.write(buffer, 0, bytesRead);
					}
					reader.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (file.isFile() && file.getName().endsWith(".jpg")) {
				// 해당파일 인스턴스가 파일인가?
				// "".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 검사한다
				try {
					FileInputStream reade = new FileInputStream(file);
					FileOutputStream  write = new FileOutputStream(new File(imgDirectory, file.getName()));
					byte[] buffer = new byte[(int) file.length()]; // read(char[]) : 전달한 배열 크기만큼 읽는다.
					int bytesRead;

					while ((bytesRead = reade.read(buffer)) != -1) {
						write.write(buffer, 0, bytesRead);
					}
					reade.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} 

		}

	}

}
