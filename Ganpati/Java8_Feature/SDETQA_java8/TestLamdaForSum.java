package SDETQA_java8;

public class TestLamdaForSum {


	public static void main(String[] args) {

		SumCalculator sumCal = (x,y)->x+y;


		int result= sumCal.sum(5, 9);

		System.out.println(result);

	}



}
