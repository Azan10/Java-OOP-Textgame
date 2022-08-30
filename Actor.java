

public  abstract class Actor{
	
	private int  hp=100;
	
	
	
   public void setHp(int hp)
   {
	    this.hp=this.hp-hp;
	   
   }
   
   
   
   public int getHp()
   {
	    return this.hp;
	  
   }
   
   
   public abstract String attack(); 
  
   public abstract String weapon();
   
   public abstract String talk();
   
   
 
   
   
   

}
