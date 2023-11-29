package com.ug.zad.springlab04zad02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SortManager {
    private final SortAlgorithm sortAlgorithm;

    @Autowired
    public SortManager(@Qualifier("bubbleSort") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public int[] performSort(int[] array) {
        return sortAlgorithm.sort(array);
    }
}
