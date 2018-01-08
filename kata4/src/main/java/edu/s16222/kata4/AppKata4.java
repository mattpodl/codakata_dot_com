package edu.s16222.kata4;

import java.util.ArrayList;

/*
 * In weather.dat you’ll find daily weather data for Morristown,
 * NJ for June 2002. Download this text file, then write a program to
 * output the day number (column one) with the smallest temperature spread
 * (the maximum temperature is the second column, the minimum the third column).
 * */

public class AppKata4
{
	private ScrappingFile scrap = new ScrappingFile();

	private ArrayList<String> getData(String name) {
		return this.scrap.readFile(name);
	}
	public int getDayWithSmallestTemperatureSpread(String fileName) {
		ArrayList<String> list = this.getData(fileName);

		int data[][] = new int [list.size()][3];
		int i = 0;
		for (String row : list) {
			data[i] = this.scrap.readRow(row);
			i++;
		}
		i--;
		int smallestSpread = data[i][2] - data[i][1], smallestSpreadIndex = i;
		while(i>0){
			i--;
			if (smallestSpread > data[i][2] - data[i][1]) {
				smallestSpread = data[i][2] - data[i][1];
				smallestSpreadIndex = i;
			}
		}

		return data[smallestSpreadIndex][0];
	}
public String getNameOfTeam(String fileName) {
	ArrayList<String> list = this.getData(fileName);

	int data[][] = new int [list.size()][3];
	int i = 0;
	for (String row : list) {
		data[i] = this.scrap.readRow(row);
		i++;
	}
	i--;
	int smallestSpread = Math.abs(data[i][6] - data[i][5]), smallestSpreadIndex = i;
	while(i>0){
		i--;
		if (smallestSpread > Math.abs(data[i][6] - data[i][5])) {
			smallestSpread = Math.abs(data[i][6] - data[i][5]);
			smallestSpreadIndex = i;
		}
	}
	String result = list.get(smallestSpreadIndex).substring(7, 22);
	result = result.replaceAll(" ", "");

	return result;

}


	public static void main( String[] args )
	{




	}


}
