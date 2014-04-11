package someClasses;

public class ClassB {

	private String location;
	private boolean negation;
	
	
	public ClassB(String location, boolean negation) {
		super();
		this.location = location;
		this.negation = negation;
	}

	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isNegation() {
		return negation;
	}
	
	public void setNegation(boolean negation) {
		this.negation = negation;
	}
	
	
}
