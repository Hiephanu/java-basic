package org.example.enumsAndFinal;

public class EnumTest {
        public static void main(String[] args) {
            Day monday = Day.MON;
            Day wednesday = Day.WED;
            Day friday = Day.FRI;

            System.out.println("MON: " + monday.getDisplayName() + ", Numeric value: " + monday.getNumericValue());
            System.out.println("WED: " + wednesday.getDisplayName() + ", Numeric value: " + wednesday.getNumericValue());
            System.out.println("FRI: " + friday.getDisplayName() + ", Numeric value: " + friday.getNumericValue());
        }
}
