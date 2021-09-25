package com.company;

class NodeB {
    int data;
    NodeB left, right;

    public NodeB(int item) {
        data = item;
        left = right = null;
    }
}

/* Class to print the Diameter */
public class IsBalancedOrDiameter {
    NodeB root;

    int diameter(NodeB root) {
        if (root == null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);
        int diameter = lheight + rheight + 1;
        int leftH = diameter(root.left) + 1;
        int rightH = diameter(root.right) + 1;

		return Math.max(Math.max(leftH, rightH),diameter);
    }

    int diameter() {
        return diameter(root);
    }

    /*
     * The function Compute the "height" of a tree. Height is the number f nodes
     * along the longest path from the root node down to the farthest leaf node.
     */
    static int height(NodeB node) {
        if (node == null)
            return 0;

        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String args[]) {


        /* creating a binary tree and entering the nodes */
        IsBalancedOrDiameter tree = new IsBalancedOrDiameter();
        tree.root = new NodeB(1);
        tree.root.left = new NodeB(2);
		tree.root.left.left = new NodeB(3);
		tree.root.left.left.left = new NodeB(7);


        tree.root.left.right = new NodeB(4);
		tree.root.left.right.right = new NodeB(5);
		tree.root.left.right.right.right = new NodeB(6);


        System.out.println("The diameter of given binary tree is : " + tree.diameter());
    }
}

/*
 *
 * static int count =0; static boolean isTriplet(int ar[], int n) { for (int
 * i=0; i<n; i++) { for (int j=i+1; j<n; j++) { for (int k=j+1; k<n; k++) { //
 * Calculate square of array elements int x = ar[i]*ar[i], y = ar[j]*ar[j], z =
 * ar[k]*ar[k];
 *
 * if (x == y + z || y == x + z || z == x + y) { System.out.println(x);
 * System.out.println(y); System.out.println(z); return true; } count ++; } } }
 * System.out.println(count); // If we reach here, no triplet found return
 * false; }
 *
 *
 * // Driver program to test above function public static void main(String[]
 * args) { int ar[] = {3, 16, 4, 7, 5}; int ar_size = ar.length;
 * if(isTriplet(ar,ar_size)==true) System.out.println("Yes"); else
 * System.out.println("No"); }
 *
 */

/*
 * private static int fun(Integer[] arr) {
 *
 * List<Integer> ls = new ArrayList<>(Arrays.asList(arr));
 *
 * int max = ls.stream().mapToInt(p -> p).max().getAsInt();
 *
 * int index = ls.indexOf(max);
 *
 * int minValue = arr[index]; System.out.println(minValue);
 *
 * int i = index-1;
 *
 * System.out.println(index);
 *
 * while(i>0) { if(arr[i-1]>arr[i] && minValue > arr[i]) { minValue = arr[i]; }
 * i--; }
 *
 * System.out.println(minValue); return minValue; }
 */

/*
 * public static int atoi(String str) { if (str == null || str.length() < 1)
 * return 0;
 *
 * // trim white spaces str = str.trim();
 *
 * char flag = '+';
 *
 * // check negative or positive int i = 0; if (str.charAt(0) == '-') { flag =
 * '-'; i++; } else if (str.charAt(0) == '+') { i++; } // use double to store
 * result double result = 0;
 *
 * // calculate value while (str.length() > i && str.charAt(i) >= '0' &&
 * str.charAt(i) <= '9') { result = result * 10 + (str.charAt(i) - '0'); i++; }
 *
 * if (flag == '-') result = -result;
 *
 * // handle max and min if (result > Integer.MAX_VALUE) return
 * Integer.MAX_VALUE;
 *
 * if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
 *
 * return (int) result; }
 */

/*
 * public static void main(String[] args) { romanMap.put('I', 1);
 * romanMap.put('V', 5); romanMap.put('X', 10); romanMap.put('L', 50);
 * romanMap.put('C', 100); romanMap.put('D', 500); romanMap.put('M', 1000);
 * System.out.println(romanToInt("XCVIII")); }
 *
 * private static int romanToInt(String string) { int temp = 0;
 * if(string.length() == 1) return 1;
 *
 * int i = 0; while(i<string.length()) {
 *
 * if(i == string.length()-1) { temp += romanMap.get(string.charAt(i)); i++; }
 * else { if(romanMap.get(string.charAt(i)) < romanMap.get(string.charAt(i+1)))
 * { temp += romanMap.get(string.charAt(i+1)) - romanMap.get(string.charAt(i));
 * i += 2; } else { temp += romanMap.get(string.charAt(i)); i++; } } } return
 * temp; }
 */

/*
 * private static int isRotated(String str1, String str2){ StringBuilder sb =
 * new StringBuilder(""); sb.append(str1); sb.append(str1); if(sb.indexOf(str2)
 * == -1) return 0; else return 1; }
 */

/*
 * public static void main(String[] args) {
 * System.out.println(recursive_duplicate("ABCCBCBA")); //acba }
 *
 * public static String recursive_duplicate(String str) { StringBuilder temp =
 * new StringBuilder(); int n = str.length();
 *
 * if(str.charAt(0)!=str.charAt(1)) { temp.append(str.charAt(0)); } int i=1;
 *
 * while(i<n) { if(i == n-1) { if(str.charAt(i)!=str.charAt(i-1)) {
 * temp.append(str.charAt(i)); } } else { if(str.charAt(i)!=str.charAt(i-1) &&
 * str.charAt(i)!=str.charAt(i+1)) { temp.append(str.charAt(i)); } } i++; }
 * if(temp.length()!=str.length()) { return
 * recursive_duplicate(temp.toString()); } return temp.toString();
 */

/*
 * public static void main(String[] args) { String s = "azxxzy"; s =
 * "geeksforgeegee"; System.out.println(remove(s)); }
 *
 * static String remove(String s) { char res[] = new char[s.length()]; int j =
 * 0; res[j] = s.charAt(0); for (int i = 1; i < s.length(); i++) { if
 * (s.charAt(i) != res[j]) { res[++j] = s.charAt(i); } else { res[j--] =
 * '\u0000'; } }
 *
 * String result = String.valueOf(res); return result.substring(0,j+1); }
 */

/*
 * public static void main(String[] args) {
 * System.out.println(longestPalindromeString("aaaabbaa"));
 * System.out.println(longestPalindromeString("12321"));
 * System.out.println(longestPalindromeString("9912321456"));
 * System.out.println(longestPalindromeString("9912333321456"));
 * System.out.println(longestPalindromeString("12145445499"));
 * System.out.println(longestPalindromeString("1223213"));
 * System.out.println(longestPalindromeString("abb")); }
 *
 * static public String intermediatePalindrome(String s, int left, int right) {
 * if (left > right) return null; while (left >= 0 && right < s.length() &&
 * s.charAt(left) == s.charAt(right)) { left--; right++; } return
 * s.substring(left + 1, right); }
 *
 * // O(n^2) public static String longestPalindromeString(String s) { if (s ==
 * null) return null; String longest = s.substring(0, 1); for (int i = 0; i <
 * s.length() - 1; i++) { //odd cases like 121 String palindrome =
 * intermediatePalindrome(s, i, i); if (palindrome.length() > longest.length())
 * { longest = palindrome; } //even cases like 1221 palindrome =
 * intermediatePalindrome(s, i, i + 1); if (palindrome.length() >
 * longest.length()) { longest = palindrome; } } return longest; }
 */

/*
 * public static void permutation(String str) { permutation("", str); }
 *
 * private static void permutation(String prefix, String str) {
 *
 * int n = str.length(); if (n == 0) System.out.println(prefix); else { for (int
 * i = 0; i < n; i++) { count ++; //System.out.println("prefix " + prefix +
 * str.charAt(i)); //System.out.println("first " + str.substring(0, i) );
 * //System.out.println("second " + str.substring(i+1, n) ); permutation(prefix
 * + str.charAt(i), str.substring(0, i) + str.substring(i+1));
 *
 * }
 *
 * } System.out.println(count); }
 *
 * }
 */

/*
 * public static void main(String... args) {
 *
 * int [] arr = {2,3,4,5,7,8}; int sum = 12;
 *
 * System.out.println(findPos(arr,sum));
 *
 *
 *
 * }
 *
 * private static boolean findPos(int[] arr, int sum) {
 *
 * int firstIndex = 0; int lastIndex = 0; int temp = 0;
 *
 * for (int i = 0; i < arr.length; i++) {
 *
 * if(temp<sum || temp > sum) {
 *
 * if(temp<sum) { temp += arr[i]; lastIndex++; } else { temp -= arr[firstIndex];
 * firstIndex ++; lastIndex--; }
 *
 * }
 *
 * if(temp == sum) { System.out.println(firstIndex + " " + lastIndex); return
 * true; }
 *
 * } return false;
 *
 * }
 */

/*
 *
 * public static void main(String[] args) {
 *
 * LL head = null;
 *
 * head = addNode(head, 1); head = addNode(head, 2); head = addNode(head, 3);
 * head = addNode(head, 4); printNodes(head);
 *
 * }
 *
 * private static void printNodes(LL head) { LL curr = head; while (curr !=
 * null) { System.out.println(curr.getData()); curr = curr.getNext(); }
 *
 * }
 *
 * static LL addNode(LL head, int info) {
 *
 * if (head == null) { head = new LL(info, null);
 *
 * return head; } LL temp = new LL(info, null); if (head.getNext() == null) {
 *
 * head.setNext(temp); } else { LL curr = head; while (curr.getNext()!= null) {
 * curr = curr.getNext();
 *
 * }
 *
 * curr.setNext(temp);
 *
 * } return head; }
 *
 * static class LL { int data; LL next;
 *
 * LL(int data, LL next) { this.data = data; this.next = next; }
 *
 * public int getData() { return data; }
 *
 * public void setData(int data) { this.data = data; }
 *
 * public LL getNext() { return next; }
 *
 * public void setNext(LL next) { this.next = next; } }
 *
 */
