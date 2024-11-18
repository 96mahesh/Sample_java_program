import java.util.HashMap;
import java.util.Map;

public class CashProgram {
	
	public static void removeValues(Map<String,Integer> map, String key, int deductAmount)
	{
		if(map.containsKey(key))
		{
			int actualKeyAmount=map.get(key);
			
			int finalKeyAmount=actualKeyAmount-deductAmount;
			
			map.put(key, finalKeyAmount);
		}
	}
	public static void main(String[] args) {
		
		int sum = 0;
		Map<String,Integer> map= new HashMap<>();
		
		map.put("TEN", 10);
		map.put("TWENTY", 10);
		map.put("FIFTY", 10);
		map.put("HUNDRED", 10);
		
		int deductableTenNotes=1;
		int deductableTwentyNotes=2;
		int deductableFiftyNotes=1;
		
		removeValues(map,"TEN",deductableTenNotes);
		removeValues(map,"TWENTY",deductableTwentyNotes);
		removeValues(map,"FIFTY",deductableFiftyNotes);

		System.out.println(map);
		
		sum = sum+deductableTenNotes*10;
		sum = sum+deductableTwentyNotes*20;
		sum = sum+deductableFiftyNotes*50;
		System.out.println(sum);

	}

}
