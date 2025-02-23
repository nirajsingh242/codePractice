package designPatternStructural;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Component ram=new Leaf(3000, "RAM");
		Component hdd=new Leaf(2000, "HDD");
		Component monitor=new Leaf(12000, "monitor");
		Component cpu=new Leaf(6000, "CPU");
		Component keybord=new Leaf(500, "KEYBOARD");
		
		Composite mb=new Composite("MOHERBOARD");
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		Composite cabinet=new Composite("CABINET");
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		Composite peri=new Composite("PERIPHERAL");
		peri.addComponent(monitor);
		peri.addComponent(keybord);
		
		Composite com=new Composite("COMPUTER");
		com.addComponent(cabinet);
		com.addComponent(peri);
		
		peri.showPrice();

	}

}
