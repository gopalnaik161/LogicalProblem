

class problem4 {
 public int removeDuplicates(int nums[])
    {
    int j=1;
     for(int i=0; i<nums.length-1;i++){
         if(nums[i]!=nums[i+1]){
             nums[j]=nums[i+1];
             j++;
         }
     }
    return j;
    }

    public static void main(String[] args) {
        problem4 p= new problem4();
        int nums []= {1,1,2};
        System.out.println(p.removeDuplicates(nums));
    }
}

