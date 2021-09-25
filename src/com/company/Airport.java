package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Airport {

	public static void main(String[] args) {

		Map<String, List<String>> result = getUnreachableAirports();
		for (Entry<String, List<String>> entry : result.entrySet()) {
			System.out.println("For city:" + entry.getKey() + ",not reachable airport codes are:" + entry.getValue());

		}
	}

	private static Map<String, List<String>> getUnreachableAirports() {

		// input sample
		Dataset dataset1 = new Dataset("a", "b", 1355, 1440);
		Dataset dataset2 = new Dataset("b", "c", 1630, 1725);
		Dataset dataset3 = new Dataset("c", "d", 1035, 1345);
		Dataset dataset4 = new Dataset("b", "e", 1145, 1505);

		// set of airport codes from which departure can happen
		Set<String> keys = new TreeSet<>();
		keys.add(dataset1.getFrom());
		keys.add(dataset1.getFrom());
		keys.add(dataset1.getFrom());
		keys.add(dataset1.getFrom());

		// map where key is fromAirport code and value is a list of codes to which it
		// can't reach within same day
		Map<String, List<String>> multiMap = new HashMap<>();
		for (String string : keys) {
			multiMap.put(string, new ArrayList());
		}

		List<Dataset> list = new ArrayList<>();
		list.add(dataset1);
		list.add(dataset2);
		list.add(dataset3);
		list.add(dataset4);

		for (int i = 0; i < list.size(); i++) {
			Dataset dataset = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				if (j != i) {
					Dataset curr = list.get(j);
					if (multiMap.containsKey(dataset.getFrom())) {
						if (dataset.getTo().equals(curr.getFrom())) {
							if (dataset.getArrTime() > curr.getDepTime()) {
								String currKey = dataset.getFrom();
								List<String> ls = multiMap.get(currKey);
								ls.add(dataset.getTo());
								multiMap.put(currKey, ls);

								// as discussed assuming 2430 is the time when next day starts
							} else if (dataset.getArrTime() < curr.getDepTime() && curr.getArrTime() >= 2430) {
								String currKey = dataset.getFrom();
								List<String> ls = multiMap.get(currKey);
								ls.add(dataset.getTo());
								multiMap.put(currKey, ls);
							}

						}
					}

				}
			}
		}
		return multiMap;
	}

}

class Dataset {

	String from;
	String to;
	long depTime;
	long arrTime;

	public Dataset(String from, String to, long depTime, long arrTime) {
		super();
		this.from = from;
		this.to = to;
		this.depTime = depTime;
		this.arrTime = arrTime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public long getDepTime() {
		return depTime;
	}

	public void setDepTime(long depTime) {
		this.depTime = depTime;
	}

	public long getArrTime() {
		return arrTime;
	}

	public void setArrTime(long arrTime) {
		this.arrTime = arrTime;
	}

}
