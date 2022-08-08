package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) System.out.print("");
        else { for (int i = 0; i <= (multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive:
                -multiplyByAndToInclusive); i++) {
            System.out.println(i * multiplyByAndToInclusive);
        }
        }
    }
}
