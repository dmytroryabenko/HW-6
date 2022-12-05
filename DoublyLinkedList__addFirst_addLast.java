package HW_6;

    import java.util.LinkedList;

    public class DoublyLinkedList__addFirst_addLast {
        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();

            list.add("number10");
            list.add("number20");
            list.add("number30");
            list.add("number40");
            list.add("number50");
            list.add("number60");
            list.add("number70");

            System.out.println("List with added elements: " + list);

            list.addFirst("number0");
            System.out.println("List with new first element: " + list);

            list.addLast("number8");
            System.out.println("List with new last element: " + list);

            list.add(2, "number_n");
            System.out.println("List with new index number 2 element: " + list);

            System.out.println("List is Empty: " + list.isEmpty());

            System.out.println("List size: " + list.size());
        }
    }
