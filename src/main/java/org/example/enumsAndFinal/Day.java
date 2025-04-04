package org.example.enumsAndFinal;

public enum Day {
    MON("Monday", 2),
    WED("Wednesday", 4),
    FRI("Friday", 6);

    private final String displayName;
    private final int numericValue;

    Day(String displayName, int numericValue) {
        this.displayName = displayName;
        this.numericValue = numericValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getNumericValue() {
        return numericValue;
    }
}


