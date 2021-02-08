public class reverse {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length - 1;
        while (a < b) {
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
    }
}