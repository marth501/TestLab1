
public class Director {
	private String firstName;
	private String lastName;
	private int birthYear;
	private int numOfDirectedMovies;
	
	//Constructor
	public Director(){}
	
	//Copy Constructor
	public Director(Director d){
		this.firstName = d.firstName;
		this.lastName = d.lastName;
		this.birthYear = d.birthYear;
		this.numOfDirectedMovies = d.numOfDirectedMovies;
	}
	
	//Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public int getNumOfDirectedMovies() {
		return numOfDirectedMovies;
	}

	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void setNumOfDirectedMovies(int numOfDirectedMovies) {
		this.numOfDirectedMovies = numOfDirectedMovies;
	}

	
	
	
}
