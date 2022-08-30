import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameApp extends Frame implements ActionListener  {
	
	private String playername;
	private Button Startgame;
	private Button highestscore;
	private Button Rules;
	private JFrame f2;
	private ArrayList<Integer>readscores;
	
	

	public static void main(String[] args) {
		GameApp g1=new GameApp();
		 g1.CreateButtons();
		
		 
		 
		 

	}
	
	
	public GameApp()
	{
	 super("Adventuregame");
	 this.setSize(500,500);
	 this.setLocationRelativeTo(null);
	 this.setBackground(Color.DARK_GRAY);
	 JLabel framelabel = new JLabel("Adventure game");
	 framelabel.setFont(new Font("Serif",Font.BOLD,34));
	 framelabel.setBounds(130,120,300,50);
	 this.setLayout(null);
	 this.add(framelabel);
	 this.setVisible(true);
	 Windowcloser wc = new Windowcloser();     // closes window of frame
     this.addWindowListener(wc);
        
	}
	



	
	public void CreateButtons()
	{
		 Startgame = new Button("Start");
	     Startgame.setBounds(200,230,100,30);
	     highestscore = new Button("Highest score");
		 highestscore.setBounds(200,300,100,30);
		 Rules = new Button("Rules");
		 Rules.setBounds(200,370,100,30);
		 this.add(Startgame);
		 this.add(highestscore);
		 this.add(Rules);
		 Startgame.addActionListener(new Startgame());
		 highestscore.addActionListener(this);
		 Rules.addActionListener(this);
		
	}
	
	public void createanotherframe(int width,int height)    
	{
	    f2= new JFrame();  //create frame
	    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f2.setLayout(null);
		f2.setVisible(true);
		f2.setBackground(Color.DARK_GRAY);
		Windowcloser wc= new Windowcloser();
		f2.setSize(width,height);
		f2.addWindowListener(wc);
		
	}
	
	
	/* Read scores from file when user game end into an arraylist*/
	
	public void readscore()      
	{
		 readscores=new ArrayList<Integer>();
		  File f = new File("scoringchart.txt");
		  Scanner scanner;
			try {
				scanner = new Scanner(f);
				 while(scanner.hasNext())
				   {
					readscores.add(Integer.valueOf(scanner.nextInt()));
				
				   }
			}           catch (FileNotFoundException e1) {
				         e1.printStackTrace();
			}
			  
			  
			   
	}
	

   public void actionPerformed(ActionEvent e)
	{
		
	   
		 if(e.getSource()==highestscore)
		{
		  readscore();
		  createanotherframe(400,400);
		  String greatestscore= String.valueOf(Collections.max(readscores));
		  JTextArea textarea = new JTextArea("Highest score uptill now is :" + greatestscore);
		  textarea.setBounds(20,40,350,200);
		  textarea.setForeground(Color.white);
		  textarea.setBackground(Color.black);
		  textarea.setLineWrap(true);
		  f2.add(textarea);
		  
		 
		 }
 
		 else if(e.getSource()==Rules)
		{
		 createanotherframe(400,300);
		 JTextArea textarea = new JTextArea(" "+"You have been caught spying at enemies kingdom and \n imprisoned thus your job is to escape enemies kingdom \n and reach your home kingdom alive. You are going to \n be offered multiple choices according to different scenarios \n make the choice which you find most suitable. If your hp \n becomes zero you die and the game ends ");
		 textarea.setBounds(20,40,350,200);
		 textarea.setForeground(Color.white);
		 textarea.setBackground(Color.black);
		 textarea.setLineWrap(true);
		 f2.add(textarea);
		 
		 
	     
	    
	                                    
	      		                       
	     
		}
	}
}
	
	
	
		
	
	

	


