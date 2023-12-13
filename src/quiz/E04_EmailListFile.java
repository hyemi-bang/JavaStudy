package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile {

	// D10번 문제 기자들의 이메일들로만 이루어진 파일을 myfiles 밑에 생성해보세요

	public static void main(String[] args) {

		String regex = ".+@(.+)\r\n";
		Matcher matcher = Pattern.compile(regex).matcher(D10_ReporterList.emails);
		HashSet<String> emailList = new HashSet<>();

		while (matcher.find()) {
			String email = matcher.group(0).trim();
			emailList.add(email);
		}

		try {
			FileOutputStream out = new FileOutputStream("myfiles/emailList.txt");
			
			for (String emails : emailList) {
				out.write(emails.getBytes());
				out.write("\n".getBytes());
			}
			out.close();

			System.out.println("이메일 주소 저장 완료");

		} catch (FileNotFoundException error) {
			System.out.println("파일 경로를 찾을 수 없습니다.");
		} catch (IOException error) {
			System.out.println("파일 쓰기 오류");
		}

	}

}
