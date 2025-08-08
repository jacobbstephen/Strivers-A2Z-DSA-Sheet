public class ReverseWords {
    static String reverseWords(String s) {
        
        s = s.trim();
        
        String[] words = s.split("\\s+");
        
       
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
      
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
