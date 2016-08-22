package leetCodeTwoSum;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.HashMap;

public class twoSum {
	
	public int[] twoSum1(int[] numbers, int target){
		int n = numbers.length;
		int[] results = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++){
			// 每次放入的时候，看看是否已经包含当前值，如果有，说明当前值已经包含和值下班的那个元素为需要的结果			
			if(map.containsKey(numbers[i])){
				results[0] = map.get(numbers[i]);
				results[1] = i;
			}else{
				// 	map里面放的是键为target-每个数的结果 值为下标			
				map.put(target - numbers[i], i);
			}
		}
		
		return results;
	}
	
	public void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	@Test
	public void test() {
		int[] numbers = {1,3,44,5,6};
		int target1 = 47;
		int[] results = twoSum1(numbers, target1);
		printArray(results);
	}

}
