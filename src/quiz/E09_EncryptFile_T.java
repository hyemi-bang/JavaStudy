package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_EncryptFile_T {

	
	final private static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()"
			+ "0123456789abcdefghijklmnopqrstuvwxyz.[]/?;'\"<>";  
	
	final private static int CAESAR_LENGTH = CAESAR_CHARSET.length();
	
	
	
	public static int encrypt(int ch, int key) {	
		int index = CAESAR_CHARSET.indexOf(ch);
		
		if(index == -1) {
			return ch;
		} else {
		return CAESAR_CHARSET.charAt((index + key)% CAESAR_LENGTH);
		}
	}
	
	public static char[] encrypt(char[] text, int key, int len) {
		
		for(int i = 0; i < len; ++i ) {
			text[i] = (char) encrypt(text[i], key);
		}
		
		return text;
	}
	
	public static int getRandomKey() {
		return (int)(Math.random() * (CAESAR_LENGTH - 1 ) + 1);
	}
	
	//1.char 방식
	public static int encryptTextFile1(String path) {
		File srcFile = new File(path); // src 소스파일
		
		String srcFileName = srcFile.getName();
		
		File targetFile = new File(
				srcFile.getParentFile(),
				srcFileName.substring(0, srcFileName.lastIndexOf('.')) + "_encrypted.enc"); // 부모의 경로를 받아오고, 이름을 만들어주겟다.
		// substring(int beginIndex, int endIndex) : 문자열을 시작 인덱스 부터 끝나는 인덱스 미만까지 자르고 반환 
		//lastIndexOf('.') 마지막에 찾는 . 위치
		
		int key = getRandomKey();
		
		try (FileReader in = new FileReader(srcFile);
			 FileWriter out = new FileWriter(targetFile); // 암호화해서 쓸꺼라 읽고, 쓰는거 모두 필요
		){
			int ch;
			while((ch = in.read()) !=-1) {
				// char 한글자씩 읽으면서 -1씩 아닐때까지 반복
				out.write(encrypt(ch, key));
			}
			return key;
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			return -1; // 잘못된 경우에는 -1을 리턴
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	//2.char[] 방식
	public static int encryptTextFile2(String path) {
		File srcFile = new File(path); 
		
		String srcFileName = srcFile.getName();
		
		File targetFile = new File(
				srcFile.getParentFile(),
				srcFileName.substring(0, srcFileName.lastIndexOf('.'))
					+ "_encrypted2.enc"); 
		
		int key = getRandomKey();
		
		try (FileReader in = new FileReader(srcFile);
			 FileWriter out = new FileWriter(targetFile);
		){
			//캐릭터형 배열
			char[] buff = new char[1024]; // 1024개 꺼내고 꺼내저 있는 상태에서 암호화 하고
			
			int len;
			while((len = in.read(buff)) != -1) {				
				out.write(encrypt(buff, key, len)); // 암호화 한거 쓰고
			}
	
			return key;
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			return -1; // 잘못된 경우에는 -1을 리턴
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	//2. buffered 방식
		public static int encryptTextFile3(String path) {
			File srcFile = new File(path); 
			
			String srcFileName = srcFile.getName();
			
			File targetFile = new File(
					srcFile.getParentFile(),
					srcFileName.substring(0, srcFileName.lastIndexOf('.'))
						+ "_encrypted3.enc"); 
			
			int key = getRandomKey();
			
			try (
				FileReader fin = new FileReader(srcFile);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(targetFile);
				BufferedWriter out = new BufferedWriter(fout);
			){
				int ch;
				while((ch = in.read()) != -1) {
					out.write(encrypt(ch, key));
				}
		
				return key;
			} catch (FileNotFoundException e) {			
				e.printStackTrace();
				return -1; // 잘못된 경우에는 -1을 리턴
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}
	
	
	public static void main(String[] args) {
		
		long before = System.currentTimeMillis(); 
		encryptTextFile1("myfiles/frankenstein.txt");
		long after = System.currentTimeMillis();
				
		System.out.println("Time 1 : " + (after - before) + "ms");
		
		before = System.currentTimeMillis(); 
		encryptTextFile2("myfiles/frankenstein.txt");
		after = System.currentTimeMillis();
		
		System.out.println("Time 2 : " + (after - before) + "ms");
		
		before = System.currentTimeMillis(); 
		encryptTextFile3("myfiles/frankenstein.txt");
		after = System.currentTimeMillis();
		
		System.out.println("Time 3 : " + (after - before) + "ms");
		
	}

}
