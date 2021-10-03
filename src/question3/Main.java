package question3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        System.out.println(list.remove("a"));
        System.out.println(list);
        System.out.println(list.contains("b"));


    }
}
