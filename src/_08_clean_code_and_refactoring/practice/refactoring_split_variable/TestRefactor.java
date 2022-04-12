package _08_clean_code_and_refactoring.practice.refactoring_split_variable;

public class TestRefactor {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }

}
