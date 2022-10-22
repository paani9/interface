package abstr;


interface Amazon
{
  void shopping();
}
class Eledev implements Amazon
{ public void shopping()
	{
	 System.out.println("Mobiles,Laptops.....");
	}
}
class Fasbea implements Amazon
{public void shopping()
	{
	System.out.println("Women's Fashions,Men's Fashoins,Beauty products.....");
	
	}
}
class Grofood implements Amazon
{public void shopping()
	{ 
	System.out.println("Beverages,Dry fruits,snacks,Breakfast essentials.....");
	}
}
class Sim
{ static void amsim(Amazon a1)
	{
	a1.shopping();
	}
	

}
public class Ab3 {
	public static void main(String[] args)
	{
Eledev e=new Eledev();
Fasbea f=new Fasbea();
Grofood g=new Grofood();
Sim.amsim(e);
Sim.amsim(f);
Sim.amsim(g);
	}
}





