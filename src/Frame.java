import java.awt.Color;
import java.awt.FlowLayout;
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



class Frame extends JFrame  {
	JButton b1, b2, b3, b4, b5, blast;
	
	public Frame() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,550);
		JPanel p = new JPanel();
		p.setLayout(null);
		

	    Image img1 = null;
	    Image img2 = null;
	    Image img3 = null;
	    Image img4 = null;
	    Image img5 = null;
	    Image img6 = null;
	    Image img7 = null;
	    
	    try {
	       
	        File image1 = new File("play.png");
	        img1 = ImageIO.read(image1);
	        File image2 = new File("enemy.png");
	        img2 = ImageIO.read(image2);
	        File image3 = new File("screenshots/attack.png");
	        img3 = ImageIO.read(image3);
	        File image4 = new File("screenshots/defense.png");
	        img4 = ImageIO.read(image4);
	        File image5 = new File("screenshots/heal.png");
	        img5 = ImageIO.read(image5);
	        File image6 = new File("screenshots/hiding.png");
	        img6 = ImageIO.read(image6);
	        File image7 = new File("screenshots/end.png");
	        img7 = ImageIO.read(image7);
	       
	    } catch (IOException e) {
	    }
	    
	    TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		
		p2.setBorder(tb);
	    p2.setBounds(5,5,325,210);
	    p.add(p2);
		
	    
	    JLabel label1 = new JLabel(new ImageIcon(img1));
	    p.add(label1);
	    label1.setBounds(27,35,100,100);
	    
	    JLabel label3 = new JLabel("용사");
	    label3.setBounds(53, 125, 100, 50);
	    p.add(label3);
	    
	    JLabel label4 = new JLabel("두사");
	    label4.setBounds(235, 125, 100, 50);
	    p.add(label4);
	    
	    
	
	    JLabel label2 = new JLabel(new ImageIcon(img2));
	    p2.setOpaque(false);
	    p.add(label2);
	    label2.setBounds(205,43,90,90);
	    
	 
	    JProgressBar hp, hp2;
	    	hp = new JProgressBar(0,10);
	    	hp.setValue(10);
	    	hp.setStringPainted(false);
	    	hp.setBounds(53,160,50,11);
	    	hp.setBackground(Color.red);
	    	hp.setForeground(Color.red);
	  
	    	add(hp);
	  
	          hp2 = new JProgressBar(0,10);
	    	  hp2.setValue(10);
	    	  hp2.setStringPainted(false);
	          hp2.setBounds(235,160,50,12);
	          hp2.setBackground(Color.red);
	          hp2.setForeground(Color.red);
	     
	          add(hp2);

	          
		b1 = new JButton("공격");
		p.add(b1);
		
		b2 = new JButton("방어");
		p.add(b2);
		
		b3 = new JButton("치유");
		p.add(b3);
		
		b4 = new JButton("은신");
		p.add(b4);
		
		b5 = new JButton("종료");
		p.add(b5);
		
		blast = new JButton("마지막 박스");
		p.add(blast);
		
		JLabel label5 = new JLabel(new ImageIcon(img3));
	    p.add(label5);
	    label5.setBounds(11,225,60,60);
	    JLabel label6 = new JLabel(new ImageIcon(img4));
	    p.add(label6);
	    label6.setBounds(75,225,60,60);
	    JLabel label7 = new JLabel(new ImageIcon(img5));
	    p.add(label7);
	    label7.setBounds(139,225,60,60);
	    JLabel label8 = new JLabel(new ImageIcon(img6));
	    p.add(label8);
	    label8.setBounds(203,225,60,60);
	    JLabel label9 = new JLabel(new ImageIcon(img7));
	    p.add(label9);
	    label9.setBounds(267,225,60,60);
		
		b1.setBounds(8, 290, 64, 25);
		b2.setBounds(72, 290, 64, 25);
		b3.setBounds(136, 290, 64, 25);
		b4.setBounds(200, 290, 64, 25);
		b5.setBounds(264, 290, 64, 25);
		blast.setBounds(8, 330, 320, 160);
		
		
		add (p);
		setVisible(true);
		
         b4.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				label1.setVisible(false);
				hp.setVisible(false);
				  }
		
		});
         b1.addActionListener(new ActionListener() {
     		
 			
 			public void actionPerformed(ActionEvent e) {
 				 
 				label1.setVisible(true);
 				hp.setVisible(true);
 	  }
 	
 		});
 		
 	b2.addActionListener(new ActionListener() {
 		
 			
 			public void actionPerformed(ActionEvent e) {
 				 
 				label1.setVisible(true);
 				hp.setVisible(true);

 				  }
 	
 		});
 		
 	b3.addActionListener(new ActionListener() {
 		
 		
 		public void actionPerformed(ActionEvent e) {
 			 
 			label1.setVisible(true);
 			hp.setVisible(true);

 			  }

 	});
         
	
	b5.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			new newWindow();
		}
	});
		}

		
	}
	
	class newWindow extends JFrame {
		
		newWindow()  {
			setTitle("종료");
			
			JPanel NewWindowContainer = new JPanel();
			setContentPane(NewWindowContainer);
			
			JLabel newlabel = new JLabel("게임을 종료할까요?");
			JButton btn = new JButton("네");
			JButton btn2 = new JButton("아니오");
			NewWindowContainer.add(newlabel);
			
			NewWindowContainer.add(btn);
			NewWindowContainer.add(btn2);
			
			setSize(160,120);
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
				


	
	
	
	

