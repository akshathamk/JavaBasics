package sea;

public class A 
{
	public static void main(String[] args)
	{
	Object obj[] = new Object[5];
	obj[0] = 5;
	obj[1] = 22.5f;
	obj[2] = 55;
	obj[3] = "xyz";
	obj[4] = 44445555l;
	int sum =0;
	for(int i=0;i<=obj.length-1;i++)
	{
		if(obj[i] instanceof Integer)
		{	
			System.out.println(obj[i]);
			Integer it = (Integer) obj[i];
			int a = it;
			sum = sum + a; 
		}
	}
	System.out.println(sum);
	}
	
}

