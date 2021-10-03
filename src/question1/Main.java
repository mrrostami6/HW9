package question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Character> list1 = new java.util.TreeSet<>();
        Set<Character> list2 = new java.util.TreeSet<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        Random random = new Random();

        for (int i = 0; i < 11; i++) {
            list1.add(letters[random.nextInt(11)]);
            list2.add(letters[random.nextInt(11)]);
        }

        System.out.println("List 1 : ");
        System.out.println(list1);
        System.out.println("List 2 : ");
        System.out.println(list2);
        System.out.println("Union : ");
        System.out.println(getUnion(list1, list2));
        System.out.println("Intersection : ");
        System.out.println(getIntersection(list1, list2));
    }

    public static Set<Character> getUnion(Set<Character> list1, Set<Character> list2) {
        Set<Character> union = new java.util.TreeSet<>();
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }

    public static Set<Character> getIntersection(Set<Character> list1, Set<Character> list2) {
        List<Character> intersection = new ArrayList<>();
        intersection.addAll(list1);
        intersection.addAll(list2);

        List<Character> union = new ArrayList<>(getUnion(list1, list2));
        for (Character character : union)
            intersection.remove(character);

        return new java.util.TreeSet<>(intersection);

    }
}
