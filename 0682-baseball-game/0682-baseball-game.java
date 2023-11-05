class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int answer = 0;

        for(String s : operations) {
            if(s.equals("+")) {
                arrList.add(arrList.get(arrList.size() - 1) + arrList.get(arrList.size() - 2));
            }
            else if(s.equals("D")) {
                arrList.add(arrList.get(arrList.size() - 1) * 2);
            }
            else if(s.equals("C")) {
                arrList.remove(arrList.get(arrList.size() - 1));
            }
            else {
                arrList.add(Integer.parseInt(s));
            }
        }

        for(int i : arrList) {
            answer += i;
        }        

        return answer;
    }
}