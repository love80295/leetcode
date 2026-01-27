class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i<numRows ; i++){
            List<Integer> nl = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++){
                if(j==0 || j==i) nl.add(1);
                else{
                    int sum = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    nl.add(sum);
                }
            }
            list.add(nl);

        }
        return list;
    }
}