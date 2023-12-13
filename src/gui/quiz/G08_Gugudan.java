package gui.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class G08_Gugudan extends JFrame {
	
	/*
		# 구구단 출력
		1) 프로그램을 처음 시작하면 구구단 2단이 출력된 상태로 시작
		2) + 버튼을 누르면 단이 증가하면 구구단 내용이 바뀜 (최대 9단까지/ 9단에서는 + 버튼 비활성화)
		3) - 버튼을 누르면 단이 감소하며 구구단 내용이 바뀜(최소 2단까지/ 2단에서는 - 버튼 비활성화)
		
		+ 출력은 gui화면에
	*/
	private int currentStep = 2;

	private String generateGugudan(int step) {
	    String table = "<html>" + step + "단<br>";
	    for (int mul = 1; mul <= 9; ++mul) {
	        table += step + " X " + mul + " = " + (step * mul) + "<br>";
	    }
	    return table;
	}



	public G08_Gugudan() {
		super("Gugudan Program");
		setLayout(null);

		JLabel label = new JLabel(generateGugudan(currentStep));
		label.setBounds(100, 100, 300, 200);
		label.setFont(new Font("굴림체", Font.BOLD, 15));
		add(label);
		
		JButton plus = new JButton("+");
		plus.setBackground(Color.black);
		plus.setForeground(new Color(214,206,147));
		plus.setFont(new Font("굴림체", Font.BOLD, 10));
		plus.setBounds(380, 300, 50, 30);
		
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentStep < 9) {
					++currentStep;
					label.setText(generateGugudan(currentStep));
				}
				
			}
			
		});
		
		JButton minus = new JButton("-");
		minus.setBackground(Color.YELLOW);
		minus.setForeground(Color.BLACK);
		minus.setFont(new Font("굴림체", Font.BOLD, 10));
		minus.setBounds(50, 300, 50, 30);
		
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(currentStep > 2) {
					--currentStep;
					label.setText(generateGugudan(currentStep));
				}
				
			}
			
		});
		
		add(plus);
		add(minus);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new G08_Gugudan();

	}

}






