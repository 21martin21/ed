package serpis;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;


public class ArrayTest {

	@Test
	public void posicionDe() {
		int[] v1 = new int[]{5, 17, 15, 10, 3, 9};
		
		int pos;
		
		pos = Array.posicionDe(v1, 33);
		Assert.assertEquals(-1, pos);
		
		pos = Array.posicionDe(v1, 5);
		Assert.assertEquals(0, pos);
		
		pos = Array.posicionDe(v1, 9);
		Assert.assertEquals(5, pos);
		
		int[] v2 = new int[]{};
		pos = Array.posicionDe(v1, 77);
		Assert.assertEquals(-1, pos);
		
	}
	
	@Test
	public void menor() {
		int[] v1 = new int[]{5, 17, 15, 10, 3, 9};
		int m1 = Array.menor(v1);
		Assert.assertEquals(3, m1);
		
		Assert.assertEquals(4, Array.menor( new int[]{4, 6, 5} ));
		Assert.assertEquals(7, Array.menor( new int[]{8, 9, 7} ));
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void menorVacio() {
		int[] vacio = new int[]{};
		Array.menor(vacio);
	}

}
