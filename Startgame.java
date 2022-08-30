



import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public  class Startgame extends Frame implements ActionListener {
	
    protected Frame f3;
	private JTextArea t1;
	private Label l1 = new Label();
	private Label l2 = new Label();
	private Label l3 = new Label();
	private Label l4 = new Label();
	private Label l5 = new Label();
	private Label l6 = new Label();
	private Label l7 = new Label();
	private Playgame a9;
	Actor a1 = new Player();
	Actor a2 = new Guard();
    Player p1 = new Player();
	Guard a3 = new Guard();
	
	
	
	
	public void createframe()
	{
		f3= new Frame();
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setBackground(Color.DARK_GRAY);
		Windowcloser wc= new Windowcloser();
		f3.setSize(780,500);
		f3.addWindowListener(wc);
		
		
	
	}
	
	
	
    
	/*Methods to be overrriden by childclass*/
	
	public void createtextfield()   
	{
		  
	}
	
	public void  createButton()    
	{
		
		
	}
	
	public void changeplayerstate(int hp,int score,String addtoinventory)
	{
		a1.setHp(hp);
		l1.setText("Your hp:" + a1.getHp());
		l1.setForeground(Color.yellow);
		l1.setBounds(20,10,80,100);
		f3.add(l1);
		p1.setScore(score);
		l2.setText("Your score:" + p1.getScore());
		l2.setBounds(120,10,80,100);
		l2.setForeground(Color.yellow);
		f3.add(l2);
		l3.setText(" weapon:" +a1.weapon());
		l3.setBounds(220,10,80,100);
		l3.setForeground(Color.yellow);
		f3.add(l3);
		p1.setinventory(addtoinventory);
		l4.setText("Inventory:" +p1.getinventory());
		l4.setBounds(330,10,100,100);
		l4.setForeground(Color.yellow);
		f3.add(l4);
		
	}
	
	public void changeguardstate(int hp,String guarddifficulty)
	{
		a3.setHp(hp);
		l5.setText("Guardhp:" +a3.getHp());
		l5.setForeground(Color.red);
		l5.setBounds(460,10,80,100);
		f3.add(l5);
		l6.setText("difficulty:"+ guarddifficulty);
		l6.setForeground(Color.red);
		l6.setBounds(560,10,70,100);
		f3.add(l6);
		l7.setText("guardweapon:" + a3.weapon());
		l7.setForeground(Color.red);
		l7.setBounds(650,10,120,100);
		f3.add(l7);
		
	}
	
	public void removeguard()
	{
		l5.setText("");
		l6.setText("");
		l7.setText("");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		a9= new Playgame();
		a9.createframe(); 
		a9.createtextfield();
		a9.createButton();
		a9.changeplayerstate(0,0,"");
		a9.changeguardstate(0,"50%" );
		
		
		
		
		
	
		
		
	
		
	
		
		
		
		
		
		
		
		
		
	}



	
	

}



