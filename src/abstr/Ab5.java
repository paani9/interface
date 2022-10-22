package abstr;


interface Countries
{ void currency();
	
	
}
class India implements Countries
{public void currency()
	{System.out.println("Rupee");
	
	}
}
class America implements Countries
{public void currency()
	{System.out.println("Dollar");
	
	}
}
class Simula
{ static void cusim(Countries c)
	{ c.currency();
	
}
}
public class Ab5 {
public static void main(String[] args)
{ 
	India i=new India();
	America a=new America();
	Simula.cusim(i);
	Simula.cusim(a);
}
}




