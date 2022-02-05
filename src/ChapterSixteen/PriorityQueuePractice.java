package ChapterSixteen;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void printPriorityQueueElements(PriorityQueue<Integer> queue){
        while(!queue.isEmpty()){
            if(queue.size() > 0){
                System.out.println(queue.peek());
                queue.poll();
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        printPriorityQueueElements(queue);
        queue.offer(223);
        queue.offer(54);
        queue.offer(437);
        queue.offer(123);
        System.out.println("Contents of the Priority queue: ");
        printPriorityQueueElements(queue);

    }

}
