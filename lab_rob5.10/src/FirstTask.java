public class FirstTask {
    public static void main(String[] args) {
        int n = 500;
        do {
            n = n + 10;
            System.out.println(n);
        } while (n < 650);
        while (n < 650) {
            n = n + 10;
            System.out.println(n);
        }
        for (; n < 650; n = n + 10) {
            System.out.println(n);
        }
    }
}
