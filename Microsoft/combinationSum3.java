class Solution {
    int k;
    int n;
    List<List<Integer>> res = new ArrayList<>();
    int[] nums = new int[9];
    public List<List<Integer>> combinationSum3(int k, int n) {
        for(int i = 0; i<9;i++) {
            nums[i] = i+1;
        }
        this.k = k;
        this.n = n;
        for(int i =0;i<9;i++) {
            func(0,new ArrayList<>(),i);
        }
        return res;
    }

    public void func(int sum, ArrayList<Integer> list,int index) {
        list.add(nums[index]);
        sum+= nums[index];
        if(sum == n && list.size() == k) {
            // System.out.println(n);
            res.add(new ArrayList<>(list));
            return;
        }
        
        if(list.size() == k || sum > n) {
            return;
        }

        for(int i = index+1; i<9;i++) {
            func(sum,list,i);
            list.remove(list.size() -1);
        }
    }
}