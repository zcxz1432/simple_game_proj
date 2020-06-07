import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class lv {
	public static int level1 = 1;

}

class label {
	public static JLabel la1;

}

class Frame extends JFrame {
	int num1 = 10;
	int num2 = 10;
	JButton b1, b2, b3, b4, b5;

	public Frame() {
		setTitle("Fight of Two Four");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 550);
		JPanel p = new JPanel();
		p.setLayout(null);

		Image img1 = null;
		Image img2 = null;
		Image img3 = null;
		Image img4 = null;
		Image img5 = null;
		Image img6 = null;
		Image img7 = null;
		Image img8 = null;

		try {

			File image1 = new File("Images/play.png");
			img1 = ImageIO.read(image1);
			File image2 = new File("Images/enemy.png");
			img2 = ImageIO.read(image2);
			File image3 = new File("Images/attack.png");
			img3 = ImageIO.read(image3);
			File image4 = new File("Images/defense.png");
			img4 = ImageIO.read(image4);
			File image5 = new File("Images/heal.png");
			img5 = ImageIO.read(image5);
			File image6 = new File("Images/hiding.png");
			img6 = ImageIO.read(image6);
			File image7 = new File("Images/end.png");
			img7 = ImageIO.read(image7);
			File image8 = new File("Images/shield.png");
			img8 = ImageIO.read(image8);

		} catch (IOException e) {
		}

		TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
		JPanel p2 = new JPanel();
		p2.setLayout(null);

		p2.setBorder(tb);
		p2.setBounds(5, 5, 325, 210);
		p.add(p2);

		JLabel label1 = new JLabel(new ImageIcon(img1));
		p.add(label1);
		label1.setBounds(27, 35, 100, 100);

		JLabel label3 = new JLabel("용사");
		label3.setBounds(53, 125, 100, 50);
		p.add(label3);

		JLabel label4 = new JLabel("두사");
		label4.setBounds(235, 125, 100, 50);
		p.add(label4);

		JLabel label2 = new JLabel(new ImageIcon(img2));
		p2.setOpaque(false);
		p.add(label2);
		label2.setBounds(205, 43, 90, 90);

		label.la1 = new JLabel("lv." + lv.level1);
		label.la1.setBounds(82, 125, 100, 50);
		p.add(label.la1);

		JProgressBar hp, hp2;
		hp = new JProgressBar(0, 10);
		hp.setValue(num1);
		hp.setStringPainted(false);
		hp.setBounds(53, 160, 50, 11);
		// hp.setBackground(Color.red);
		hp.setForeground(Color.red);

		add(hp);

		hp2 = new JProgressBar(0, 10);
		hp2.setValue(num2);
		hp2.setStringPainted(false);
		hp2.setBounds(235, 160, 50, 12);
		// hp2.setBackground(Color.red);
		hp2.setForeground(Color.red);

		add(hp2);

		b1 = new JButton("공격");
		b1.setBackground(Color.WHITE);
		p.add(b1);

		b2 = new JButton("방어");
		b2.setBackground(Color.WHITE);
		p.add(b2);

		b3 = new JButton("치유");
		b3.setBackground(Color.WHITE);
		p.add(b3);

		b4 = new JButton("은신");
		b4.setBackground(Color.WHITE);
		p.add(b4);

		b5 = new JButton("종료");
		b5.setBackground(Color.WHITE);
		p.add(b5);

		JLabel label5 = new JLabel(new ImageIcon(img3));
		p.add(label5);
		label5.setBounds(11, 225, 60, 60);
		JLabel label6 = new JLabel(new ImageIcon(img4));
		p.add(label6);
		label6.setBounds(75, 225, 60, 60);
		JLabel label7 = new JLabel(new ImageIcon(img5));
		p.add(label7);
		label7.setBounds(139, 225, 60, 60);
		JLabel label8 = new JLabel(new ImageIcon(img6));
		p.add(label8);
		label8.setBounds(203, 225, 60, 60);
		JLabel label9 = new JLabel(new ImageIcon(img7));
		p.add(label9);
		label9.setBounds(267, 225, 60, 60);
		JLabel label10 = new JLabel(new ImageIcon(img8));
		p.add(label10);
		label10.setBounds(27, 35, 100, 100);
		label10.setVisible(false);

		JLabel label = new JLabel("");
		p.add(label);
		label.setBounds(8, 330, 320, 160);

		b1.setBounds(8, 290, 64, 25);
		b2.setBounds(72, 290, 64, 25);
		b3.setBounds(136, 290, 64, 25);
		b4.setBounds(200, 290, 64, 25);
		b5.setBounds(264, 290, 64, 25);

		add(p);
		setVisible(true);

		b4.addActionListener(new ActionListener() { // 은신

			public void actionPerformed(ActionEvent e) {
				label1.setVisible(false);
				hp.setVisible(false);
				label10.setVisible(false);

				label.setText("용사님이 두사의 눈앞에서 사라졌습니다 !");
			}

		});
		b1.addActionListener(new ActionListener() { // 공격

			public void actionPerformed(ActionEvent e) {

				if (num2 <= 0 && num1 >= 1) {
					label.setText("용사님이 두사를 처치했습니다 !");
					new Levelup();
					hp2.setValue(num2 = 10);

				} else if (num1 <= 0) {
					label.setText("<html>용사님의 체력이 바닥났습니다 !" + "<br> 게임을 다시 시작해주세요 !");
					label.setVisible(true);
					hp.setValue(num1 = 0);

					new Restart();

				} else {
					label.setText("<html> 용사님이 두사에게 1의 피해를 입혔습니다 ! " + "<br> 용사님은 두사에게 2의 피해를 입었습니다 !");

					hp2.setValue(num2 - 1);
					num2 = num2 - 1;

					if (label1.isVisible() == true)

					{
						hp.setValue(num1 - 2);
						num1 = num1 - 2;
					}

					hp.setVisible(true);
					hp2.setVisible(true);
					label10.setVisible(false);

					label1.setVisible(true);

				}

			}

		});

		b2.addActionListener(new ActionListener() { // 방어

			public void actionPerformed(ActionEvent e) {
				label10.setVisible(true);

				label1.setVisible(true);
				hp.setVisible(true);

				label.setText("용사님이 방어막 안으로 숨었습니다 !");

			}

		});

		b3.addActionListener(new ActionListener() { // 치유

			public void actionPerformed(ActionEvent e) {

				if (num1 >= 10) {
					label.setText("용사님이 체력이 모두 회복되었습니다!");
					label.setVisible(true);
					hp.setValue(num1 = 10);
					num1 = 10;

				} else if (num1 <= 0) {
					label.setText("<html> 용사님의 체력이 바닥났습니다 !" + "<br> 게임을 다시 시작해주세요 !");
					label.setVisible(true);
					hp.setValue(num1 = 0);

					new Restart();

				} else
					label.setText("용사님이 +1만큼의 체력을 회복했습니다 !");
				label.setVisible(true);
				hp.setValue(num1 = num1 + 1);

				hp2.setValue(num2);

				label1.setVisible(true);
				label10.setVisible(false);

				hp.setVisible(true);
				hp2.setVisible(true);

			}

		});

		b5.addActionListener(new ActionListener() { // 종료

			public void actionPerformed(ActionEvent e) {
				new newWindow();
			}
		});
	}

	class newWindow extends JFrame {

		newWindow() {
			setTitle("종료");

			JPanel NewWindowContainer = new JPanel();
			setContentPane(NewWindowContainer);

			JLabel newlabel = new JLabel("게임을 종료할까요?");
			JButton btn = new JButton("네");
			JButton btn2 = new JButton("아니오");
			NewWindowContainer.add(newlabel);

			NewWindowContainer.add(btn);
			NewWindowContainer.add(btn2);

			setSize(160, 120);
			setVisible(true);

			btn.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					System.exit(0);

				}
			});

			btn2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					dispose();

				}
			});

		}
	}
}

class Restart extends JFrame {

	Restart() {
		setTitle("");

		JPanel RestartContainer = new JPanel();
		setContentPane(RestartContainer);

		JLabel newlabel = new JLabel("<html>게임을 다시 시작하시겠습니까 ?");
		JButton btn = new JButton("네");
		JButton btn2 = new JButton("아니오");
		RestartContainer.add(newlabel);

		RestartContainer.add(btn);
		RestartContainer.add(btn2);

		setSize(160, 120);
		setBounds(5, 255, 340, 100);
		setVisible(true);

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Restart();

			}
		});

		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

	private void Restart() {
		dispose();
		new Frame();
		repaint();
	}
}

class Levelup extends JFrame {

	Levelup() {
		setTitle("레벨업 !");

		JPanel LevelupContainer = new JPanel();
		setContentPane(LevelupContainer);

		JLabel newlabel = new JLabel("<html>축하드립니다 ");
		JButton btn = new JButton("♥ Level UP ♥");
		LevelupContainer.add(newlabel);

		LevelupContainer.add(btn);

		setSize(160, 120);
		setBounds(5, 255, 340, 100);
		setVisible(true);
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				lv.level1 = lv.level1 + 1;
				label.la1.setText("lv." + lv.level1);

			}
		});
	}
}