import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main extends JFrame {
	JScrollPane scrollPane;

	public Main() {
		JPanel p1 = new JPanel() {
			public void paintComponent(Graphics g) {
				setBackground(Color.white);
				super.paintComponent(g);
		
	
			}
		};
		
		JLabel label = new JLabel("");
		label.setBounds(50, 130, 250, 50);
		label.setText("Fight of Two Four");
		label.setFont(new Font("���", Font.PLAIN, 30));

		label.setVisible(true);
		
		p1.add(label);


		p1.setLayout(null);
		p1.setBackground(Color.white);

		JButton c1 = new JButton("start");
		c1.setBounds(110, 300, 100, 50);
		c1.setFont(new Font("���", Font.PLAIN, 28));
		c1.setBackground(Color.white);
		c1.setBorderPainted(false);

		p1.add(c1);
		scrollPane = new JScrollPane(p1);
		setContentPane(scrollPane);

		c1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				p1.setVisible(false);
				new Frame();

			}

		});

		JButton c2 = new JButton("how to play");
		c2.setBounds(60, 350, 200, 50);
		c2.setFont(new Font("���", Font.PLAIN, 28));
		c2.setBackground(Color.white);
		c2.setBorderPainted(false);

		p1.add(c2);
		scrollPane = new JScrollPane(p1);
		setContentPane(scrollPane);

		c1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}

		});
	}

	public static void main(String[] args) {
		Main frame = new Main();
		frame.setTitle("Fight of Two Four");// â�� Ÿ��Ʋ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ���������� ����ǰ�
		frame.setSize(350, 550);// �������� ũ��
		frame.setResizable(false);// â�� ũ�⸦ �������� ���ϰ�
		frame.setVisible(true);// â�� ���̰�

		File file = new File("Sky.wav");
		System.out.println(file.exists()); // true

		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}