class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Long> sMap = new HashMap<>();
        Map<Character,Long> tMap = new HashMap<>();

        sMap = s.chars().mapToObj(c -> (char) c).collect(Collectors
        .groupingBy(java.util.function.Function.identity(),Collectors.counting()));

        tMap = t.chars().mapToObj(c -> (char)c).collect(Collectors
        .groupingBy(java.util.function.Function.identity(),Collectors.counting()));

        return sMap.equals(tMap);
    }
}
