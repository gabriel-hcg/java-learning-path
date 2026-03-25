package entities;

public class Artist {
	private String name;
	private int year;
	
	public Artist() {
		
	}
	
	public Artist(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String album() {
		if (year == 1999) {
			return " released ...Baby One More Time.";
		} 
		else if (year == 2000) {
			return " released Oops!... I Did It Again.";
		}
		else if (year == 2001) {
			return " released Britney.";
		}
		else if (year == 2003){
			return " released In The Zone.";
		}
		else if (year == 2007) {
			return " released Blackout.";
		}
		else if (year == 2008) {
			return " released Circus.";
		}
		else if (year == 2011) {
			return " released Femme Fatale.";
		}
		else if (year == 2013) {
			return " released Britney Jean.";
		}
		else if (year == 2016) {
			return " released Glory.";
		}
		else {
			return " didn't release any albums this year.";
		}
		
	}

	public String toString() {
		return "The year is " + year + " and " + name + album();
	}
}