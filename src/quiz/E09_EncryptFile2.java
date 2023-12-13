package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

import myobj.CaesarCipher.code;

public class E09_EncryptFile2 {

	public static void main(String[] args) {
		encryptFile("myfiles/frankenstein.txt", "myfiles/frankenstein_encrypted.enc", 5888);
		decryptFile("myfiles/frankenstein_encrypted.enc", "myfiles/frankenstein.txt", 5888);

	}

	//frankenstein.txt를 시저 암호방식으로 암호화한 파일 => frankenstein_encrypted.enc를 생성
	public static void encryptFile(String inputFilePath, String outputFilePath, int key) {

		try (BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
				BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));) {
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = in.readLine()) != null) {
				sb.append(line + "\n");
			}
			String originalText = sb.toString();
			String encryptedText = code.encrypt(originalText, key);
			out.write(encryptedText);
			System.out.println("파일 암호화 완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	//4.암호화 했던 파일의 복호화 파일 생성해보기
	public static void decryptFile(String inputFilePath, String outputFilePath, int key) {

		try (BufferedReader in = new BufferedReader(new FileReader(inputFilePath));
				BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));) {
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = in.readLine()) != null) {
				sb.append(line + "\n");
			}
			String encryptedText = sb.toString();
			String decryptedText = code.decrypt(encryptedText, key);
			out.write(encryptedText);
			System.out.println("파일 복호화 완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void microTimeMeasureSpeed() {

		LocalTime startTime = LocalTime.now();
		encryptChar(); // Char 방식으로 암호화하는 속도 측정
		LocalTime endTime = LocalTime.now();

		Duration duration = Duration.between(startTime, endTime);
		long microTime = duration.toNanos() / 1000; // 나노초를 마이크로초로 변환

		System.out.println("Char 방식으로 암호화 시간: " + microTime + " 마이크로세컨드");
	}

	//1.char 방식으로 한 글자씩 암호화하는 속도 측정해보기 
	public static void encryptChar() {
		
		

	}

	//2.char[] 방식으로 암호화하는 속도 측정해보기
	public static void encryptCharArray() {

	}

	//3.버퍼를 추가하여 암호화하는 속도 측정해보기
	public static void encryptBufferedWriter() {

	}

}
