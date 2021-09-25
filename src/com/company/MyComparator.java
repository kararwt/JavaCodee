package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<Dataset> {

	@Override
	public int compare(Dataset o1, Dataset o2) {
		long time1 = o1.getDepTime();
		long time2 = o2.getDepTime();

		return 0;
	}

}
