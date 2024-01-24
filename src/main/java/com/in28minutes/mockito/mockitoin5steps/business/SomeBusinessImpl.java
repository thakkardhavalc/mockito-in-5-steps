package com.in28minutes.mockito.mockitoin5steps.business;

/**
 * Created By dhhaval thakkar on 2024-01-24
 */
public class SomeBusinessImpl {

    private final DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }
}

interface DataService {
    int[] retrieveAllData();
}
