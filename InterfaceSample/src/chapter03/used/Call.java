package chapter03.used;

public class Call {
    public static void main(String[] args){
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10,5);
        System.out.println("계산결과는 ("+result+") 입니다.");

    }
}
