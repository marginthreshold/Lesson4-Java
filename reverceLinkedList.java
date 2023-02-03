import java.util.LinkedList;
import java.util.Random;

public class reverceLinkedList {
    public static void main(String[] args) {
    LinkedList<Integer> revercedLinList = new LinkedList<>();
    fillLinkedList(revercedLinList);
    System.out.println(revercedLinList);
    revLinkedList(revercedLinList);
    System.out.println(revercedLinList);
        
    }

    public static LinkedList<Integer> fillLinkedList(LinkedList<Integer> list) {
        Random random = new Random();
        for (int index = 0; index < 8; index++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    public static LinkedList<Integer> revLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < (list.size()/2); i++) {
            int temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
        return list;
    }
}

    