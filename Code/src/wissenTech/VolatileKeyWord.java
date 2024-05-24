package wissenTech;

public class VolatileKeyWord {
	private static volatile int counter=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Thread t1= new Thread(()->{
			
			for(;counter<=100;++counter)
			{
				System.out.println("[T1]  local counter is "+counter);
			}
		});
		
		
		
		Thread t2= new Thread(()->{
			
			for(int i=1;i<=100;i++)
			{
					while(i>=counter)
					{
						System.out.println("[T2]  waiting as counter value reached above A or same  "+i);
					}
				System.out.println("[T2]  local counter is "+i);
			}
			
		});
		
		
		t1.start();
		t2.start();
	}

}
