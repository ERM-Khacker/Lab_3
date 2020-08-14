public class Lab3 {
    public static void main(String[] args) {
        byte a = 100;
        short b = 130;
        int c = 1000_000_000;
        long d = 1000_000_000_00L;
        float e = 9.81f;
        double f = 3.145_495;
        char g = 15;
        boolean h = true;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h);
        System.out.println();

        byte i = 127;
        short j = i;
        int k = j;
        long l = k;
        int m = 1000_000_000;
        double n = m;
        short o = 10000;
        float p = o;
        double q = p;
        char r = 1000;
        int s = r;
        System.out.println(i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + q + ", " + r + ", " + s);
        System.out.println();

        int max = 200_000_0000;
        float t = max;
        System.out.println(max + ", " + t);
        System.out.println();

        byte u = 127;
        u++;
        System.out.println(u);
        System.out.println();

        byte v = 10;
        System.out.print(v % 2 == 0 ? "even number" : "odd number");

    }
}
