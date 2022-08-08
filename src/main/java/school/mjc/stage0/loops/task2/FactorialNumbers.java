package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 3;
        int sum = 2;
        if (printToInclusive == 0){
            System.out.println(1);
            return;
        }
        System.out.println(1);
        System.out.println(1);
        System.out.println(2);
        while (count <= printToInclusive){
            sum *= count;
            System.out.println(sum);
            count++;
        }

    }
}
