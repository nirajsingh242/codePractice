package solid.priciple;

public class PayCalculatorDI {
	private MySqlConnection myDbCon;

	public PayCalculatorDI(MySqlConnection myDbCon) {
		this.myDbCon = myDbCon;
	}
//Here PayCalculatorDI(high leve) is dependent on MySqlConnection(low level)
	
}
