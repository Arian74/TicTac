package Arian_Projects_K_K;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


@SuppressWarnings("serial")
public class KolkoKrzyzyk extends JFrame {

	
	private static String startGame="X";
	private int xCounter=0;
	private int oCounter=0;
	private static Color color=new Color(166, 171, 181);//Srebrny Aluminiowy
	private Color colorX=new Color(252, 28, 20);//Swietlisty pomarańcz
	private Color colorO=new Color(230, 28, 102);//Amarant
	private Color colorW=new Color(51, 0, 204);//Chabrowy
	
	static JPanel panel = new JPanel(); // tworzy pole na klawiaturę w formularzu
    static JLabel lblPlayerX =new JLabel("Wynik gracza X :"); // tworzy pole tekstowe
    static JLabel lblPlayerO =new JLabel("Wynik gracza O :"); // tworzy pole tekstowe
    JLabel jlblPlayerX =new JLabel(); // tworzy pole tekstowe
    JLabel jlblPlayerO =new JLabel(); // tworzy pole tekstowe
    
    static JButton button1 = new RoundButton("");
    static JButton button2 = new RoundButton("");
    static JButton button3 = new RoundButton("");
    static JButton button4 = new RoundButton("");
    static JButton button5 = new RoundButton("");
    static JButton button6 = new RoundButton("");
    static JButton button7 = new RoundButton("");
    static JButton button8 = new RoundButton("");
    static JButton button9 = new RoundButton("");
   // static JButton button1=new JButton("");
   // static JButton button2=new JButton("");
   // static JButton button3=new JButton("");
   // static JButton button4=new JButton("");
   // static JButton button5=new JButton("");
   // static JButton button6=new JButton("");
   // static JButton button7=new JButton("");
   // static JButton button8=new JButton("");
   // static JButton button9=new JButton("");
    static JButton buttonClear=new JButton("RESET");
    static JButton buttonExit=new JButton("EXIT");
    public static JFrame frame ;
	
		public KolkoKrzyzyk(String title) 
		{
		initComponents();
		}
	
		private static void chose_a_Player() 
		{
			if(startGame.equalsIgnoreCase("X")) 
			{
				startGame="O";	
			}
			else 
			{
				startGame="X";
			}
		}
		
		private void gameScore() // Wyświetla punkty w grze
		{
		panel.add(jlblPlayerX);
		jlblPlayerX.setText(String.valueOf(xCounter));
		jlblPlayerX.setHorizontalAlignment(SwingConstants.RIGHT);
		Font tfontX=new Font("Arial", Font.BOLD,33);
		jlblPlayerX.setFont(tfontX);
		jlblPlayerX.setForeground(Color.black);
		jlblPlayerX.setBounds(601, 225 ,325 ,50);
		System.out.println(xCounter);
		panel.add(jlblPlayerO);
		jlblPlayerO.setText(String.valueOf(oCounter));
		jlblPlayerO.setHorizontalAlignment(SwingConstants.RIGHT);
		Font tfontO=new Font("Arial", Font.BOLD,33);
		jlblPlayerO.setFont(tfontO);
		jlblPlayerO.setForeground(Color.black);
		jlblPlayerO.setBounds(601, 300 ,325 ,50);
		}
	
		private void winningGame() 
		{
			String b1=button1.getText();
			String b2=button2.getText();
			String b3=button3.getText();
	
			String b4=button4.getText();
			String b5=button5.getText();
			String b6=button6.getText();
			
			String b7=button7.getText();
			String b8=button8.getText();
			String b9=button9.getText();
			
				if(( b1==("X") && b2==("X") && b3==("X"))||( b1==("X") && b3==("X") && b2==("X"))||( b2==("X") && b3==("X") && b1==("X"))
				  ||( b3==("X") && b2==("X") && b1==("X"))||( b3==("X") && b1==("X") && b2==("X")||( b2==("X") && b1==("X") && b3==("X")))) 
				{
					button1.setBackground(colorW);
					button2.setBackground(colorW);
					button3.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b4==("X") && b5==("X") && b6==("X"))||( b4==("X") && b6==("X") && b5==("X"))||( b5==("X") && b6==("X") && b4==("X"))
				  ||( b6==("X") && b5==("X") && b4==("X"))||( b6==("X") && b4==("X") && b5==("X")||( b5==("X") && b4==("X") && b6==("X")))) 
				{
					button4.setBackground(colorW);
					button5.setBackground(colorW);
					button6.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b7==("X") && b8==("X") && b9==("X"))||( b7==("X") && b9==("X") && b8==("X"))||( b8==("X") && b9==("X") && b7==("X"))
				  ||( b9==("X") && b8==("X") && b7==("X"))||( b9==("X") && b7==("X") && b8==("X")||( b8==("X") && b7==("X") && b9==("X")))) 
				{
					button7.setBackground(colorW);
					button8.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
			
				if(( b1==("X") && b4==("X") && b7==("X"))||( b1==("X") && b7==("X") && b4==("X"))||( b4==("X") && b7==("X") && b1==("X"))
				  ||( b7==("X") && b4==("X") && b1==("X"))||( b7==("X") && b1==("X") && b4==("X")||( b4==("X") && b1==("X") && b7==("X")))) 
				{
					button1.setBackground(colorW);
					button4.setBackground(colorW);
					button7.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b2==("X") && b5==("X") && b8==("X"))||( b2==("X") && b8==("X") && b5==("X"))||( b5==("X") && b8==("X") && b2==("X"))
				  ||( b8==("X") && b5==("X") && b2==("X"))||( b8==("X") && b2==("X") && b5==("X")||( b5==("X") && b2==("X") && b8==("X")))) 
				{
					button2.setBackground(colorW);
					button5.setBackground(colorW);
					button8.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b3==("X") && b6==("X") && b9==("X"))||( b3==("X") && b9==("X") && b6==("X"))||( b6==("X") && b9==("X") && b3==("X"))
				  ||( b9==("X") && b6==("X") && b3==("X"))||( b9==("X") && b3==("X") && b6==("X")||( b6==("X") && b3==("X") && b9==("X")))) 
				{
					button3.setBackground(colorW);
					button6.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b1==("X") && b5==("X") && b9==("X"))||( b1==("X") && b9==("X") && b5==("X"))||( b5==("X") && b9==("X") && b1==("X"))
				  ||( b9==("X") && b5==("X") && b1==("X"))||( b9==("X") && b1==("X") && b5==("X")||( b5==("X") && b1==("X") && b9==("X")))) 
				{
					button1.setBackground(colorW);
					button5.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
				if(( b3==("X") && b5==("X") && b7==("X"))||( b3==("X") && b7==("X") && b5==("X"))||( b5==("X") && b7==("X") && b3==("X"))
				  ||( b7==("X") && b5==("X") && b3==("X"))||( b7==("X") && b3==("X") && b5==("X")||( b5==("X") && b3==("X") && b7==("X")))) 
				{
					button3.setBackground(colorW);
					button5.setBackground(colorW);
					button7.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					xCounter++;
					gameScore();
				}
	// "O"-----------------------------------------------------------------------------------------

				if(( b1==("O") && b2==("O") && b3==("O"))||( b1==("O") && b3==("O") && b2==("O"))||( b2==("O") && b3==("O") && b1==("O"))
				  ||( b3==("O") && b2==("O") && b1==("O"))||( b3==("O") && b1==("O") && b2==("O")||( b2==("O") && b1==("O") && b3==("O")))) 
				{
					button1.setBackground(colorW);
					button2.setBackground(colorW);
					button3.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b4==("O") && b5==("O") && b6==("O"))||( b4==("O") && b6==("O") && b5==("O"))||( b5==("O") && b6==("O") && b4==("O"))
				  ||( b6==("O") && b5==("O") && b4==("O"))||( b6==("O") && b4==("O") && b5==("O")||( b5==("O") && b4==("O") && b6==("O")))) 
				{
					button4.setBackground(colorW);
					button5.setBackground(colorW);
					button6.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b7==("O") && b8==("O") && b9==("O"))||( b7==("O") && b9==("O") && b8==("O"))||( b8==("O") && b9==("O") && b7==("O"))
				  ||( b9==("O") && b8==("O") && b7==("O"))||( b9==("O") && b7==("O") && b8==("O")||( b8==("O") && b7==("O") && b9==("O")))) 
				{
					button7.setBackground(colorW);
					button8.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
			
				if(( b1==("O") && b4==("O") && b7==("O"))||( b1==("O") && b7==("O") && b4==("O"))||( b4==("O") && b7==("O") && b1==("O"))
				  ||( b7==("O") && b4==("O") && b1==("O"))||( b7==("O") && b1==("O") && b4==("O")||( b4==("O") && b1==("O") && b7==("O")))) 
				{
					button1.setBackground(colorW);
					button4.setBackground(colorW);
					button7.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b2==("O") && b5==("O") && b8==("O"))||( b2==("O") && b8==("O") && b5==("O"))||( b5==("O") && b8==("O") && b2==("O"))
				  ||( b8==("O") && b5==("O") && b2==("O"))||( b8==("O") && b2==("O") && b5==("O")||( b5==("O") && b2==("O") && b8==("O")))) 
				{
					button2.setBackground(colorW);
					button5.setBackground(colorW);
					button8.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b3==("O") && b6==("O") && b9==("O"))||( b3==("O") && b9==("O") && b6==("O"))||( b6==("O") && b9==("O") && b3==("O"))
				  ||( b9==("O") && b6==("O") && b3==("O"))||( b9==("O") && b3==("O") && b6==("O")||( b6==("O") && b3==("O") && b9==("O")))) 
				{
					button3.setBackground(colorW);
					button6.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b1==("O") && b5==("O") && b9==("O"))||( b1==("O") && b9==("O") && b5==("O"))||( b5==("O") && b9==("O") && b1==("O"))
				  ||( b9==("O") && b5==("O") && b1==("O"))||( b9==("O") && b1==("O") && b5==("O")||( b5==("O") && b1==("O") && b9==("O")))) 
				{
					button1.setBackground(colorW);
					button5.setBackground(colorW);
					button9.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
				if(( b3==("O") && b5==("O") && b7==("O"))||( b3==("O") && b7==("O") && b5==("O"))||( b5==("O") && b7==("O") && b3==("O"))
				  ||( b7==("O") && b5==("O") && b3==("O"))||( b7==("O") && b3==("O") && b5==("O")||( b5==("O") && b3==("O") && b7==("O")))) 
				{
					button3.setBackground(colorW);
					button5.setBackground(colorW);
					button7.setBackground(colorW);
					JOptionPane.showMessageDialog(this, "Gracz O wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
					oCounter++;
					gameScore();
				}
		}
	
		private void initComponents() 
		{

		//I button line :D--------------------------------------------------------------------
			panel.add(button1);
			button1.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont1=new Font("Arial", Font.BOLD,110);
			button1.setFont(tfont1);
			button1.setForeground(Color.black);
			button1.setBackground(color);
			button1.setBounds(5	, 5, 200, 200);
			button1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
			    {
					button1.setText(startGame);
						if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button1.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button1.setForeground(colorO);
			    		}
			    	chose_a_Player();
			    	winningGame();
			    }
			 });
			
			panel.add(button2);
			button2.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont2=new Font("Arial", Font.BOLD,110);
			button2.setFont(tfont2);
			button2.setForeground(Color.black);
			button2.setBackground(color);
			button2.setBounds(206, 5, 200, 200);
			button2.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
			    {
					button2.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button2.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button2.setForeground(colorO);
			    		}
			    	chose_a_Player();
			    	winningGame();
			    }
			});
			
			panel.add(button3);
			button3.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont3=new Font("Arial", Font.BOLD,110);
			button3.setFont(tfont3);
			button3.setForeground(Color.black);
			button3.setBackground(color);
			button3.setBounds(407, 5, 200, 200);
			button3.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
			    {
					button3.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button3.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button3.setForeground(colorO);
			    		}
			    	chose_a_Player();
			    	winningGame();
			    }
			});
		//II button line :D-----------------------------------------------------------------------
			panel.add(button4);
			button4.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont4=new Font("Arial", Font.BOLD,110);
			button4.setFont(tfont4);
			button4.setForeground(Color.black);
			button4.setBackground(color);
			button4.setBounds(5	, 206, 200, 200);
			button4.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					button4.setText(startGame);
						if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button4.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button4.setForeground(colorO);
			    		}
			    	chose_a_Player();
			    	winningGame();
			            }
			});
			
			panel.add(button5);
			button5.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont5=new Font("Arial", Font.BOLD,110);
			button5.setFont(tfont5);
			button5.setForeground(Color.black);
			button5.setBackground(color);
			button5.setBounds(206, 206, 200, 200);
			button5.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					button5.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button5.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button5.setForeground(colorO);
			    		}
			    	chose_a_Player();
			    	winningGame();
			    }
			});
			
			panel.add(button6);
			button6.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont6=new Font("Arial", Font.BOLD,110);
			button6.setFont(tfont6);
			button6.setForeground(Color.black);
			button6.setBackground(color);
			button6.setBounds(407, 206, 200, 200);
			button6.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
			       	button6.setText(startGame);
			       		if(startGame.equalsIgnoreCase("X")) 
			       		{
			       			button6.setForeground(colorX);
			       		}
			       		else 
			       		{
			       			button6.setForeground(colorO);
			       		}
			    	chose_a_Player(); 	
			    	winningGame();
			    }
			});
		// III button line :D--------------------------------------------------------------------------			
			panel.add(button7);
			button7.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont7=new Font("Arial", Font.BOLD,110);
			button7.setFont(tfont7);
			button7.setForeground(Color.black);
			button7.setBackground(color);
			button7.setBounds(5	, 407, 200, 200);
			button7.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					button7.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button7.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button7.setForeground(colorO);
			    		}
			    	chose_a_Player(); 	
			    	winningGame();
			    }
			});
			
			panel.add(button8);
			button8.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont8=new Font("Arial", Font.BOLD,110);
			button8.setFont(tfont8);
			button8.setForeground(Color.black);
			button8.setBackground(color);
			button8.setBounds(206, 407, 200, 200);
			button8.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					button8.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button8.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button8.setForeground(colorO);
			    		}
			    	chose_a_Player(); 	
			    	winningGame();
			    }
			});
			
			panel.add(button9);
			button9.setVerticalTextPosition(AbstractButton.CENTER);
			Font tfont9=new Font("Arial", Font.BOLD,110);
			button9.setFont(tfont9);
			button9.setForeground(Color.black);
			button9.setBackground(color);
			button9.setBounds(407, 407, 200, 200);
			button9.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					button9.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button9.setForeground(colorX);
			    		}
			    		else 
			    		{
			    			button9.setForeground(colorO);
			    		}
			    	chose_a_Player(); 	
			    	winningGame();
			   }
			});
	}

	public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
				
		KolkoKrzyzyk tictac= new KolkoKrzyzyk("Kółko Krzyżyk ver 1.0");
		tictac.setSize(1030,651);
		tictac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tictac.setVisible(true);
		tictac.setLocationRelativeTo(null);
		tictac.add(panel);
			panel.setBackground(Color.LIGHT_GRAY);
			Border border = BorderFactory.createLineBorder(Color.BLACK,4);
			panel.setBorder(border);
			panel.setLayout(null);
			panel.add(lblPlayerX);
			lblPlayerX.setHorizontalAlignment(SwingConstants.RIGHT);
			Font tfontX=new Font("Arial", Font.BOLD,33);
			lblPlayerX.setFont(tfontX);
			lblPlayerX.setForeground(Color.black);
			lblPlayerX.setBounds(601, 225 ,300 ,50);
			panel.add(lblPlayerO);
			lblPlayerO.setHorizontalAlignment(SwingConstants.RIGHT);
			Font tfontO=new Font("Arial", Font.BOLD,33);
		    lblPlayerO.setFont(tfontO);
			lblPlayerO.setForeground(Color.black);
			lblPlayerO.setBounds(601, 300 ,300 ,50);
			
				panel.add(buttonClear);
				Font tfontC=new Font("Arial", Font.BOLD,33);
				buttonClear.setFont(tfontC);
				buttonClear.setForeground(Color.black);
				buttonClear.setBounds(608, 407, 200, 200);
				buttonClear.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
		            	button1.setText(null);
		            	button2.setText(null);
		            	button3.setText(null);
		            	button4.setText(null);
		            	button5.setText(null);
		            	button6.setText(null);
		            	button7.setText(null);
		            	button8.setText(null);
		            	button9.setText(null);
		            	
		            	button1.setBackground(color);
		            	button2.setBackground(color);
		            	button3.setBackground(color);
		            	button4.setBackground(color);
		            	button5.setBackground(color);
		            	button6.setBackground(color);
		            	button7.setBackground(color);
		            	button8.setBackground(color);
		            	button9.setBackground(color);
		            }
			});
			
			panel.add(buttonExit);
			Font tfontE=new Font("Arial", Font.BOLD,33);
			buttonExit.setFont(tfontE);
			buttonExit.setForeground(Color.black);
			buttonExit.setBounds(809, 407, 200, 200);
			buttonExit.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
	            	frame=new JFrame("EXIT");
	            	if(JOptionPane.showConfirmDialog(frame, "Czy na pewno chcesz wyjśc z gry?","", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
	            	{
	              		System.exit(0);
	              	}
	            }
			});
	}
}






	
	



	
	

