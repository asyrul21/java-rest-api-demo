package com.test.DemoApp2;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAlien()
	{
		System.out.println("Getting alien...");
		
		return repo.getAliens();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien(@PathParam("id") int id)
	{	
		return repo.getAlien(id);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien createAlien(Alien a1)
	{
		
		System.out.println(a1);
		
		repo.create(a1);
		
		return a1;
	}
}
