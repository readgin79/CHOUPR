package java8.lambda.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		//集合物件結合lambda
		//list應用
		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Nice");
		list.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		list.stream().filter(s -> s.contains("H")).forEach(s -> System.out.println(s));
		
		List<String> list2 = list.stream().filter(s -> s.contains("H")).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println();
		
		List<String> listInt = new ArrayList<String>();
		listInt.add("1");
		listInt.add("2");
		listInt.add("3");
		listInt.add("5");
		listInt.add("4");
		System.out.println(listInt.stream().mapToInt(s->Integer.valueOf(s)).sum());
		System.out.println(listInt.stream().filter(s -> Integer.valueOf(s) < 3).mapToInt(s->Integer.valueOf(s)).average().getAsDouble());

		System.out.println();
		
		//map應用
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		
		StringBuffer ans = new StringBuffer();
		map.forEach((k, v) -> ans.append(v));
		System.out.println(ans);
	}

}
