package firstproject;

public class calcdef implements calc {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public long mul(int a, int b) {
		// TODO Auto-generated method stub
		int z=3;
		return (long)a*b;
	}

	@Override
	public float div(float a, float b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}

}
