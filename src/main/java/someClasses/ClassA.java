package someClasses;

public class ClassA {

	private String label;
	private double amount;
	
	public ClassA(String label, double amount) {
		super();
		this.label = label;
		this.amount = amount;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
