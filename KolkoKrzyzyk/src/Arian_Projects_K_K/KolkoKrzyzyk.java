package Arian_Projects_K_K;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
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
	
	
	
	static JPanel panel = new JPanel(); // tworzy pole na klawiaturę w formularzu
    static JLabel lblPlayerX =new JLabel("Wynik gracza X :"); // tworzy pole tekstowe
    static JLabel lblPlayerO =new JLabel("Wynik gracza O :"); // tworzy pole tekstowe
    JLabel jlblPlayerX =new JLabel(); // tworzy pole tekstowe
    JLabel jlblPlayerO =new JLabel(); // tworzy pole tekstowe
    
    static JButton button1=new JButton("");
    static JButton button2=new JButton("");
    static JButton button3=new JButton("");
    static JButton button4=new JButton("");
    static JButton button5=new JButton("");
    static JButton button6=new JButton("");
    static JButton button7=new JButton("");
    static JButton button8=new JButton("");
    static JButton button9=new JButton("");
    static JButton buttonClear=new JButton("RESET");
    static JButton buttonExit=new JButton("EXIT");
    public static JFrame frame ;
	
	
	
	public KolkoKrzyzyk(String title) {
		initComponents();
	}
	
	private static void chose_a_Player() {
		if(startGame.equalsIgnoreCase("X")) 
		{
			startGame="O";	
		}
		else 
		{
			startGame="X";
		}
		
	}
	private void gameScore() {
		jlblPlayerX.setText(String.valueOf(xCounter));
		System.out.println(xCounter);
		jlblPlayerO.setText(String.valueOf(oCounter));
	}
	
	private void winningGame() {
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
			button1.setBackground(Color.orange);
			button2.setBackground(Color.orange);
			button3.setBackground(Color.orange);
			JOptionPane.showMessageDialog(this, "Gracz X wygrywa", "", JOptionPane.INFORMATION_MESSAGE);
			xCounter++;
			gameScore();
		}
	/*	
		String b1=button1.getText();
		String b2=button2.getText();
		String b3=button3.getText();
		
		String b1=button1.getText();
		String b2=button2.getText();
		String b3=button3.getText();
	*/
	}
	
	private void initComponents() {

//I button line :D--------------------------------------------------------------------
				panel.add(button1);
				button1.setVerticalTextPosition(AbstractButton.CENTER);
				Font tfont1=new Font("Arial", Font.BOLD,110);
				button1.setFont(tfont1);
				button1.setForeground(Color.black);
				button1.setBackground(Color.getHSBColor(235, 235, 235));
				button1.setBounds(4	, 4, 200, 200);
				button1.addActionListener(new ActionListener() 
				{
			        public void actionPerformed(ActionEvent e) 
			        {
			        	button1.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button1.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button1.setForeground(Color.green);
			    		}
			    		chose_a_Player();
			    		winningGame();
			        }
			    });
				panel.add(button2);
				button2.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont2=new Font("Arial", Font.BOLD,110);
				button2.setFont(tfont2);
				button2.setForeground(Color.black);
				button2.setBounds(201, 4, 200, 200);
				button2.addActionListener(new ActionListener() 
				{
			        public void actionPerformed(ActionEvent e) 
			        {
			        	button2.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button2.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button2.setForeground(Color.green);
			    		}
			    		chose_a_Player();
			    		winningGame();
			        }
			    });
				panel.add(button3);
				button3.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont3=new Font("Arial", Font.BOLD,110);
				button3.setFont(tfont3);
				button3.setForeground(Color.black);
				button3.setBounds(401, 4, 200, 200);
				button3.addActionListener(new ActionListener() 
				{
			        public void actionPerformed(ActionEvent e) 
			        {
			        	button3.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button3.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button3.setForeground(Color.green);
			    		}
			    		chose_a_Player();
			    		winningGame();
			        }
				});
//II button line :D-----------------------------------------------------------------------
				panel.add(button4);
				button1.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont4=new Font("Arial", Font.BOLD,110);
				button4.setFont(tfont4);
				button4.setForeground(Color.black);
				button4.setBounds(4	, 201, 200, 200);
				button4.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button4.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button4.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button4.setForeground(Color.green);
			    		}
			    		chose_a_Player();
			    		winningGame();
			            }
			    });
				panel.add(button5);
				button5.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont5=new Font("Arial", Font.BOLD,110);
				button5.setFont(tfont5);
				button5.setForeground(Color.black);
				button5.setBounds(201, 201, 200, 200);
				button5.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button5.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button5.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button5.setForeground(Color.green);
			    		}
			    		chose_a_Player();
			    		winningGame();
			            }
			    });
				panel.add(button6);
				button6.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont6=new Font("Arial", Font.BOLD,110);
				button6.setFont(tfont6);
				button6.setForeground(Color.black);
				button6.setBounds(401, 201, 200, 200);
				button6.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button6.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button6.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button6.setForeground(Color.green);
			    		}
			    		chose_a_Player(); 	
			    		winningGame();
			    		}
			    });
// III button line :D--------------------------------------------------------------------------			
					panel.add(button7);
				button7.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont7=new Font("Arial", Font.BOLD,110);
				button7.setFont(tfont7);
				button7.setForeground(Color.black);
				button7.setBounds(4	, 401, 200, 200);
				button7.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button7.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button7.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button7.setForeground(Color.green);
			    		}
			    		chose_a_Player(); 	
			    		winningGame();
			    		}
			    });
					panel.add(button8);
				button8.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont8=new Font("Arial", Font.BOLD,110);
				button8.setFont(tfont8);
				button8.setForeground(Color.black);
				button8.setBounds(201, 401, 200, 200);
				button8.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button8.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button8.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button8.setForeground(Color.green);
			    		}
			    		chose_a_Player(); 	
			    		winningGame();
			    		}
			    });
					panel.add(button9);
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				Font tfont9=new Font("Arial", Font.BOLD,110);
				button9.setFont(tfont9);
				button9.setForeground(Color.black);
				button9.setBounds(401, 401, 200, 200);
				button9.addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent e) {
			        	button9.setText(startGame);
			        	if(startGame.equalsIgnoreCase("X")) 
			    		{
			    			button9.setForeground(Color.blue);
			    		}
			    		else 
			    		{
			    			button9.setForeground(Color.green);
			    		}
			    		chose_a_Player(); 	
			    		winningGame();
			    		}
			    });
	}

	
	
	
	public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
	
				
	KolkoKrzyzyk tictac= new KolkoKrzyzyk("Kółko Krzyżyk ver 1.0");
	tictac.setSize(1021,644);
	tictac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tictac.setVisible(true);
	tictac.setLocationRelativeTo(null);
	tictac.add(panel);
		panel.setBackground(Color.gray);
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
	//	UIManager.setLookAndFeel("com.jtatoo.plaf.aluminium.AluminiumLookAndFeel");	



			panel.add(buttonClear);
		Font tfontC=new Font("Arial", Font.BOLD,33);
		buttonClear.setFont(tfontC);
		buttonClear.setForeground(Color.black);
		buttonClear.setBounds(601, 401, 200, 200);
		buttonClear.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            	button1.setText(null);
	            	button2.setText(null);
	            	button3.setText(null);
	            	button4.setText(null);
	            	button5.setText(null);
	            	button6.setText(null);
	            	button7.setText(null);
	            	button8.setText(null);
	            	button9.setText(null);
	            	
	            	button1.setBackground(Color.LIGHT_GRAY);
	            	}
		});
			panel.add(buttonExit);
			
		Font tfontE=new Font("Arial", Font.BOLD,33);
		buttonExit.setFont(tfontE);
		buttonExit.setForeground(Color.black);
		buttonExit.setBounds(801, 401, 200, 200);
		buttonExit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            	frame=new JFrame("EXIT");
	            	if(JOptionPane.showConfirmDialog(frame, "Czy na pewno chcesz wyjśc z gry?","", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
	            	{
	              		System.exit(0);
	              	}
	              }
		});
		//gameScore();
		
//		
	}
@SuppressWarnings("unused")
private void button1ActionPerformed(java.awt.event.ActionEvent avt) {

		if(startGame.equalsIgnoreCase("X")) 
		{
			startGame="O";	
		}
		else 
		{
			startGame="X";
		}
		chose_a_Player(); 	
		
	}
}






	
	



	
	

