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
		label.setFont(new Font("고딕", Font.PLAIN, 30));

		label.setVisible(true);

		p1.add(label);

		p1.setLayout(null);
		p1.setBackground(Color.white);

		JButton c1 = new JButton("start");
		c1.setBounds(110, 300, 100, 50);
		c1.setFont(new Font("고딕", Font.PLAIN, 28));
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
		c2.setFont(new Font("고딕", Font.PLAIN, 28));
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
			JLabel label = new JLabel("<html>'Fight of Two Four'<br>" + "<br>" + "4가지 스킬을 사용해 두사를 처치하고 레벨업 <br>"
					+ "<br>" + "공격 : 두사에게 데미지 1, 용사에게 데미지 2<br>" + "방어 : 용사 방어막 생성<br>" + "치유 : 용사 체력 회복 1<br>"
					+ "은신 : 두사에게 보이지 않음(공격 1회 무력화)<br>" + "종료 : 게임 종료<br>");
			JButton b = new JButton("OK");
			b.setBackground(Color.WHITE);
			b.setBounds(130, 230, 70, 30);
			b.setFont(new Font("고딕", Font.PLAIN, 15));
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
		frame.setTitle("Fight of Two Four");// 창의 타이틀
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
		frame.setSize(350, 550);// 프레임의 크기
		frame.setResizable(false);// 창의 크기를 변경하지 못하게
		frame.setVisible(true);// 창이 보이게

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