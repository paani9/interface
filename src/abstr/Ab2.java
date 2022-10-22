package abstr;



interface Music
{ void songs();
}
class Hindi implements Music
{public void songs()
	{System.out.println("Hindi songs");
	
	}
}
class English implements Music
{ public void songs()
{System.out.println("English songs");

}
}
class Telugu implements Music
{public void songs()
	{System.out.println("Telugu songs");
	
	}
}
class Musim
{ static void musim(Music m1)
	{
	m1.songs();
	
	}
}


public class Ab2 {
	public static void main(String[] args)
	{  Hindi h=new Hindi();
	   English e=new English();
	   Telugu t=new Telugu();
	   Musim.musim(h);
	   Musim.musim(e);
	   Musim.musim(t);
	}
}

	   
