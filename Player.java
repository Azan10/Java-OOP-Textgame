

public class Player extends Actor {
	
	private int score=0;
	private String item;
	
	public void setScore(int score)
	{
		this.score=this.score+score;
	}
	

	
	public int  getScore()
	{
		return this.score;
	}

	@Override
	public String  attack() {
		
		return "attack with knife from behind";
	}

	@Override
	public String  weapon() {
		return "knife";
		
	}
	
	
	
	public void setinventory(String item)
	{
		 this.item=item;
	}
	
	
	public String getinventory()
	{
		 return this.item;
	}
	
	public String talk()
	{
	   return "I have been appointed recently as the new guard that is why my face might not be familiar";
	}
	
	
	
	

}
