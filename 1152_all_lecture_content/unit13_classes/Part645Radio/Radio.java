public class Radio //fm
{
	//Frequency is ranges from 87.8 to 108.0 MHz
	//for North America.
	private double frequency;
	private int volume;
	
	public Radio()
	{
		frequency = 87.8;
		volume = 0;
	}
	
	public double getFrequency(){ return frequency; }
	public int getVolume(){ return volume; }
	
	public void setVolume(int new_volume)
	{
		if(new_volume > 100){
			new_volume = 100;
		}
		else if(new_volume < 0){
			new_volume = 0;
		}
		volume = new_volume;
	}
	
	public void increaseFrequency()
	{
		frequency = frequency + 0.1;
		//Loop frequency if it's above range.
		if(frequency > 108.0)
			frequency = 87.8;
	}
	
	public void decreaseFrequency()
	{
		frequency = frequency - 0.1;
		//Loop frequency if it's below range.
		if(frequency < 87.8)
			frequency = 108.0;
	}
	
	public void scan()
	{
		do
		{
			this.increaseFrequency();
			//System.out.println(frequency); //testing
		}
		while(this.toString().equals("fuzzzfuzzz"));
	}

	@Override
	public String toString()
	{
		//TODO: Add two more stations and two more songs.
		double[] stations = {97.3, 99.5, 100.3};
		String[] station_music = {"Happy", "Sweet Caroline", "Wonderwall"};
		for(int i=0; i<stations.length; i++)
		{
			//Commented out a too-restrictive comparison
			//for one that's more flexible.
			//if(stations[i] == frequency)
			if( Math.abs(stations[i] - frequency) < 0.01 )
				return station_music[i];
		}
		return "fuzzzfuzzz";
	}
	
	public String getInfo()
	{
		return String.format("You are listening to %.1f fm at a volume of %d",frequency,volume);
	}
	
}