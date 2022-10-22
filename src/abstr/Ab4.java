package abstr;

interface Stories
{ void story();
	

}
class Ms implements Stories
{ public void story()
	{System.out.println("True Wealth, The ship.....");
}
}
class As implements Stories
{public void story()
	{
	System.out.println("The clever crab,The mouse,.....");
	
	}
}
class Simul
{ static void st (Stories s)
	{
	s.story();
	}
}

public class Ab4 {
	public static void main(String[] args)
	{ 
		Ms m=new Ms();
		As a=new As();
		Simul.st(m);
		Simul.st(a);
	}

		
	}



