package exfour;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> moneyStrings = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> toInt = s -> Integer.parseInt(s.replace("$", ""));

        List<Integer> numbers = moneyStrings.stream()
                .map(toInt)
                .collect(Collectors.toList());

        System.out.println("Danh sach chuoi: " + moneyStrings);
        System.out.println("Danh sach so nguyen " + numbers);
    }
}
