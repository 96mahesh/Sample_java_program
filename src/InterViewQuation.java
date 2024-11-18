
import java.util.*;
public class InterViewQuation {

//	public static void main(String[] args) {
//        // Create and populate the map
//        Map<Integer, Integer> notes = new HashMap<>();
//        notes.put(10, 10);  // 10 rupee notes - 10 count
//        notes.put(20, 10);  // 20 rupee notes - 10 count
//        notes.put(50, 10);  // 50 rupee notes - 10 count
//        notes.put(100, 10); // 100 rupee notes - 10 count
//        
//        // The target amount we want to reach
//        int targetAmount = 100;
//
//        // Find the minimum notes to reach the target amount
//        List<Integer> result = findMinimumNotes(notes, targetAmount);
//
//        // Print the result
//        System.out.println("Notes used to reach the target amount of " + targetAmount + " rupees:");
//        for (int note : result) {
//            System.out.println(note + " rupee note");
//        }
//    }
//
//    public static List<Integer> findMinimumNotes(Map<Integer, Integer> notes, int targetAmount) {
//        // Create a list to store the notes used
//        List<Integer> usedNotes = new ArrayList<>();
//
//        // Create a list of denominations and sort it in descending order
//        List<Integer> denominations = new ArrayList<>(notes.keySet());
//        Collections.sort(denominations, Collections.reverseOrder());
//
//        int remainingAmount = targetAmount;
//
//        for (int denomination : denominations) {
//            while (remainingAmount >= denomination && notes.get(denomination) > 0) {
//                usedNotes.add(denomination);
//                remainingAmount -= denomination;
//                notes.put(denomination, notes.get(denomination) - 1);
//                if (remainingAmount == 0) {
//                    break;
//                }
//            }
//            if (remainingAmount == 0) {
//                break;
//            }
//        }
//
//        // Check if we were able to reach the target amount
//        if (remainingAmount != 0) {
//            System.out.println("It is not possible to reach the target amount with the given notes.");
//            return new ArrayList<>();
//        }
//
//        return usedNotes;
//    }
	
	
	public static void main(String[] args) {
        // Create and populate the map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 50);
        map.put("banana", 20);
        map.put("orange", 30);

        // Key whose value needs to be decreased
        String key = "banana";
        int decrementValue = 5; // Amount by which the value should be decreased

        // Decrease the value
        decreaseValueInMap(map, key, decrementValue);

        // Print the updated map
        System.out.println(map);
    }

    public static void decreaseValueInMap(Map<String, Integer> map, String key, int decrementValue) {
        // Check if the key exists in the map
        if (map.containsKey(key)) {
            // Retrieve the current value
            int currentValue = map.get(key);

            // Decrease the value
            int newValue = currentValue - decrementValue;

            // Update the map with the new value
            map.put(key, newValue);

            System.out.println("Value for key '" + key + "' decreased by " + decrementValue + ". New value: " + newValue);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }
    }
	

}
