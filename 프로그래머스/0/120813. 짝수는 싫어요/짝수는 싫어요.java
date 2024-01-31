class Solution {
    public int[] solution(int n) {
        
        int idx = 0;
        int[] answer;
        
        if(n % 2 == 0) {
            answer = new int[n / 2];
            
        } else {
            answer = new int[n / 2 + 1];
        }
        
        for(int i = 1; i <= answer.length; i++) {
            answer[idx++] = i * 2 - 1; 
        }
        
        return answer;
    }
}