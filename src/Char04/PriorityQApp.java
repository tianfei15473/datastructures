package Char04;

public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(10);

        priorityQ.insert(10);
        priorityQ.insert(30);
        priorityQ.insert(20);
        priorityQ.insert(100);
        priorityQ.insert(200);
        priorityQ.insert(32);
        priorityQ.insert(11);

        System.out.println(priorityQ.remove());
        System.out.println(priorityQ.remove());
        System.out.println(priorityQ.remove());
        System.out.println(priorityQ.remove());

    }

}
