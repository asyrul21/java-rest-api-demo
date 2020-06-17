package com.test.DemoApp2;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository 
{
	List<Alien> aliens;
	
//	constructor
	public AlienRepository() 
	{
		aliens = new ArrayList<>();
		
		Alien a1 = new Alien();
		a1.setId(1);
		a1.setName("Ahmad");
		a1.setPoints(60);
		
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("Mike");
		a2.setPoints(58);
		
		aliens.add(a1);
		aliens.add(a2);
	}
	
	public List<Alien> getAliens()
	{
		return aliens;
	}
	
	public Alien getAlien(int id) 
	{
		
		for(Alien a : aliens)
		{
			if(a.getId() == id)
				return a;
		}
		// else
		return new Alien();
	}
	
	public void create(Alien a1)
	{
		aliens.add(a1);
		System.out.println(aliens);
	}

}
