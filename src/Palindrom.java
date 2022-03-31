public class Palindrom {
    public  static void main(String[] args ){
        String s = "44044";
        System.out.println(isPalindroms (s) ? "True": "False");
    }

    private static boolean isPalindroms(String s) {
        if (s.length() == 1 || s.length() == 0)
            return  true;

        if (s.charAt(0) == s.charAt(s.length() -1))
            return isPalindroms(s.substring(1, s.length() -1));

        return false;
    }
}
