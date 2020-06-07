import java.awt.BorderLayout;
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
		c1.setFocusPainted(false);

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
		c2.setFocusPainted(false);

		p1.add(c2);
		scrollPane = new JScrollPane(p1);
		setContentPane(scrollPane);

		c2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new Window();

			}

		});
	}

	class Window extends JFrame {

		Window() {
			setTitle("how to play");

			JPanel WindowContainer = new JPanel();
			setContentPane(WindowContainer);
			JLabel label = new JLabel("<html>'Fight of Two Four'<br>" + "<br>" + "4���� ��ų�� ����� �λ縦 óġ�ϰ� ������ <br>"
					+ "<br>" + "���� : �λ翡�� ������ 1, ��翡�� ������ 2<br>" + "��� : ��� �� ����<br>" + "ġ�� : ��� ü�� ȸ�� 1<br>"
					+ "���� : �λ翡�� ������ ����(���� 1ȸ ����ȭ)<br>" + "���� : ���� ����<br>");
			JButton b = new JButton("OK");
			b.setBackground(Color.WHITE);
			b.setBounds(130, 230, 70, 30);
			b.setFont(new Font("���", Font.PLAIN, 15));
			b.setFocusPainted(false);

			WindowContainer.add(label);
			WindowContainer.add(b);
			WindowContainer.setLayout(null);
			label.setBounds(30, 0, 340, 250);

			setSize(160, 120);
			setBounds(5, 255, 340, 320);
			setVisible(true);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
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