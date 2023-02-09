class Farmer
{
	static float rate;
	private int amount;
	private int time;
	private String name;
	float SI;
//static block to initialiazation of static variable
	static {
		rate =2;
	}
		public Farmer(int amount,int time,String name)//constructor
		{			
			this.amount=amount;
			this.time =time;
			this.name=name;
		}
		void simpleIntrest()
	      {
		
			SI=(amount*rate*time)/100;
		   }
		 void disp()
		{
			System.out.println("Farmer::"+name);
			System.out.println("Amount::"+amount);
			System.out.println("Time::"+time);
			System.out.println("total simple interest is::"+SI);
			System.out.println("---------------------------------------------");
		}
	}
class Calling//polymorphism achieved
{
	void permit(Farmer f)
	{
		f.simpleIntrest();
		f.disp();
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Calling c1=new Calling();
           Farmer f1=new Farmer(10000,2,"Shyam");
           c1.permit(f1);
           Farmer f2=new Farmer(50000,3,"Shivam");
           c1.permit(f2);
           Farmer f3=new Farmer(20000,2,"Ram");
           c1.permit(f3);
           Farmer f4=new Farmer(90000,4,"Vijay");
           c1.permit(f4);
           
	}

}
