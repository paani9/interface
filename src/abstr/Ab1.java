package abstr;

interface Fruit
{ void colour();
	
	
	
	
}

class Apple implements Fruit
{ public void colour()
	{	System.out.println("Red");

     }
}
class Banana implements Fruit
{ public void colour()
{	System.out.println("Yellow");

}
}
class Watermelon implements Fruit
{ public void colour()
{	System.out.println("Green");

}
}
class Stimulator
{static void ansim(Fruit f1)
	{
	f1.colour();
	
	}
}
public class Ab1
{public static void main(String[] args)
	{ Apple a1=new Apple();
	  Banana b1=new Banana();
	  Watermelon w1=new Watermelon();
	  
	 Stimulator.ansim(a1);
	 Stimulator.ansim(b1);
	 Stimulator.ansim(w1);
	 
	}
}
	



