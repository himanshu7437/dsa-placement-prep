
public class ProblemSet {
    
    public static void main(String[] args) {
        

    // ques - 1) Reverse String
    // ques - 2) palindrome check
    // ques - 3) valid palindrome
    // ques - 4) Reverse words
    // ques - 5) Maximum Occurring Character
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


    // soln3

    public boolean isPalindrome(String s) {
        // check if string is empty or not
        if(s == null || s.length()  == 0) return true;

        int left = 0, right = s.length() - 1;

        while(left < right) {

            // check if not alphanumeric
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            // checking
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // pointer increment and decrement
            left++;
            right--;
        }

        return true;

    }
    
    // soln4

    // ------ approach 1 --------

    public String reverseWords1(String s) {

        String[] words = s.split("\\.+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0) continue; // 🔥 key fix

            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }

    // ----- approach 2------
    
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != '.') {
                word.append(ch);
            } else if (word.length() > 0) {
                result.append(word.reverse()).append(".");
                word.setLength(0);
            }
        }

        // last word
        if (word.length() > 0) {
            result.append(word.reverse());
        } else if (result.length() > 0) {
            result.setLength(result.length() - 1); // remove extra dot
        }

        return result.toString();
    }

    // soln5

    public char getMaxOccuringChar(String s) {
        // code here
        
        int[] freq = new int[26];
        
        //count frequency
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        int maxFreq = 0;
        char result = 'a';
        
        // finding the max frequency character
        for(int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char)(i + 'a');
            }
        }
        
        return result;
    }
    
}


