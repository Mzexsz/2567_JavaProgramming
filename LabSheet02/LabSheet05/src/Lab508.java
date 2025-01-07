import javax.swing.*;
public class Lab508 {
	public static void main(String[] args) {		
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array:"));

		String current = "";
		String previous = "";
		String next = "";
		
		while(true)
		{
			if(!CheckIndex(nums, indexOfArray)){ 
				indexOfArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, again:"));
			}
			else{
				break;
			}
		}
		
		current = "Current data, nums[" + CurrentData(nums, indexOfArray) + "] is " + nums[CurrentData(nums, indexOfArray)];
		previous = (PrevData(nums, indexOfArray) < 0) ? "\nNo previous data" : "\nPrevious data, nums[" + PrevData(nums, indexOfArray) + "] is " + nums[PrevData(nums, indexOfArray)];
		next = (NextData(nums, indexOfArray) >= nums.length) ? "\nNo next data" : "\nNext data, nums[" + NextData(nums, indexOfArray) + "] is " + nums[NextData(nums, indexOfArray)];
		
		JOptionPane.showMessageDialog(null, current + previous + next);

	} //End of main() Method
	
	public static boolean CheckIndex(int[] nums, int index) {	
		boolean check = false;
		
		for (int _nums : nums) 
		{
			check = (_nums == index) ? check = true : check;
		}
		
		return check;
	} //End of CheckIndex() Method
	
	public static int CurrentData(int[] nums, int index){
		int currentIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			currentIndex = (nums[i] == index) ? currentIndex = i : currentIndex;
		}
		
		return currentIndex;
	} //End of CurrentData() Method 
	
	public static int PrevData(int[] nums, int index) {
		int prevData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			prevData = (nums[i] == index) ? prevData = i - 1: prevData;
		}
		
		return prevData;
	} //End of PrevData() Method 
	
	public static int NextData(int[] nums, int index) {
		int nextData = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nextData = (nums[i] == index) ? nextData = i + 1: nextData;
		}
		
		return nextData;
	} //End of NextData() Method
}