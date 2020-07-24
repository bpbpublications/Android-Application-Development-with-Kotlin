package functions;

public class Util {
    public static double sum(int... numbers) {
        double ans = 0;
        for (int number :
                numbers) {
            ans += number;
        }
        return ans;
    }
}
