package serpis;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1 = new int[]{5, 17, 15, 10, 3, 9};
		int m1 = menor(v1);
		//System.out.println("m1=" + m1);
		
		int pos = posicionDe(v1, 33);
		System.out.println("pos=" + pos);
		
	}
	
	public static int posicionDe(int[] v, int x) {
		int count = v.length;
		int index = 0;
		while (index < count && v[index] != x)
			index++;
		return index == count ? -1 : index;
	}

	//devuelve el valor menor en el array (lanza excepción si no tiene ningún elemento) 
	public static int menor(int[] v) {
		int m = v[0];
		for (int index = 1; index < v.length; index++)
			if (v[index] < m)
				m = v[index];
		return m;
	}

}
