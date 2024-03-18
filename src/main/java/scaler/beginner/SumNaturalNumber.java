package scaler.beginner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        SumNaturalNumber sumNaturalNumber = new SumNaturalNumber();
        System.out.println(sumNaturalNumber.sumNaturalNumberUpto(23));
    }

    private int sumNaturalNumberUpto(int num){
        int sum = 0;
        for(int i = 1; i<= num; i++){
            sum+= i;
        }
        return sum;
    }
}
