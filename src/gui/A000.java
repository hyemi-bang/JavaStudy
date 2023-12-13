package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A000 extends JFrame {

	public A000() {
		setTitle("GridBagLayout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GridBagLayout 설정
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// 첫 번째 행
		gbc.gridx = 150;
		gbc.gridy = 0;
		gbc.weighty = 1.0; // 첫 번째 행의 높이를 설정
		JButton button1 = new JButton("Button 1");
		add(button1, gbc);

		// 두 번째 행
		gbc.gridx = 200;
		gbc.gridy = 0;
		gbc.weighty = 2.0; // 두 번째 행의 높이를 설정
		JButton button2 = new JButton("Button 2");
		add(button2, gbc);

		// 세 번째 행
		gbc.gridx = 300;
		gbc.gridy = 2;
		gbc.weighty = 1.0; // 세 번째 행의 높이를 설정
		JButton button3 = new JButton("Button 3");
		add(button3, gbc);
		
		gbc.gridx = 300;
		gbc.gridy = 2;
		gbc.weighty = 1.0; // 세 번째 행의 높이를 설정
		JButton button4 = new JButton("Button 4");
		add(button4, gbc);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A000();
	}
}
