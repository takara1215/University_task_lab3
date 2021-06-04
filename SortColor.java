package project_1;

public class SortColor{

	public static void main(String[] args) {


	}

	 public int[] sortColors(int[] nums) {

			  for(int i=0; i < nums.length-1; i++) {
		          for(int j=0; j < nums.length-1; j++) {
		          	if(nums[j] > nums[j+1]) {
		          		int asc = nums[j];
		          		nums[j] = nums[j+1];
		          		nums[j+1] = asc;
		          	}
		          }
		      }

		      for(int i = 0; i < nums.length; i++) {
		      	System.out.print(nums[i]+" ");
		      }

		      return nums;
			}
	}
