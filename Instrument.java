package Day5;

import java.util.Random;

abstract  class  Instrument
{
	public abstract String  play();
}

class Piano extends Instrument
{
	public String  play()
	{
		return  "Piano is playing tan tan tan tan";	
	}
}

class Flute extends Instrument
{
	public String   play()
	{
		return "Flute is playing toot toot toot toot" ;
		
	}
}

class Guitar extends Instrument
{
	public String  play()
	{
		return "Guitar is playing tin tin tin" ;
		
	}
}

