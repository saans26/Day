package Day5;

public class TestInstrument {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piano p = new Piano();
		Flute f = new Flute();
		Guitar g = new Guitar();
		
		System.out.println(p.play());
		System.out.println(f.play());
		System.out.println(g.play());
		System.out.println();
		
		Instrument in;
		
		in = new Piano();
		System.out.println(in.play());
		in = new Flute();
		System.out.println(in.play());
		in = new Guitar();
		System.out.println(in.play());
	
		
		
		Instrument I[]=new Instrument [10];
		
		for(int i=0;i<I.length;i++)
		{ 
			
			I[0] = new Piano();
			I[1] = new Flute();
		    I[2] = new Guitar();
			I[3] = new Flute();
			I[4] = new Flute();
			I[5] = new Guitar();
			I[6] = new Guitar();
			I[7] = new Piano();
			I[8] = new Flute();
			I[9] = new Piano();
			
		}
			System.out.println();
			for(int i=0;i<I.length;i++) {
				System.out.println("At index "+i+" "+I[i].getClass().getSimpleName()+ " class object is stored.");

			
		}
	}
}
