package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G11_Image {

	
	// 해당컴포넌트의 이미지를 setIcon 메서드로 교체할 수 있다
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Image Samples");
		
		
		f.setLayout(new BorderLayout());
		
		JLabel imageLabel = new JLabel(" ");
		
		// 이미지 크기가 알맞지 않은 상태		
		//imageLabel.setIcon(new ImageIcon("myfiles/images/animals/puppy.jpg")); 
		
		// 이미지 크기 수정
		try {
			// 1.이미지 크기를 수정하기 위해 불러온다.
			BufferedImage bufferedImage =
					ImageIO.read(new File("myfiles/images/animals/puppy.jpg"));
			
			// 2. 불러온 이미지로부터 사이즈가 조절된 새로운 인스턴스를 받을 수 있다.
			Image scaledImage = 
					bufferedImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				//getScaledInstance(int width, int height, int hints)
				//hints flags to indicate the type of algorithm to use for image resampling.
			
			imageLabel.setIcon(new ImageIcon(scaledImage));
			
			
			// 2-1. 이미지 일부를 잘라서 활용하는 방법
			//Image subImange = bufferedImage.getSubimage(100, 100, 150, 150);
			
			// 크기조절된 이미지를 라벨에 붙인다
			//imageLabel.setIcon(new ImageIcon(subImange));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//imageLabel.setIcon(null);
		
		JButton southBtn = new JButton("다음");
		
		f.add(imageLabel, "Center");		
		f.add(southBtn, "South");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(100, 150, 500, 500);
		
		
		
		// 연습 다음 버튼을 누르면 이미지가 교체되도록 만들기 (순환되게 만들기)

	}

}
