package stream;

import console.console;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {

    public Streamm() {

    }

    public void test() {

        List<Integer> nums = Arrays.asList(5, 4, 3, 2, 1, 0);

        nums.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .map(n -> n*2)
                .forEach(System.out::println);

        int res = nums.parallelStream()
                .filter(n -> n % 2 != 0)
                .map(n -> n*2)
                .reduce(0, Integer::sum);

        console.log("res = ".concat(String.valueOf(res)));
    }

    ArrayList<Integer> arrayList = new ArrayList<>();

    public void setArrayVal() {
        for (int i = 1; i <= 10; ++i) arrayList.add(i);
    }

    public void streamToList() {

        setArrayVal();

        var nums = arrayList
                .stream().
                map(n -> n + 1)
                .toList();

        nums.forEach(System.out::println);
    }

    public void streamToMap() {

        Stream<String> strStream = Stream.of("A", "AA", "AAA");

        Map<String, Integer> map = strStream
                .collect(
                        Collectors.toMap(
                                key -> key,
                                String::length
                        )
                );

        console.log("first map\n");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        setArrayVal();

        Map<Integer, String> map2 = arrayList
                .stream()
                .collect(
                        Collectors.toMap(
                                key -> key,
                                val -> String.valueOf(val * val)
                        )
                );

        console.log("2nd map using list of nums\n");
        map2.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public List<Integer> findDuplicate() {

        var nums = List.of(1, 2, 2, 3, 4, 4);
        var count = Collections.frequency(nums, 2);
        System.out.println(count);

        return nums
                .stream()
                .filter(n -> Collections.frequency(nums, n) > 1)
                .distinct()
                .toList();
    }
}
