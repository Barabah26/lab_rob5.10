public class FourTask {
    public static void main(String[] args) {
        int n, i, fac;
        n = 10;
        i = 0;
        fac = 1;
        while (i < n) {
            i += 1;
            fac = fac * i;
        }
        System.out.println("Факторіал " + n + " = " + fac);

        int a,b;
        a = 1;
        b = 3;
        for (int c = 1; c <= b; c++) {
            a = a * c;
        }
        System.out.println("Факторіал " + n + " = " + fac);
    }
}
