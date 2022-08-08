package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        if (printToInclusive == 0) System.out.print("");
        for (int i = 2; i < printToInclusive; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                if (i % i1 == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
                count = 0;
        }
    }
}
