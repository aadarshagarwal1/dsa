class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = new String[] { "", "flow", "floght" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int ret_str_length = 0;
        outerloop: while (true) {
            if (ret_str_length >= strs[0].length())
                break;
            char curr_char = strs[0].charAt(ret_str_length);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() <= ret_str_length) {
                    break outerloop;
                }
                if (strs[i].charAt(ret_str_length) != curr_char) {
                    break outerloop;
                }
            }
            ret_str_length++;
        }
        return strs[0].substring(0, ret_str_length);
    }
}
// take first character of the first string and keep checking its presence in
// all the strings
// if it present in all the strings then increment the return string length by 1
// two cases where you need to stop is:-
// 1. if the length of the string in question gives index_of_bounds error
// 2. if the string doesnt have that character in the required index
// break the loops at these conditions and return the required LCP