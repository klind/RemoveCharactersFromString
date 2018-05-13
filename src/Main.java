public class Main {

    public static void main(String[] args) {
        char[] str = "There Are Characters That Must Be Removed In This String".toCharArray();
        char[] remove = "es".toCharArray();

        boolean[] flags = new boolean[128];

        for (int i = 0; i < remove.length; i++) {
            char c = remove[i];
            flags[c] = true;
        }
        int dest = 0;
        for (int i = 0; i < str.length; i++) {
            if (!flags[str[i]]) {
                str[dest++] = str[i];
            }
        }

        System.out.println(new String(str, 0, dest));
    }
}
