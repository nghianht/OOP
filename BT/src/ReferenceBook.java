public class ReferenceBook extends Book{
	private double tax;
	public ReferenceBook(String id, String name, int quantity, String publisher, double price) {
		
		// TODO Auto-generated constructor stub
		super(id, name, quantity, publisher, price);
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price,
			double tax) {
		super(id, name, quantity, publisher, price);
		this.tax = tax;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		double a = 0;
		a = super.getQuantity()*super.getPrice() + tax;
		return a;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}