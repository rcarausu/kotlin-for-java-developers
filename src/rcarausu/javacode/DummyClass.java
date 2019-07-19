package rcarausu.javacode;

public class DummyClass {

    private String text;

    public String getText() {
        return text;
    }

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation!" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }

}
