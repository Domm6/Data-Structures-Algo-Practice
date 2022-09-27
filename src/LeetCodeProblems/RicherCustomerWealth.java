package LeetCodeProblems;
public class RicherCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        
        for(int[] customer : accounts) {
            int currentCustomerWealth = 0;

                for(int bank : customer) {
                    currentCustomerWealth = currentCustomerWealth + bank;
                }
                maxWealthSoFar = Math.max(currentCustomerWealth, maxWealthSoFar);
        }
        return maxWealthSoFar;
    }
}
