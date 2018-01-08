package edu.s16222.kata9;

import java.util.HashMap;
import java.util.Map;

public class AppKata9
{
	String groseryList;

	AppKata9(){
		groseryList = "";
	}

	public void scan(String scanedItem) {
		this.groseryList += scanedItem;
	}

	public int total() {
		return price(this.groseryList);
	}

	public int price(String groseryList) {
		int price = 0;
		char[] grosery = groseryList.toCharArray();
		Map<Character, Integer> groseryMap = new HashMap<Character, Integer>();
		for (char c : grosery) {
			int add = 1;
			if (groseryMap.containsKey(c)) {
				add += groseryMap.get(c);
			}
			groseryMap.put(c, add);
		}
		if (groseryMap.containsKey('A')) {
		price += (groseryMap.get('A') % 3) * 50 + groseryMap.get('A') / 3 * 130;
		}

		if (groseryMap.containsKey('B')) {
			price += (groseryMap.get('B') % 2) * 30 + groseryMap.get('B') / 2 * 45;
			}
		if (groseryMap.containsKey('C')) {
			price += groseryMap.get('C') * 20;
			}
		if (groseryMap.containsKey('D')) {
			price += groseryMap.get('D') * 15;
			}

		return price;
	}






    public static void main( String[] args )
    {
    }
}
