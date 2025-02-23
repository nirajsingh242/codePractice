package designPatternStructural;

import java.util.ArrayList;
import java.util.List;

interface Component
{
	void showPrice();
}

class Leaf implements Component
{
	int price;
	String name;

	public Leaf(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name+" : "+price);
	}
	
}

class Composite implements Component
{
	String name;
	public Composite(String name) {
		this.name = name;
	}
	List<Component> com=new ArrayList<>();
	public void addComponent(Component c)
	{
		com.add(c);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component c:com)
		{
			c.showPrice();
		}
	}
	
}