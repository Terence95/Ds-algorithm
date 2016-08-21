import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 标题：数组逆置算法
 * 时间复杂度为O(n), 空间复杂度为O(1)
 * 运行结果：array：{1,2,3,4,5,6}，反转之后：{6,5,4,3,2,1}
 * @author terence
 *
 */

public class InverseIntArrayTest {

	/**
	 * 交换元素方法
	 * @param array
	 * @param a
	 * @param b
	 */
	public void swap(int[] array, int a, int b){
		int t = array[a];
		array[a] = array[b];
		array[b] = t;
	}
	
	/**
	 * 打印数组方法
	 * @param array
	 */
	public void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print( array[i] + "");
		}
		System.out.println();
	}
	
	
	/**
	 * 关键代码部分
	 * @param array
	 */
	public void inverse01(int[] array){
		// 边界检查
		if(array == null || array.length<=1){
			return;
		}
		
		for(int i = 0, j = array.length-1; i<j; i++, j--){
			swap(array, i, j);
		}
	}
	/**
	 * 可以省略指针j，因为j可以表示n-1-i
	 * 循环条件i<n/2
	 *  
	 */
	public void inverse02(int[] array){
		// 边界检查
		if(array == null || array.length<=1){
			return;
		}
		int n = array.length;
		int half = n/2;
		
		for(int i = 0; i< half; i++){
			swap(array, i, n-1-i);
		}
	}
	
	/**
	 * 测试用例
	 */
	@Test
	public void test() {
		int[] array1 = {1,2,3,4,5,6,7};
		printArray(array1);
		inverse01(array1);
		printArray(array1);
	}
	
	@Test
	public void test02() {
		int[] array1 = {1,2,3,4,5,6,7,8};
		printArray(array1);
		inverse02(array1);
		printArray(array1);
	}
	
}
