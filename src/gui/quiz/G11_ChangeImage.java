package gui.quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G11_ChangeImage {
    
    private static final String[] IMAGE_PATHS = {
        "myfiles/images/animals/puppy.jpg",
        "myfiles/images/animals/puppy2.jpg",
        "myfiles/images/animals/rabbit.jpg"
    };
    
    private ImageIcon[] imageIcons;
    private int imageIndex = 0;
    private JLabel imageLabel;

    public G11_ChangeImage() {
        // 이미지 아이콘 배열 초기화
        imageIcons = new ImageIcon[IMAGE_PATHS.length];
        for (int i = 0; i < IMAGE_PATHS.length; i++) {
            imageIcons[i] = new ImageIcon(IMAGE_PATHS[i]);
        }
        
        JFrame frame = new JFrame("다음");
        frame.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        displayCurrentImage();

        JButton prevBtn = new JButton("이전");
        JButton nextBtn = new JButton("다음");

        prevBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageIndex = (imageIndex - 1 + imageIcons.length) % imageIcons.length;
                displayCurrentImage();
            }
        });

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageIndex = (imageIndex + 1) % imageIcons.length;
                displayCurrentImage();
            }
        });

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(prevBtn);
        panel.add(nextBtn);
        
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 150, 500, 500);
        frame.setVisible(true);
    }

    private void displayCurrentImage() {
        // 현재 이미지 아이콘을 라벨에 설정
        Image img = imageIcons[imageIndex].getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));
    }

    public static void main(String[] args) {
        new G11_ChangeImage();
    }
}