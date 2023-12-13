import java.io.File;

public class E07_File {
	/*
	
		#java.io.File
		- 파일에 대한 정보를 담을 수 있는 클래스
		- 인스턴스를 생성할 때 실제 파일로부터 정보를 받아온다
		- 해당 인스턴스에 담긴 정보를 통해 실제 파일을 직접 제어할 수 있다.
		
		#파일시스템
		- 하드디스크에 저장된 데이터들을 손쉽게 관리 할 수 있도록 설정한 구역
		- 파일 시스템의 내용을 디렉토리 구조로 편리하게 볼 수 있는 프로그램 탐색기이다.
	*/

	public static void main(String[] args) {
		// 상대경로 - 현재 위치부터 시작하는 경로, 현재 위치가 어디냐에 따라 가리키는 곳이 달라 질 수 있다.
		File f1 = new File("./myfiles/test2.txt");
		File f2 = new File("./myfiles/");
		// ./ -> 프로젝트폴더 현재 위치 (./)생략가능 
		File f3 = new File("/JavaFullstack_hm");
		
		// 절대경로 - 가장 높은(뿌리) 경로부터 시작하는 경로, 현재 위치의 영향을 받지 않는다.
		// 			파일이나 디렉토리가 시스템의 루트 디렉토리에서부터 어떤 위치에 있는지를 나타내는 경로
		File f4 = new File("C:/JavaFullstack_hm/java-workspace/Javastudy/src/A00_Hello.java");

		//isDirectory() : 해당 파일 인스턴스가 디렉토리인가?
		System.out.println(f1.isDirectory()); // false
		System.out.println(f2.isDirectory()); // true
		System.out.println(f3.isDirectory()); // true
		System.out.println(f4.isDirectory()); // false
		
		//isFile() : 해당파일 인스턴스가 파일인가?
		System.out.println("-------------------");
		System.out.println(f1.isFile()); // true
		System.out.println(f2.isFile()); // false
		System.out.println(f3.isFile()); // false
		System.out.println(f4.isFile()); // true
		
		//isAbsolute() : 해당 파일의 경로가 절대경로인가?		
		System.out.println("-------------------");
		System.out.println(f1.isAbsolute()); // false
		System.out.println(f2.isAbsolute()); // false
		System.out.println(f3.isAbsolute()); // false
		System.out.println(f4.isAbsolute()); // true
		
		//exists() : 해당 경로에 파일이 실제로 존재하는가?
		System.out.println("-------------------");
		File f5 = new File("C:/practice/");
		System.out.println(f1.exists()); // true
		System.out.println(f2.exists()); // true
		System.out.println(f3.exists()); // true
		System.out.println(f4.exists()); // true
		System.out.println(f5.exists()); // true
		
		//mkdir() : 해당 경로에 폴더를 생성한다. 폴더 생성 성공 여부를 반환한다.
		System.out.println("-------------------");
		if(!f5.exists()) {
			f5.mkdir();
			System.out.println("폴더를 생성했습니다!");
		}
		
		//mkdirs() : 해당 경로에 필요한 모든 폴더를 생성한다
		System.out.println("-------------------");
		File f6 = new File("C:/practice/images/fruits/");
		
		System.out.println("성공했는가? "+ f6.mkdir()); // 성공했는가? false
		System.out.println("성공했는가? "+ f6.mkdirs()); // 성공했는가? false
		
		//list() : 해당 디렉토리 내부의 파일목록을 String[]로 반환한다
		System.out.println("-------------------");
		File f7 = new File("C:/JavaFullstack_hm/java-workspace/Javastudy/src/");

		String[] files =  f7.list();
		
		System.out.println("###src 폴더 ###");
		for(String f : files) {
			System.out.println(f); // UnderGroundUnit.class
		}
		
		//listFiles() : 해당 디렉토리 내부의 파일들을 File[]로 반환한다
		System.out.println("-------------------");
		File[] files2 = f7.listFiles();
		
		for(File f : files2) {
			System.out.print(f); // File.toString()
			System.out.println(" : " + f.isDirectory());
			// C:\JavaFullstack_hm\java-workspace\Javastudy\src\E06_CharcterStream.java : false
			// C:\JavaFullstack_hm\java-workspace\Javastudy\src\myobj : true
		}
		
		// .getName() :  파일이나 디렉토리의 이름을 나타내는 문자열을 반환
		// 이 메서드는 전체 경로에서 마지막 파일이나 디렉토리의 이름을 반환
		System.out.println("-------------------");
		System.out.println(f4.getName());  // A00_Hello.java
		
		// getAbsolutePath() : 파일이나 디렉토리의 절대 경로를 나타내는 문자열을 반환
		// 이 추상 경로명이 이미 절대적인 경우 문자열은 #getPath 메소드에 의해 반환
		// 이 추상 경로 이름이 빈 추상 경로 이름이면 명명된 현재 사용자 디렉터리의 경로 이름 문자열이 반환
		
		// getPath() :  파일이나 디렉토리의 경로를 나타내는 문자열을 반환
		// 파일을 열거나, 다른 작업을 수행할 때 특정 파일의 경로를 알아야 하는 경우사용
		// 파일 또는 디렉토리를 생성할 때 사용한 경로 문자열을 그대로 반환
		// 파일이나 디렉토리의 경로를 상대 경로 또는 절대 경로로 지정한 경우에 관계 없이, 생성할 때 사용한 경로 문자열을 그대로 반환
		System.out.println("-------------------");
		System.out.println(f7.getAbsolutePath());
		//C:\JavaFullstack_hm\java-workspace\Javastudy\src
		System.out.println(f7.getPath());
		//C:\JavaFullstack_hm\java-workspace\Javastudy\src

	}

}
