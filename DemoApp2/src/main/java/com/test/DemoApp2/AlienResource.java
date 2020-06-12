package com.test.DemoApp2;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien()
	{
		System.out.println("Getting alien...");
		Alien a1 = new Alien();
		a1.setName("Ahmad");
		a1.setPoints(60);
		
		System.out.println("Getting alien...");
		Alien a2 = new Alien();
		a2.setName("Mike");
		a2.setPoints(58);
		
		List<Alien> aliens = Arrays.asList(a1, a2);
		
		return aliens;
	}

}
