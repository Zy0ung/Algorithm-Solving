class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        int ab2 = 2 * a * b;
        
        if (ab > ab2) {
            return ab;
        } else {
            return ab2;
        }
    }
}