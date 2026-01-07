
public class ProblemSet {
    
    public static void main(String[] args) {
        

    // ques - 1) Reverse String
    // ques - 2) palindrome check
    }

    //soln1 

    // ---- approach 1 -----
    public void reverseString1(char[] s) {
        int n = s.length;
        
        for(int i = 0; i < n/2 ; i++) {
            // swapping (two pointer approach)
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }

    // ---- approach 2 -----
    public void reverseString2(char[] s) {
        int left = 0, right = s.length - 1;

        while(left < right) {
            // swap
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // pointer increment and decrement 
            left++;
            right--;
        }
    }


    // soln2

	public static boolean checkPalindrome(String str) {
	    // WRITE YOUR CODE HERE	
		if (str == null || str.length() == 0) return true;

	 	int left = 0;
		int right = str.length() - 1;

		while(left < right) {

			// check blank spaces and special character
			while(left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
			while(left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;


			// checking
			if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
				return false;
			}

			// pointer increment and decrment
			left++;
			right--;

		}

		return true;

	}

    
}


