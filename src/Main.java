import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	JScrollPane scrollPane;
   
   
   public Main() {
	   ImageIcon background = new ImageIcon("screenshots/introimage.png");
	   
	   JPanel panel = new JPanel() {
		   public void paintComponent(Graphics g) {
			   g.drawImage(background.getImage(), 0, 0, null);
			   setOpaque(false);
			   super.paintComponent(g);
		   }
	   };
	   
	   panel.setLayout(null);
	   
	   JButton button = new JButton("introduction");
	   button.setBackground(Color.WHITE);
	   button.setBounds(80, 365, 170, 20);
	   button.setFont(new Font("고딕",Font.ITALIC, 23));
	   button.setBorderPainted(false);
	   button.setFocusPainted(false);
	   panel.add(button);
	   scrollPane = new JScrollPane(panel);
	   setContentPane(scrollPane);
	   
	   button.addActionListener(new ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	        	 
	         }

	      });
   }
   
   


   
   public static void main(String[] args) {
      Main frame = new Main();
      frame.setTitle("Fight of Two Four");// 창의 타이틀
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
      frame.setSize(330, 530);// 프레임의 크기
      frame.setResizable(false);// 창의 크기를 변경하지 못하게
      frame.setVisible(true);// 창이 보이게
      

      
      
      
      File file = new File("Sky.wav");
      System.out.println(file.exists()); //true
      
      try {
         AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
      }
   }
