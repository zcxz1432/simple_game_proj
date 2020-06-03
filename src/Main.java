import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame {
   
   Image background = new ImageIcon(Main.class.getResource("introimage.png")).getImage();
   
   
   public Main() {
   Firstfram();
   }

   public void Firstfram() {
      setTitle("Fight of Two Four");// 창의 타이틀
      setSize(330, 530);// 프레임의 크기
      setResizable(false);// 창의 크기를 변경하지 못하게
      setLayout(null);
      setVisible(true);// 창이 보이게
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
   }
   public void paint(Graphics g) {
      g.drawImage(background, 0, 0, null);
   }
   
   public static void main(String[] args) {
      new Main();
      
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