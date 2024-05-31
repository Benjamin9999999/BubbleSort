package wt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {15, 2, 14, 3, 13, 4, 12, 5, 11, 6, 10, 7, 9, 8, 1};
        int size = nums.length;
        int temp =0;
        System.out.println("Before sorting: " );
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0; i< size; i++){
            for(int j=0; j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                temp= nums[j];
                    System.out.println("The first value of temp is "+temp);
                    System.out.println("The value current value of  j where "+nums[j]+ " was: "+nums[j]);
                nums[j]=nums[j+1];

                nums[j+1]= temp;

           }
        }

        int j =0;
        temp= nums[j];
        System.out.println("The value of temp now is: "+temp);
        nums[j]= 2;




        System.out.println();
        System.out.println("After Sorting: ");
        for (int num : nums) {
            System.out.print( num+" ");
        }

    }
}
}