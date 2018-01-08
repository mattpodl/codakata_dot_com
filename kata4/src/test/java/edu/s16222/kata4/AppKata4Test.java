package edu.s16222.kata4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppKata4Test
{
    @Test
	public void testAppKata4(){

    		AppKata4 app = new AppKata4();

    		int nine = app.getDayWithSmallestTemperatureSpread("weather.dat");
    		String team = app.getNameOfTeam("football.dat");

    		assertEquals("App should return for this set of data minimum difference in temperature in day 9", 9,nine);
    		assertEquals("App should return for this set of data name of a team with smallest spread of goals", "Leicester",team);

    }
}
