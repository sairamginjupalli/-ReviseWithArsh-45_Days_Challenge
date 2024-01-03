# Solution
## One of ways to solve this question is as shown below. The main logic is adding an extra space to the original string
### Source Geeks For Geeks
class GfG {
    String encode(String str) {
        
        String st = str + " ";
        String s = "";
        int length = st.length();
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            count = count + 1;
            if (st.charAt(i) != st.charAt(i + 1)) {
                s = s + st.charAt(i) + (count);
                count = 0;
            }
        }
        return s;
    }
}
