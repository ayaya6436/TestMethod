package tab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class TabAlgos {
	public static double moyenne(final int[] tab) {
		
		int somme=0;
		for(int i=0;i<tab.length;i++) {
			somme+=tab[i];
		}
		
		return somme/tab.length;
		
	}
	
	
	public static int plusGrand(final int[] tab) {
		int max = 0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>max) {
				max = tab[i];
			}
		}
		
		return max;
		
	}
	
	
	public static boolean egaux(final int[] tab1 , final int[] tab2) {
		if(tab1.length!=tab2.length) {
			return false;
		}
		for(int i=0;i<tab1.length;i++) {
			for(int j=0;j<tab2.length;j++) {
				if(tab1[i]!=tab2[j]) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	
	@Test 
	public void testMoyenne() {
       int[] tab = {4, 6};
        assertEquals(5.0, moyenne(tab), 0.001);
   }

	
	@Test 
	public void plusGrand() {
		int [] tab = {58,8,90,100,11};
		assertEquals(100,plusGrand(tab));
	}
	
	
	@Test 
	public void TestEgaux() {
		int [] tab1 = {58,8,90,100,11};
		int [] tab2 = {58,8,90,100,11};
		assertEquals(false,egaux(tab1,tab2));
	}
	
	
//	public static void main(String[] args) {
//		
//		System.out.println(egaux(tab1,tab2));
//		
//	}
//	
	
	

	
}



