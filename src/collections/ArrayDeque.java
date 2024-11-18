package collections;


import java.util.*;

/**
 * 
 */
public class ArrayDeque {

	public static void main(String[] args) {
		 //priotity queue
//		
//		//creation of queue Element
//		
//		//PriorityQueue<Integer> pq = new PriorityQueue<>();
//		Queue<Integer> pq = new PriorityQueue<>();
//		
//		//Addition of Elements Of Queue =====> Methods is add , Offer
//		//Add elements in queue high priority is calld lowest inteher In Integers
//		//Queue is could not follwing the shorted Order
//		
//		pq.add(8);
//		pq.add(5);
//		pq.offer(2);
//		pq.offer(7);
//		pq.add(1);
//		
//		System.out.println(pq);
//		
//		//Retrival Of Element =====> Method peek
//		// In queue Retrival Priority Elements Onle Head Position
//		System.out.println(pq.peek());
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		
//		//remove of element ==== Method poLL Remove;
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		//System.out.println(pq.remove());
//		
//		//Verification Of Element ======> Contains
//		
//		System.out.println(pq.contains(5));
//		System.out.println(pq.contains(50));
//		
////		for (Integer integer : pq) {
////			System.out.println(integer);
////		}
//		
//		while(!pq.isEmpty()) {
//			System.out.println(pq.poll());
//		}
//		
////		pq.clear();
////		System.out.println(pq);
//		
//		//Hieght Integer Hiegtht Priority
//		//Reverse Order
//		
//		System.out.println();
//		
//		Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
//		p.add(8);
//		p.add(5);
//		p.offer(2);
//		p.offer(7);
//		p.add(1);
//		
//		while(!p.isEmpty()) {
//			System.out.println(p.poll());
//		}/
		
		//Defalt Value is 11
		
		//Queue<String> ad = new ArrayDeque()<>();//Default value is 17
		//Deque<String> ad = new java.util.ArrayDeque<>();
		LinkedList<String> ad = new LinkedList<String>();
		
		//Addition of Elements Of Queue =====> Methods is add , Offer offerfrist offerlast addfrist addlast addll
		//Retrival Of Element =====> Method peek peekfrist peeklast
		//remove of element ==== Method poLL Remove; pollfrist polllast removie frist removie last
		
		ad.add("Banana");
		ad.offerFirst("Cherry");
		ad.addLast("Apple");
		ad.addFirst("Kiwi");
		ad.offer("peer");
		ad.offerLast("Mango");
		
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		
		System.out.println(ad.size());
		
//		while(!ad.isEmpty()) {
//			System.out.println(ad);
//		}
		//Kiwi, Cherry, Banana, Apple, peer, Mango Expected Output
	}
}
