package streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> ints = strs.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(ints);
		System.out.println(ints.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get());

		List<String> loseWeight = new ArrayList<>();
		loseWeight.add("avocados");
		loseWeight.add("beans");
		loseWeight.add("salad");
		loseWeight.add("oats");
		loseWeight.add("broccoli");

		List<Integer> lengths = loseWeight.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println(lengths);

//		List<List> listOfListOfNumber = new ArrayList<>();
//		listOfListOfNumber.add(Arrays.asList(2, 4));
//		listOfListOfNumber.add(Arrays.asList(3, 9));
//		listOfListOfNumber.add(Arrays.asList(4, 16));

		

	}
}
