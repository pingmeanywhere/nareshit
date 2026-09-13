package leetcode.august;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        boolean isChar = false;
        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            // is char false
            if(!isChar && s.charAt(i) == ' ') {
                continue;
            }
            else if(s.charAt(i) != ' ') {
                isChar = true;
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }

    static void main(String[] args) {
        LengthOfLastWord a = new LengthOfLastWord();
        System.out.println(a.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
