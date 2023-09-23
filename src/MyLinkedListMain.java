public class MyLinkedListMain {
    public static void main(String[] args) {
        MyList<String> list1 = new MyLinkedList<>();
        list1.add("abc");
        list1.add("def");
        list1.remove(1);
        list1.add(1, "klm");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        MyList<Integer> list2 = new MyLinkedList<>();
        list2.add(123);
        list2.add(456);
        list2.remove(1);
        list2.add(1, 789);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
