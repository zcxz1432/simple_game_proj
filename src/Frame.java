import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


class Frame extends JFrame {
	JButton b1, b2, b3, b4, b5, blast;
	
	public Frame() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,550);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		//pp.setBackground(bg);
		p2.setBorder(tb);
	    p2.setBounds(5,5,325,210);
	    p.add(p2);
		
		
		b1 = new JButton("공격 버튼 #1");
		p.add(b1);
		
		b2 = new JButton("방어 버튼 #2");
		p.add(b2);
		
		b3 = new JButton("휴식 버튼 #3");
		p.add(b3);
		
		b4 = new JButton("은신 버튼 #4");
		p.add(b4);
		
		b5 = new JButton("종료 버튼 #5");
		p.add(b5);
		
		blast = new JButton("마지막 박스");
		p.add(blast);
		
		
		
		b1.setBounds(8, 230, 64, 60);
		b2.setBounds(72, 230, 64, 60);
		b3.setBounds(136, 230, 64, 60);
		b4.setBounds(200, 230, 64, 60);
		b5.setBounds(264, 230, 64, 60);
		blast.setBounds(8, 330, 320, 160);

		
		add (p);
		setVisible(true);
		
	}

}
