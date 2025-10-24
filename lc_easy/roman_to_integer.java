import java.util.HashMap;

class roman_to_integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                num -= map.get(s.charAt(i));
            } else {
                num += map.get(s.charAt(i));
            }
        }
        return num;
    }
}

// for any roman numberal check for pairs successively from left to right
// if the next character's value is less than or equal to the current
// character's value
// then the current character's value is added
// if the next character's value is more than the current character's
// then the current character's value is subtracted