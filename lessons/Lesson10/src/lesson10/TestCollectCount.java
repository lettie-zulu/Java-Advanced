package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class TestCollectCount {
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
        Map<String, Long> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
        gMap.forEach((k, v) -> System.out.println("Department: " + k + v));

    }

}
