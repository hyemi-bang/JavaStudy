package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E07_Copy1_T {

	public static void main(String[] args) {
		copyTextFilesOnly("./myfiles/", "./mytxtsT/");
		copyImageFilesOnly("./myfiles/", "./myimgesT/");
	}

	// myfiles의 파일들 중 .txt 파일들을 mytxts에 복사
	public static void copyTextFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);

		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue; // 만약에 directory면 그냥 지나가시면 됩니다~
			}

			String fileName = srcFile.getName();
			// 파일이름에 .이 포함되어 있는 경우에 대비하여 indexOf()대신에 뒤에서 부터 찾는 lastIndextOf()사용
			String ext = fileName.substring(fileName.lastIndexOf('.'));

			System.out.printf("파일이름은 %s이고 확장자는 %s입니다. \n", fileName, ext);

			if (ext.equals(".txt")) {
				// 부모 디렉토리와 파일 이름으로 파일 객체를 생성할 수 있다.
				File dstFile = new File(dstDir, fileName);
				FileReader in = null;
				FileWriter out = null;
				try {
					in = new FileReader(srcFile);
					out = new FileWriter(dstFile); // file 객체를 넣을 수도 있다.

					char[] buff = new char[1024];
					int len;

					while ((len = in.read(buff)) != -1) {
						out.write(buff, 0, len);
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						if (out != null) {
							out.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}

	}

	public static Set<String> IMAGE_EXTENSIONS = new HashSet<>();
	
	static {
		IMAGE_EXTENSIONS.add(".jpg");
		IMAGE_EXTENSIONS.add(".png");
		IMAGE_EXTENSIONS.add(".gif");
	}
	// myfiles의 파일들 중 그림 파일들을 myimages폴더에 복사
	public static void copyImageFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);

		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue; 
			}

			String fileName = srcFile.getName();
			String ext = fileName.substring(fileName.lastIndexOf('.'));
			
			//if(ext.equals("jpg")|| ext.equals("png"))  처럼 모든 이미지 파일 확장자를 저장하는 방법도 있지만
			// Set으로 만들어서 정리하면 더 깔끔해보인다
			if(IMAGE_EXTENSIONS.contains(ext)) {
				File dstFile = new File(dstDir, fileName);
				// 이미지 파일은 문자단위가 아닌 바이트 타입으로 복사해주어야한다.
				FileInputStream in = null;
				FileOutputStream out = null;
				try {
					in = new FileInputStream(srcFile);
					out = new FileOutputStream(dstFile);
					
					out.write(in.readAllBytes());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(in != null) {
							in.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						if(out != null) {
							out.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				
			

		}

	}
}
