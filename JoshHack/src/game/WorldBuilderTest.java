package game;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldBuilderTest</code> contains tests for the class <code>{@link WorldBuilder}</code>.
 *
 * @generatedBy CodePro at 5/19/18 6:11 AM
 * @author richieawojoodu
 * @version $Revision: 1.0 $
 */
public class WorldBuilderTest {
	/**
	 * Run the WorldBuilder(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testWorldBuilder_1()
		throws Exception {
		int width = 1;
		int height = 1;
		int depth = 1;

		WorldBuilder result = new WorldBuilder(width, height, depth);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the World build() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testBuild_1()
		throws Exception {
		WorldBuilder fixture = new WorldBuilder(1, 1, 1);

		World result = fixture.build();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.width());
		assertEquals(1, result.depth());
		assertEquals(1, result.height());
	}

	/**
	 * Run the WorldBuilder connectRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testConnectRegions_1()
		throws Exception {
		WorldBuilder fixture = new WorldBuilder(1, 1, 1);

		WorldBuilder result = fixture.connectRegions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorldBuilder connectRegions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testConnectRegions_2()
		throws Exception {
		WorldBuilder fixture = new WorldBuilder(1, 1, 1);

		WorldBuilder result = fixture.connectRegions();

		// add additional test code here
		assertNotNull(result);
	}

	

	

	/**
	 * Run the List<Point> findRegionOverlaps(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testFindRegionOverlaps_7()
		throws Exception {
		WorldBuilder fixture = new WorldBuilder(0, 1, 1);
		int z = 1;
		int r1 = 1;
		int r2 = 1;

		List<Point> result = fixture.findRegionOverlaps(z, r1, r2);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the WorldBuilder makeCaves() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Test
	public void testMakeCaves_1()
		throws Exception {
		WorldBuilder fixture = new WorldBuilder(1, 1, 1);

		WorldBuilder result = fixture.makeCaves();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 6:11 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldBuilderTest.class);
	}
}