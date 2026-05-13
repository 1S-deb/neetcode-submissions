class Solution {
    public static void fun(int ind, int arr[], int target, HashSet<List<Integer>>set, List<Integer>list)
    {
        if(target==0)
        {
            set.add(new ArrayList<>(list));
            return ;
        }
        if(target<0 ||ind>=arr.length)
         {
            return;
         }
         for(int i =ind;i<arr.length;i++)
         {
            if(i>ind && arr[i]==arr[i-1])
            {
                continue;
            }
             if(arr[i]>target)
             {
                break;
             }
             //pick
             list.add(arr[i]);
             
             fun(i+1,arr,target-arr[i],set,list);
             //backtrack
             list.remove(list.size()-1);
         }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,candidates,target,set,list);
        return new ArrayList<>(set);
    }
}
