import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streams {

	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Monika");
		names.add("Dinesh");
		names.add("Anjali");
		names.add("Rahul");
		names.add("Sapna");
		names.add("Seerat");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("S")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Monika");
		names.add("Dinesh");
		names.add("Anjali");
		names.add("Rahul");
		names.add("Sapna");
		names.add("Seerat");

		Long count = names.stream().filter(s -> s.startsWith("S")).count();
		System.out.println(count);

		long d = Stream.of("Gaurav", "Sapna", "Surochna").filter(s -> {
			s.startsWith("S");
			return true;
		}).count();
		System.out.println(d);

		// print all names of arraylist
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void streamMap() {
		Stream.of("Gaurav", "Szapna", "Surochna").filter(s -> s.startsWith("S")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		List<String> names = Arrays.asList("Vasudev", "Vmino", "Vih");
		names.stream().filter(s -> s.startsWith("V")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	@Test
	public void joinStreams() {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Monika");
		names1.add("Dinesh");
		names1.add("Anjali");
		names1.add("Rahul");
		names1.add("Sapna");
		names1.add("Seerat");

		List<String> names2 = Arrays.asList("Vasudev", "Vmino", "Vih");
		names2.stream().filter(s -> s.startsWith("V")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Monika"));
		Assert.assertTrue(flag);
	}

	@Test
	public void collectStream() {

		List<String> names = Stream.of("Vasudev", "Vmino", "Vih").filter(s -> s.startsWith("V")).sorted()
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(names.get(0));
		
		List<Integer> values = Arrays.asList(1,9,8,8,7,5,7,3,2,2);
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Print number 3rd"+li.get(2));
	}
}
