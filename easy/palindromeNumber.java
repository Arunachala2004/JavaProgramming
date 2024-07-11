//myCode
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}



//efficientCode

/*
class Solution {
    public boolean isPalindrome(int x) {

        // Approach 1:-

        // // Convert to String
        // String str = Integer.toString(x);

        // int left = 0;
        // int right = str.length()-1;

        // while(left < right){
        //     if(str.charAt(left) != str.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


        // Approach 2:-

        int sum = 0, target = x;

        while(x > 0){

          int rem = x % 10;
           x = x / 10;

           sum = sum * 10 + rem;
        }

        return sum == target;
    }
}

*/
