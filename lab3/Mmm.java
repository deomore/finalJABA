package vlsu;

public class Mmm implements  gav {

    public void zxc(int n) {
        int a = 2;
int c=0;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    c++;
                    System.out.print(a + " ");
                    zxc(n / a);
                } else {
                    System.out.println(a);
                    c++;

                }
                return;

            }
            a++;
            c++;
        }
    }
}
