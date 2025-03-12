public class Countvowels {
    public static  int vowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for(char ch: str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
