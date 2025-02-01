package designPatternBehavioral;


 interface SuportHandler
{
	public void setnexthandler(SuportHandler nextHandler);
	public void handleRequest(Requests req);
}
 
 class Level1 implements SuportHandler
 {
	 private SuportHandler nextHandler;
	 

	@Override
	public void handleRequest(Requests request) {
		// TODO Auto-generated method stub
		if(request.equals(Requests.BASIC))
		{
			System.out.println("request serverd at level 1");
		}else
		{
			System.out.println("request elevated to next level from level 1 "+request.toString());
			nextHandler.handleRequest(request);
		}
		
	}


	@Override
	public void setnexthandler(SuportHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler=nextHandler;
		
	}
	 
 }
 class Level2 implements SuportHandler
 {
	 private SuportHandler nextHandler;
	 

	@Override
	public void handleRequest(Requests request) {
		// TODO Auto-generated method stub
		if(request.equals(Requests.INTERMIDIATE))
		{
			System.out.println("request serverd at level 2");
		}else
		{
			System.out.println("request elevated to next level  from level 2"+request.toString());
			nextHandler.handleRequest(request);
		}
		
	}

	@Override
	public void setnexthandler(SuportHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler=nextHandler;
	}
	 
 } 
 
 class Level3 implements SuportHandler
 {
	 private SuportHandler nextHandler;
	 

	@Override
	public void handleRequest(Requests request) {
		// TODO Auto-generated method stub
		if(request.equals(Requests.CRITICAL))
		{
			System.out.println("request serverd at level 3");
		}else
		{
			System.out.println("request cant handled");
					}
		
	}

	@Override
	public void setnexthandler(SuportHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler=nextHandler;
	}
	 
 } 
 enum Requests {
BASIC,INTERMIDIATE,CRITICAL
 }

public class ChainOfResponsibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level1 l1=new Level1();
		Level2 l2=new Level2();
		Level3 l3=new Level3();
		l1.setnexthandler(l2);
		l2.setnexthandler(l3);
		
		l1.handleRequest(Requests.CRITICAL);

	}

}
