package serpis;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1 = new int[]{5, 17, 15, 10, 3, 9};
		int m1 = menor(v1);
		System.out.println("m1=" + m1);
		
	}
	
	private static int menor(int[] v) {
		int m = v[0];
		for (int index = 1; index < v.length; index++)
			if (v[index] < m)
				m = v[index];
		return m;
	}

	private static int menorTris(int[] v) {
		int m = v[0];
		for (int item : v)
			if (item < m)
				m = item;
		return m;
	}

	private static int menorBis(int[] v) {
		int posicionMenor = 0;
		for (int index = 1; index < v.length; index++)
			if (v[index] < v[posicionMenor])
				posicionMenor = index;
		return v[posicionMenor];
	}
}
