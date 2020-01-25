package hackerrank.maps;

import java.util.HashMap;

class Substring {
    public static int shortestSubstring(String s) {
        int length = 0;
        int newLength;
        HashMap<Character, Integer> map = new HashMap();
        //Loop over array collecting characters and locations
        //Reset min length if new char is discovered otherwise calculate and compare length
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) == null) {
                length = Integer.MAX_VALUE;
            }
            map.put(c,i);
            newLength = calcLength(map);
            if(newLength < length) {
                length = newLength;
            }
        }
        return length;
    }

    private static int calcLength(HashMap<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(Character c : map.keySet()) {
            int location = map.get(c);
            if(location > max) max = location;
            if(location < min) min = location;
        }

        return max - min + 1;
    }
}