package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_Copy2 {
	// 폴더이름을 전달하면 해당 폴더 이름에 2를 붙인 새 폴더안에 모든 내용을 복사하는 메서드를 만들어보세요
	// 폴더 안의 폴더도 복사가 되어야한다.

	public static void main(String[] args) {

		copyFolders("./myfilestest/", "./myfiles2/");

	}

	public static void copyFolders(String src, String dst) { // String src 기존파일 , String dst 옮길파일
		File srcFolder = new File(src); // 원본폴더 생성
		File dstFolder = new File(dst); // 대상 폴더

		if (srcFolder.isDirectory()) { // 원본이 폴더인가?
			if (!dstFolder.exists()) { // 폴더가 없다면 생성해라
				dstFolder.mkdirs();
				System.out.println("폴더생성");
			}
		}

		// 폴더와 파일을 확인해서 대상폴더로 옮기기
		String[] files = srcFolder.list(); // 해당 디렉토리 내부목록을 String[]로 반환

		if (files != null) {

			for (String file : files) {
				File srcFile = new File(srcFolder, file); // 원본 파일 또는 폴더
				File dstFile = new File(dstFolder, file);

				FileReader reader = null;
				FileWriter writer = null;

				try {
					reader = new FileReader(srcFile);
					writer = new FileWriter(dstFile);

					char[] buffer = new char[1024];
					int bytesRead;

					while ((bytesRead = reader.read(buffer)) != -1) {
						writer.write(buffer, 0, bytesRead);
					}
				} catch (FileNotFoundException e) {
					// 파일을 찾을 수 없음 예외 처리
					System.err.println("파일을 찾을 수 없습니다");
				} catch (IOException e) {
					// 파일 복사 중 오류 예외 처리
					System.err.println("파일 복사 중 오류가 발생했습니다");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						if (writer != null) {
							writer.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
