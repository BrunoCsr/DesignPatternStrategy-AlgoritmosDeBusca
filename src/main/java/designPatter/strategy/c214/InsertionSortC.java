package designPatter.strategy.c214;

import designPatter.strategy.c214.impl.BubbleSort;

public class InsertionSortC extends SortC{

    public InsertionSortC(){
        sort = new BubbleSort();
    }
}
