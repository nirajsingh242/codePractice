package wissenTech;

public class CamelCaseStringTOSnakeCaseSTring {

	public static void main(String[] args) {
		
	String str="MyNameIsNirajSingh";
	
	
	char[] charArray=str.toCharArray();
	StringBuilder result=new StringBuilder();
	
	result.append(charArray[0]);
	
	for(int i=1;i<charArray.length;i++)
	{
		if((int)charArray[i]<96)
		{
			result.append("_");
			result.append(charArray[i]);
			
		}else
		{
			result.append(charArray[i]);
		}
			
	}
	
	System.out.println((result.toString()).toLowerCase());
	}
	
}
