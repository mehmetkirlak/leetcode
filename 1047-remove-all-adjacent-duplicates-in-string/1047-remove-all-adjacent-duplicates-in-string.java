class Solution {
    public static String removeDuplicates(String s) {
        Stack<Character> charStack = new Stack<>();
        charStack.push(s.charAt(0));
        for (int i = 1 ; i < s.length() ; i++) {
            charStack.push(s.charAt(i));
            if (charStack.size() > 1){
                if (charStack.peek() == charStack.get(charStack.size()-2)) {
                    charStack.pop();
                    charStack.pop();
                }
            }
        }
        return charStack.stream().map(a -> a.toString()).collect(Collectors.joining(""));
    }
}