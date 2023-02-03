// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFunctions1 {

    public static void main(String[] args) {
        Queue<Integer> userQueue = new LinkedList<>();
        Queue<Integer> nativeQueue = new LinkedList<>();
        fillQueue(userQueue);
        nativeQueue=cloneQueue(userQueue,nativeQueue);
        System.out.println(userQueue+"\n"+nativeQueue);
        //userEnqueue(userQueue, 100);
        //nativeQueue.add(100);
        System.out.println(userQueue+"\n"+nativeQueue);
        userDequeue(userQueue);
        System.out.println(nativeQueue.poll());
        System.out.println(userQueue+"\n"+nativeQueue);
        userFirst(userQueue);
        System.out.println(nativeQueue.peek()); 
        System.out.println(userQueue+"\n"+nativeQueue);
    }

    public static Queue<Integer> fillQueue(Queue<Integer> list) {
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    public static Queue<Integer> cloneQueue(Queue<Integer> listFrom,Queue<Integer> listTo) {
        for (Integer el: listFrom) {
            listTo.add(el);
        }
        return listTo;
    }

    public static Queue<Integer> userEnqueue(Queue<Integer> list, int item) {
        list.add(item);
        return list;
    }

    public static Queue<Integer> userDequeue(Queue<Integer> list) {
        if (list.isEmpty()){
            System.out.println("Пустая очередь");
            return list;
        }
        LinkedList<Integer> tempList=new LinkedList<>();
        for (Integer el : list) {
            tempList.add(el);
        }
        System.out.println(tempList.get(0));
        tempList.remove(0);
        list.clear();
        for (Integer el : tempList) {
            list.add(el);
        }
        return list;
    }
    
    public static Integer userFirst(Queue<Integer> list) {
        try {
        LinkedList<Integer> tempList=new LinkedList<>();
        for (Integer el : list) {
            tempList.add(el);
        }
        System.out.println(tempList.get(0));
        return tempList.get(0);
        }catch (Exception e){
            System.out.println("Пустая очередь");
            return null;
        }
    }
}
