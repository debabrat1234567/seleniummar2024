package hdfc.loans.eduloans;

public class UserDefineArray 
{
	int sno;
	String sname;
	
	public UserDefineArray(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "UserDefineArray [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		UserDefineArray obj = new UserDefineArray(1744,"sai");
		//System.out.println(obj.sno);
		//System.out.println(obj.sname);
		
		System.out.println(obj);
		
		UserDefineArray s1 = new UserDefineArray(1,"s1");
		UserDefineArray s2 = new UserDefineArray(2,"s2");
		UserDefineArray s3 = new UserDefineArray(3,"s3");
		UserDefineArray s4 = new UserDefineArray(4,"s4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		UserDefineArray[] st = new UserDefineArray[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(UserDefineArray p:st)
		{
			System.out.println(p);
		}
	}

}
