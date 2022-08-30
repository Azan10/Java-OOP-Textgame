

public class Guard extends Actor{

	private String guardpower="100";
	
	
	
	public String attack() {
		
		return "shoot with pistol";
	}

	
	public String weapon() {
		
		return  "pistol";
		
	}
	
	
	
	public void setguarddifficulty(String guardpower)
	{
		  this.guardpower=guardpower;
	}
	
	public String getguarddiffciulty()
	{
		return this.guardpower;
	}
	
	public String talk()
	{
		return "Excuse me you who are you I have seen you for first time";
	}
}
	
	

	
	
	
	
