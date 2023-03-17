package school.mjc.stage0.loops.task4;

import java.text.MessageFormat;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        var skippedSum = 0;
        var entireSum = 0;

        for (var term = 1; term <= lastInRow; term++) {
            skippedSum += term <= numberToSkip ? term : 0;
            entireSum += term;
        }

        var countedSum = entireSum - skippedSum;
        System.out.println(MessageFormat.format("skipped sum is {0}", skippedSum));
        System.out.println(MessageFormat.format("counted sum is {0}", countedSum));
    }
}
