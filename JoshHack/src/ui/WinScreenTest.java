package ui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.*;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import static org.junit.Assert.*;

/**
 * The class <code>WinScreenTest</code> contains tests for the class <code>{@link WinScreen}</code>.
 *
 * @generatedBy CodePro at 5/19/18 6:08 AM
 * @author richieawojoodu
 * @version $Revision: 1.0 $
 */
public class WinScreenTest {
	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:08 AM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		WinScreen fixture = new WinScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(TempFileHelper.java:143)
		//       at java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
		//       at java.nio.file.Files.createTempFile(Files.java:897)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(FileCacheImageInputStream.java:102)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(InputStreamImageInputStreamSpi.java:69)
		//       at javax.imageio.ImageIO.createImageInputStream(ImageIO.java:357)
		//       at javax.imageio.ImageIO.read(ImageIO.java:1397)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:08 AM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		WinScreen fixture = new WinScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(TempFileHelper.java:143)
		//       at java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
		//       at java.nio.file.Files.createTempFile(Files.java:897)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(FileCacheImageInputStream.java:102)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(InputStreamImageInputStreamSpi.java:69)
		//       at javax.imageio.ImageIO.createImageInputStream(ImageIO.java:357)
		//       at javax.imageio.ImageIO.read(ImageIO.java:1397)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 6:08 AM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		WinScreen fixture = new WinScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(TempFileHelper.java:143)
		//       at java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
		//       at java.nio.file.Files.createTempFile(Files.java:897)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(FileCacheImageInputStream.java:102)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(InputStreamImageInputStreamSpi.java:69)
		//       at javax.imageio.ImageIO.createImageInputStream(ImageIO.java:357)
		//       at javax.imageio.ImageIO.read(ImageIO.java:1397)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 6:08 AM
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
	 * @generatedBy CodePro at 5/19/18 6:08 AM
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
	 * @generatedBy CodePro at 5/19/18 6:08 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WinScreenTest.class);
	}
}