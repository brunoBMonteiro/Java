package org.example.sortedjava;

import lombok.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class SortedTeste {
    /*
    static List<User> users = Arrays.asList(new User("A",30),
            new User("B",20),
            new User("C", 10));
     */

    /*
    public static void main(String[] args) {
        System.out.println("============Sorted by age, ordem crescente==============");
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());

        sortedUsers.forEach(System.out::println);
        System.out.println("====================================");

        String[] strings = { "aman", "buvam", null,
                "cahil", null };

        // print the array
        System.out.println("Before sorting: "
                + Arrays.toString(strings));

        // apply nullsLast  method
        // and sort the array  ordem natural
        Arrays.sort(strings,
                Comparator.nullsLast(
                        Comparator.reverseOrder()));
        // naturalOrder()
        // print the array, ordem alfabetica
        System.out.println("After sorting: "
                + Arrays.toString(strings));
        System.out.println("=====================================");


    }
       */
    @AllArgsConstructor
    @NoArgsConstructor
    @RequiredArgsConstructor
    @Data
    static class User {
        private String name;
        private int age;
    }
}
