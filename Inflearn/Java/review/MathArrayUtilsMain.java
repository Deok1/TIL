package static1.ex;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));
    }

    public static class MathArrayUtils {

        private MathArrayUtils() {

        }

        public static int sum(int []values) {
            int sum = 0;
            for (int value : values) {
                sum += value;
            }
            return sum;
        }

        public static double average(int[] values) {
            return sum(values) / values.length;
        }

        public static int min(int[] value) {
            int minValue = value[0];
            for (int i : value) {
                if (minValue > i) {
                    minValue = i;
                }
            }
            return minValue;
        }

        public static int max(int[] value) {
            int maxValue = value[0];
            for (int i : value) {
                if (maxValue < i) {
                    maxValue = i;
                }
            }
            return maxValue;
        }
    }
}
