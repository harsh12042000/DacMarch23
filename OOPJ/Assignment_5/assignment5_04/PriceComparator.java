package assignment5_04;

import java.util.Comparator;

public class PriceComparator implements Comparator<Menu> {

	@Override
	public int compare(Menu o1, Menu o2) {
		if(o1.getPrice() < o2.getPrice())
			return -1;
		else if(o1.getPrice() > o2.getPrice())
			return 1;
		return 0;
	}

}
