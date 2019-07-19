package rcarausu._06_builtin_datatypes;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation!" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }

}
