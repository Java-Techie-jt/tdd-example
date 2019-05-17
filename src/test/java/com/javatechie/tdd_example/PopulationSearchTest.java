package com.javatechie.tdd_example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PopulationSearchTest

{
	
	
	
	@Test
	public void findPopulation() {
		String city="Bangalore";
		int expectedPopulationCount=200000;
		PopulationSearch ps=new PopulationSearch();
		int count=ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}
	
	@Test(expected=NullPointerException.class)
	public void findPopulationWithEmptyInput() {
		String city="";
		int expectedPopulationCount=0;
		PopulationSearch ps=new PopulationSearch();
		int count=ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}
	
	@Test(expected=NullPointerException.class)
	public void findPopulationWithInavlidInput() {
		String city="XYZ";
		int expectedPopulationCount=0;
		PopulationSearch ps=new PopulationSearch();
		int count=ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}
}
