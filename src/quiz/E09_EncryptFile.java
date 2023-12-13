package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import myobj.CaesarCipher.code;

public class E09_EncryptFile {
	
	/*
	frankenstein.txt를 시저 암호방식으로 암호화한 파일
	frankenstein_encrypted.enc를 생성
	
	1.char 방식으로 한 글자씩 암호화하는 속도 측정해보기 
	2.char[] 방식으로 암호화하는 속도 측정해보기
	3.버퍼를 추가하여 암호화하는 속도 측정해보기
	4.암호화 했던 파일의 복호화 파일 생성해보기
	
	// 작업하기 시작 전 시간 생성하고 작업 끝난 시간을 빼라 : 마이크로세컨드로
	
	*/
	
	
	public static void main(String[] args) {
		
		// 암호화 code.encrypt(null, 0); 
		// 복호화 code.decrypt(null, 0); 
		
		// frankenstein.txt를 시저 암호방식으로 암호화한 파일	frankenstein_encrypted.enc를 생성
		// txt 파일 읽기 !
		try {
			String inputFilePath = "myfiles/frankenstein.txt";
			BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
			StringBuilder sb = new StringBuilder();
			
			String line;
			while((line = in.readLine())!= null) {
				sb.append(line+"\n");
			}
			
			in.close();
			String originalText = sb.toString();
			
			// 읽을 파일 암호화하기
			String encryptedText = code.encrypt(originalText, 5895);
			// 암호화한 파일 frankenstein_encrypted.enc를 생성
			String outputFilePath = "myfiles/frankenstein_encrypted.enc";
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));
			
			out.write(encryptedText);
			out.close();
			
			System.out.println("frankenstein_encrypted.enc 파일생성완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//1.char 방식으로 한 글자씩 암호화하는 속도 측정해보기 
		
		//2.char[] 방식으로 암호화하는 속도 측정해보기
		
		//3.버퍼를 추가하여 암호화하는 속도 측정해보기
		
		//4.암호화 했던 파일의 복호화 파일 생성해보기

	}

}
