package designPatternStructural;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IphoneCharger ic=new Adapter(new SamsungCharger());
		Iphone i=new Iphone(ic);
		i.charging();
		Arrays.asList(List.of("a","b"));
	}

}
