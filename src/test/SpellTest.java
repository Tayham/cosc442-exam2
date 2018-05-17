package test;

import org.junit.*;

import game.Effect;
import game.Spell;

import static org.junit.Assert.*;

/**
 * The class <code>SpellTest</code> contains tests for the class <code>{@link Spell}</code>.
 *
 * @generatedBy CodePro at 5/17/18 11:30 AM
 * @author Taylor
 * @version $Revision: 1.0 $
 */
public class SpellTest {
	/**
	 * Run the Spell(String,int,Effect) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	@Test
	public void testSpell_1()
		throws Exception {
		String name = "";
		int manaCost = 1;
		Effect effect = new Effect(1);

		Spell result = new Spell(name, manaCost, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(1, result.manaCost());
		assertEquals(true, result.requiresTarget());
	}

	/**
	 * Run the Effect effect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	@Test
	public void testEffect_1()
		throws Exception {
		Spell fixture = new Spell("", 1, new Effect(1));

		Effect result = fixture.effect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the int manaCost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	@Test
	public void testManaCost_1()
		throws Exception {
		Spell fixture = new Spell("", 1, new Effect(1));

		int result = fixture.manaCost();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Spell fixture = new Spell("", 1, new Effect(1));

		String result = fixture.name();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean requiresTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	@Test
	public void testRequiresTarget_1()
		throws Exception {
		Spell fixture = new Spell("", 1, new Effect(1));

		boolean result = fixture.requiresTarget();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 11:30 AM
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
	 * @generatedBy CodePro at 5/17/18 11:30 AM
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
	 * @generatedBy CodePro at 5/17/18 11:30 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpellTest.class);
	}
}