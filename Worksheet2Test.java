import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Jacob Smith
 * Tests for Worksheet2 exercises
 */

public class Worksheet2Test {

	@Test
	public void test1() { // test all positive tree values for negateAll

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		Tree n = new Tree(-6,
		new Tree(-4, new Tree(-2, new Tree(-1), new Tree()), new Tree(-5)), new Tree(-8, new Tree(-7), new Tree(-9)));
		Tree output = Worksheet2.negateAll(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test2() { // test various tree values for negateAll

		Tree t = new Tree(6,
		new Tree(4, new Tree(-2), new Tree(5)), new Tree(8, new Tree(-7), new Tree(9)));
		
		Tree n = new Tree(-6,
		new Tree(-4, new Tree(2), new Tree(-5)), new Tree(-8, new Tree(7), new Tree(-9)));

		Tree output = Worksheet2.negateAll(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test3() { // tests an empty tree for negateAll

		Tree t = new Tree();
		
		Tree n = new Tree();

		Tree output = Worksheet2.negateAll(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test4() { // test all positive tree values for mirror

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		Tree n = new Tree(6,
		new Tree(8, new Tree(9), new Tree(7)), new Tree(4, new Tree (5), new Tree(2, new Tree(), new Tree(1))));
		Tree output = Worksheet2.mirror(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test5() { // test various tree values including negatives for mirror

		Tree t = new Tree(6,
		new Tree(-4, new Tree(2), new Tree(-5)), new Tree(-8, new Tree(7), new Tree(-9)));
		
		Tree n = new Tree(6,
		new Tree(-8, new Tree(-9), new Tree(7)), new Tree(-4, new Tree(-5), new Tree(2)));

		Tree output = Worksheet2.mirror(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test6() { // tests empty tree for mirror

		Tree t = new Tree();
		
		Tree n = new Tree();

		Tree output = Worksheet2.mirror(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test7() { // test all positive tree values for postorder

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		List n = List.empty();
		n = List.cons(6, n);
		n = List.cons(8, n);
		n = List.cons(9, n);
		n = List.cons(7, n);
		n = List.cons(4, n);
		n = List.cons(5, n);
		n = List.cons(2, n);
		n = List.cons(1, n);
		List output = Worksheet2.postorder(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test8() { // test various tree values for postorder

		Tree t = new Tree(6,
		new Tree(4, new Tree(2), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		List n = List.empty();
		n = List.cons(6, n);
		n = List.cons(8, n);
		n = List.cons(9, n);
		n = List.cons(7, n);
		n = List.cons(4, n);
		n = List.cons(5, n);
		n = List.cons(2, n);
		List output = Worksheet2.postorder(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test9() { // tests empty tree for postorder

		Tree t = new Tree();
		
		List n = List.empty();

		List output = Worksheet2.postorder(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test10() { // test all positive tree values for allPositive

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		boolean output = Worksheet2.allPositive(t);
		
		assertEquals(output, true);
	}
	
	@Test
	public void test11() { // test various tree values including negatives for allPositive

		Tree t = new Tree(6,
		new Tree(-4, new Tree(2), new Tree(-5)), new Tree(-8, new Tree(7), new Tree(-9)));

		boolean output = Worksheet2.allPositive(t);
		
		assertEquals(output, false);
	}
	
	@Test
	public void test12() { // tests empty tree for allPositive

		Tree t = new Tree();
		
		boolean output = Worksheet2.allPositive(t);
		
		assertEquals(output, true);
	}
	
	@Test
	public void test13() { // test all positive tree values for isSearchTree

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		boolean output = Worksheet2.isSearchTree(t);
		
		assertEquals(output, true);
	}
	
	@Test
	public void test14() { // test various tree values including negatives for isSearchTree

		Tree t = new Tree(6,
		new Tree(-4, new Tree(2), new Tree(-5)), new Tree(-8, new Tree(7), new Tree(-9)));

		boolean output = Worksheet2.isSearchTree(t);
		
		assertEquals(output, false);
	}
	
	@Test
	public void test15() { // tests empty tree for isSearchTree

		Tree t = new Tree();
		
		boolean output = Worksheet2.isSearchTree(t);
		
		assertEquals(output, true);
	}
	
	@Test
	public void test16() { // test all positive tree values for printDescending

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
	
		Worksheet2.printDescending(t);
	}
	
	@Test
	public void test17() { // test various tree values for printDescending

		Tree t = new Tree(6,
		new Tree(4, new Tree(2), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		Worksheet2.printDescending(t);
		
	}
	
	@Test
	public void test18() { // tests empty tree for printDescending

		Tree t = new Tree();

		Worksheet2.printDescending(t);
	}

	@Test
	public void test19() { // test all positive tree values for max

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		int n = 9;
		int output = Worksheet2.max(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test20() { // test various tree values for max

		Tree t = new Tree(6,
		new Tree(4, new Tree(-2), new Tree(5)), new Tree(8, new Tree(-7), new Tree(19)));
		
		int n = 19;

		int output = Worksheet2.max(t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test21() { // tests an empty tree for max

		Tree t = new Tree();
		
		int n = 0;

		int output = Worksheet2.max(t);
		
		assertEquals(output, n);
	}

	@Test
	public void test22() { // test all positive tree values for delete

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		Tree n = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree()), new Tree(8, new Tree(7), new Tree(9)));
		
		Tree output = Worksheet2.delete(5,t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test23() { // test various tree values for delete

		Tree t = new Tree(6,
		new Tree(4, new Tree(-2), new Tree(5)), new Tree(8, new Tree(-7), new Tree(19)));
		
		Tree n = new Tree(6,
		new Tree(4, new Tree(-2), new Tree(5)), new Tree(8, new Tree(-7), new Tree()));

		Tree output = Worksheet2.delete(19,t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test24() { // tests an empty tree for delete

		Tree t = new Tree();
		
		Tree n = new Tree();

		Tree output = Worksheet2.delete(0,t);
		
		assertEquals(output, n);
	}
	
	@Test
	public void test25() { // test all positive tree values for isHeightBalanced

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8, new Tree(7), new Tree(9)));
		
		boolean output = Worksheet2.isHeightBalanced(t);
		
		assertEquals(output, true);
	}
	
	@Test
	public void test26() { // test various tree values for isHeightBalanced

		Tree t = new Tree(6,
		new Tree(4, new Tree(2, new Tree(1), new Tree()), new Tree(5)), new Tree(8));

		boolean output = Worksheet2.isHeightBalanced(t);
		
		assertEquals(output, false);
	}
	
	@Test
	public void test27() { // tests empty tree for isHeightBalanced

		Tree t = new Tree();
		
		boolean output = Worksheet2.isHeightBalanced(t);
		
		assertEquals(output, true);
	}
}