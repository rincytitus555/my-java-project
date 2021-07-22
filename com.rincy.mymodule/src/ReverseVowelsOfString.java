public class ReverseVowelsOfString {
    public String reverseVowels(String s) {

        char[] revVowel = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start=0, end = s.length()-1;

        while(start < end)
        {
            while(vowels.indexOf(revVowel[start]) == -1)
            {
                start++;
                if(start > end)
                {
                    break;
                }
            }
            while(vowels.indexOf(revVowel[end]) == -1)
            {
                end--;
                if(start > end)
                {
                    break;
                }
            }
            if( (start < end) && (vowels.indexOf(revVowel[start]) != -1)
                    && (vowels.indexOf(revVowel[end]) != -1))
            {
                char temp = revVowel[start];
                revVowel[start] = revVowel[end];
                revVowel[end] = temp;
            }
            start++;
            end--;
        }
        return new String(revVowel);

    }
}
