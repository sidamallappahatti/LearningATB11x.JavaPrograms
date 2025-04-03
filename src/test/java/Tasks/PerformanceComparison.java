package Tasks;

public class PerformanceComparison  {
    public static void main(String[] args) {
        long startTime, endTime;
        int iterations = 100000;

        // Testing StringBuffer
        StringBuffer sb = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // Testing StringBuilder
        StringBuilder sb2 = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb2.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}

