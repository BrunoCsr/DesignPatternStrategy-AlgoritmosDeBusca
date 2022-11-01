package designPatter.strategy.c214;

public abstract class SortC {
    protected Sort sort;

    public int[] sort(int[] arr) {
        return sort.sort(arr);
    }


}
