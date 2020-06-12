package com.test.RestApiDemo;

import javax.json.bind.Jsonb;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("alien")
public class AlienResource 
{
	// Define method
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAlien() 
	{
		System.out.println("Getting Alien data...");
		Alien a1 = new Alien();
		a1.setName("Ahmad");
		a1.setPoints(60);
		
		// Create Jsonb and serialize
		Jsonb jsonb = JsonbBuilder.create();
		String result = jsonb.toJson(a1);
		
		System.out.println("Name: " + a1.getName());
		return result;
	}
}
