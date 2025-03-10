package repos;

public class Main2 {
	double calculate(double sal,double bonus) {
		return sal+bonus;

	}
public static void main(String[] args) {
	Main2 main2 = new Main2();
	System.out.println(main2.calculate(23200, 20));
}
}
