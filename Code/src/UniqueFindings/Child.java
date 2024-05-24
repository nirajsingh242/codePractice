package UniqueFindings;

public class Child implements  Parent2,Parent1 {
//last ordered interface ,compiler give error to override, if it abstract method
//if default method same in both class , then it will give option to override both	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child().print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Parent1.super.print();
		Parent2.super.print();
	}

	

}
