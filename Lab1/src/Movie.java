
public class Movie {
	private int duration;
	private int year;
	private double price;
	private String title;
	private Director d;
	
	//Constructor
	public Movie(){}
	
	//Copy Constructor
	public Movie(Movie m){
		this.duration = m.duration;
		this.year = m.year;
		this.price = m.price;
		this.title = m.title;
		this.d = m.d;
	}
	
	//Overwrites the toString() method to display information in a specific format
	public String toString(){
		String text = "Title: "+title+"\n"+
				 "Released in: "+year+"\n"+
				 "Duration in minutes: "+duration+"\n"+
				 "Directed by "+d.getFirstName()+" "+d.getLastName()+" who was born in "+
				 d.getBirthYear()+" and has directed "+d.getNumOfDirectedMovies()+" films";
		return text;
	}
	
	//Getters
	public int getDuration() {
		return duration;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public Director getDirector() {
		return d;
	}
	
	//Setters
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String firstName, String lastName, int birthYear,
			 int numOfDirectedMovies) {
		d = new Director();
		d.setFirstName(firstName);
		d.setLastName(lastName);
		d.setBirthYear(birthYear);
		d.setNumOfDirectedMovies(numOfDirectedMovies);
	}
	

}
