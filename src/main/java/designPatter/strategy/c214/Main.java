package designPatter.strategy.c214;

public class Main {
    public static void main(String[] args) {


        int[] num = {3, 2, 4, 6, 7, 1, 10};
        int[] num2 = {7, 99, 0, 1, 4, 2, 8};
        int[] num3 = {99, 2, 1000, 33, 4, 5, 66};
        BubbleSortC sortc = new BubbleSortC();
        InsertionSortC insertionSortC = new InsertionSortC();


        num = sortc.sort(num);
        num2 = insertionSortC.sort(num2);


        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

    }
}