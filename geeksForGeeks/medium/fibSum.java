class Solution {
    static long fibSum(long N) {
     long first = 0;
     long second = 1;
     long sum =0;
     for(int i = 0; i<N; i++){
         sum += second;
         long  third = (first%1000000007) + (second%1000000007);
         first = second;
         second = third;
        
     }
     return sum%1000000007;
    }
}
