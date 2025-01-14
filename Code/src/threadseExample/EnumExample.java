package threadseExample;

enum Laptop{
	Mackbook(2000),XPS(200),surface(150);
	private int price;
	private Laptop(int price)
	{
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Laptop l:Laptop.values()) {
			System.out.println(l.name()+" "+l.getPrice()+" "+l.getClass().getSuperclass()+" "+l.ordinal());
			
		}

	}

}
