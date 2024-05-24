package gfg;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerofHanoi(2,'A','B','C');

	}

	public static void towerofHanoi(int n,char a,char b,char c)
	{
		if(n==0)
			return;
		towerofHanoi(n-1, a, c, b);
		System.out.println("Move Disc "+n+" from "+a+" to "+b);
		towerofHanoi(n-1,c,b,a);
	}
}
