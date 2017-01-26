
public class Lab1 {
	public static void main(String [ ] args){
		Movie m = new Movie();
		m.setTitle("Harry Potter and the Goblet of Fire"); 
		m.setPrice(19.99);
		m.setYear(2000);
		m.setDuration(734);
		m.setDirector("J.K.", "Rowling", 1965, 7); 
		
		//Testing to see if the copy constructor works
		System.out.println("Test 1\n");
		
		//Original 
		System.out.println("\n**ORIGINAL**\n"+m);
		//Copy
		Movie newMovie = new Movie(m);
		System.out.println("\n**Copy**\n"+newMovie);
		
		//Incrementing Original
		m.setDuration(735);
		
		//Original
		System.out.println("\n**ORIGINAL**\n"+m);
		//Copy
		System.out.println("\n**Copy**\n"+newMovie);
	}

}
