package bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");

        Collections.sort(cities, (c1, c2) -> Integer.compare(c1.length(), c2.length()));

        System.out.println("Danh sách sau khi sắp xếp theo độ dài (ngắn -> dài):");
        cities.forEach(System.out::println);
    }
}
