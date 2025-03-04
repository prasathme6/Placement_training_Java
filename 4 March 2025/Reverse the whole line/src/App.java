public class App {
    public static void main(String[] args) {
        String s = "I  love   Java Programming";
        String[] t = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = t.length - 1; i >= 0; i--) {
            ans.append(t[i]);
            if (i > 0) ans.append(" ");
        }
        System.out.println(ans.toString());
    }
}
