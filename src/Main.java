import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	Image background = new ImageIcon(Main.class.getResource("introimage.png")).getImage();
	
	
	public Main() {
	Firstfram();
	}

	public void Firstfram() {
		setTitle("Fight of Two Four");// â�� Ÿ��Ʋ
		setSize(330, 530);// �������� ũ��
		setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		setLayout(null);
		setVisible(true);// â�� ���̰�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
	}
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}