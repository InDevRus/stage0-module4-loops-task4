package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (var number = 0; number <= lastPrinted; number++) {
            if (number % 3 > 0) {
                System.out.println(number);
            }
        }
    }
}
