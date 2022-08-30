

 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintWriter;
 import javax.swing.JButton;
 import javax.swing.JTextArea;


public class Playgame extends Startgame implements ActionListener{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	JTextArea t1;
    private int playerscore;
  
	
	
	
    public void createButton()
	{
		 button1= new JButton();
		 button1.setText("Grab key from back of guards pocket");
		 button1.setBounds(150,350,360,30);
		 button1.addActionListener(this);
		 button2= new JButton();
		 button2.setText("kill guard with knife you found when he opens prison gate");
	     button2.setBounds(150,380,360,30);
	     button2.addActionListener(this);
		 button3= new JButton();
		 button3.setBounds(150,410,360,30);
		 button3.addActionListener(this);
		 button4= new JButton();
		 button4.setBounds(150,440,360,30);
		 button4.addActionListener(this);
		 f3.add(button1);
	     f3.add(button2);
	     f3.add(button3);
		 f3.add(button4);
		
	}
	
	public void createtextfield()
	{
	    t1 = new JTextArea("Make an escape from prison how should you escape?");
		t1.setBounds(100,90,480,250);
		t1.setForeground(Color.white);
		t1.setBackground(Color.black);
		f3.add(t1);
	}
	
	
    public void changetextlabel(String textlabel)
    {
	    
		t1.setText(textlabel);
		
	
	}
    
 
   public void changeButtontext(String button1,String button2,String button3,String button4)
   {
	 
	   this.button1.setText(button1);
	   this.button2.setText(button2);
	   this.button3.setText(button3);
	   this.button4.setText(button4);
	
   }
   
   public void grabKey()  
   {
	   this.changetextlabel("key grabbed successfully its night ready to escape");
	   this.changeButtontext("escape quietly","wait for opportunity","","");
	   this.changeplayerstate(0,3,"key");
	   removeguard();
	   
	  
   }
   
   public void killGuard()  
   {
	   this.changetextlabel("that was close fight you managed to kill guard and got his outfit");
	   this.changeButtontext("escape","wait more","","");
	   this.changeplayerstate(40,0,"");
	   this.changeguardstate(100,"50%");
	  
	
   }
   
   public void escapenow()
   {
	  this.changetextlabel("Should have waited more looks like there was going to be another perfect oppurtunity");
	  this.changeButtontext("now escape","","","");
	  this.changeplayerstate(10,0,"");
	  removeguard();
   }
   
   
   
  
   
   public void talktoGuard()
   
   {
	   this.changetextlabel(a1.talk() + "\n Guard: Okay go!");
	   this.changeButtontext("find for medicine","continue my journey","","");
	   this.changeplayerstate(0,4,"");
	   removeguard();
	  
   }
   
   
   public void waitforEscape()   
   {
	   this.changetextlabel("it was worth waiting there is function and guards are expecting lot of guests");
	   this.changeButtontext("now escape","","","");
	   this.changeplayerstate(0,2,"");
	   removeguard();
	   
	  
   }
   
   public void anotherGuard()    
   {
	 this.changetextlabel("Guard:" +a3.talk());
	 this.changeButtontext(a1.attack(),"talk","","");
	 this.changeguardstate(-100,"60%");
	 this.changeplayerstate(0,1,"");
	
	
   }
   
   public void fightGuard()   
   {
	   this.changetextlabel("that was close fight but you got lucky and manage to kill guard wear his outfit and disguise");
	   this.changeButtontext("yes","","","");
	   this.changeplayerstate(20,0,"");
	   this.changeguardstate(100,"60%");
	   
	 
   }
   
   public void AfterFight()    
   {
	   this.changetextlabel("perfect now you can easily walk past any guard");
	   this.changeButtontext("find for medicine","continue my journey","","");
	   this.changeplayerstate(20,1,"");
	   removeguard();
	  
	   
   }
   
   
   
   public void foundMedicine()    
   {
	   this.changetextlabel("You found medicine good job your hp increases");
	   this.changeButtontext("run towards exit","","","");
	   this.changeplayerstate(-30,2,"medicine");
	   
   }
   
   public void decideRoute()   
   {
	   this.changetextlabel("you are finally out of the kingdom but need to find your way back. \nNorth is plain land \nSouth is jungle \nwest is dessert \n East is full of mountains\nHint:You belong to kingdom in Tibet");
	   this.changeButtontext("go North","go South","go West","go East");
	   this.changeplayerstate(0,1,"");
	
   }
     
   public void findHome()  
   {
	   this.changetextlabel(" Doesnt look like the right path go back to where you got lost?");
	   this.changeButtontext("go back to where you got lost","","","");
	   this.changeplayerstate(30,0,"");
	 
   }
   
   public void west()   
   {
	   this.changetextlabel("hmmm seem to be on right track its getting dark would you like to rest?");
	   this.changeButtontext("continue  journey","rest and wait for morning","","");
	   this.changeplayerstate(0,5,"");
	   
	   
   }
   
   public void east()   
   {
	   this.changetextlabel("you are attacked by wolves fight them");
	   this.changeButtontext("fight","","","");
	   this.changeplayerstate(0,0,"");
   }
   
   public void north()
   {
	   this.changetextlabel("You are attacked by scorpian fight them");
	   this.changeButtontext("fight","","","");
	   this.changeplayerstate(0,0,"");
   }
   
   public void south()
   {
	   this.changetextlabel("There is mushroom in jungle eat it to increase hp?");
	   this.changeButtontext("eat it","","","");
	   this.changeplayerstate(0,0,"");
   }
   
   public void eatMushroom()
   {
	   this.changetextlabel("Oaps it was poisnous not a smart move");
	   this.changeButtontext("return back","","","");
	   this.changeplayerstate(30,0,"");
   }
   
  
   public void wingame()
   {
	  this.changetextlabel("Well played this route is correct! you found your ally and you have been rescued ");
	  playerscore=p1.getScore();
	  f3.remove(button1);
	  f3.remove(button2);
	  f3.remove(button3);
	  f3.remove(button4);
	  
   }
   
   public void endgame()
   {
	   this.changetextlabel("Your hp was very low  thus you died during the journey well played better luck next time");
	   playerscore=p1.getScore();
	   f3.remove(button1);
	   f3.remove(button2);
	   f3.remove(button3);
	   f3.remove(button4);
   }
   
   
   public void writeScore()
   {
	   String score=Integer.toString(playerscore);
	   
	try {
		FileWriter fw = new FileWriter("scoringchart.txt",true);
		 PrintWriter pw = new PrintWriter(fw);
		 pw.println(playerscore);
		 pw.close();
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
	
   }
   
   public void actionPerformed(ActionEvent e) {
		
	
		if(e.getActionCommand().equals("Grab key from back of guards pocket")  & a1.getHp()>0){
		
		    grabKey();}
		
		
	
         if(e.getActionCommand().equals("kill guard with knife you found when he opens prison gate")) {
		  
		    killGuard();}
		  
		
		 if(e.getActionCommand().equals("escape")){
	          
		    escapenow();}
	   
	          
	      if(e.getActionCommand().equals("escape quietly")){
		      
		    escapenow();}
		       
		
		
		  if(e.getActionCommand().equals("wait more")|e.getActionCommand().equals("wait for opportunity")){
		       		
		 	waitforEscape();}
				
			
		
		   if(e.getActionCommand().equals("now escape")){
		
			anotherGuard();}
		
		
		   if(e.getActionCommand().equals(a1.attack())){
		
			fightGuard();}
		
		
		   if(e.getActionCommand().equals("talk")){
		
			talktoGuard();}
		
		
		   if(e.getActionCommand().equals("yes")){
		
			AfterFight();}
		
		
		  if(e.getActionCommand().equals("continue my journey")){
		
			decideRoute();}
		
		
		  if(e.getActionCommand().equals("find for medicine")){
		
		   foundMedicine();}
			
		
		  if(e.getActionCommand().equals("run towards exit")){
		
		   decideRoute();}
		
		
		
		 if(e.getActionCommand().equals("go West") & a1.getHp()!=0){
		
			west();
			wingame();
			writeScore();}
		
		 
	    if(e.getActionCommand().equals("go North")){
		  
		    north();}
		     
		  
		 if(e.getActionCommand().equals("go East")){
		   
		    east();}
		   
		
		if(e.getActionCommand().equals("go South")){
		
			south();}
		
		
		if(e.getActionCommand().equals("fight")){
			
		   findHome();}
			
		
		if(e.getActionCommand().equals("go back to where you got lost")|e.getActionCommand().equals("return back")){
		
		   decideRoute();}
		
		
		if(e.getActionCommand().equals("eat it")){
		
		  eatMushroom();}
		
		
		
		if(a1.getHp()<0 | a1.getHp()==0){
		
		  endgame();
		  writeScore();}
			
			
			
		
		
		
	}

  
  
		
	
	
	
	
	
	

		
		


}
