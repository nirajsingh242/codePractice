package gfg;
interface Decorable {
     String color="Red";
}
public class Main implements Decorable
{
	public static void main(String[] args) {
		System.out.println("Hello World "+Decorable.color);
	}
}