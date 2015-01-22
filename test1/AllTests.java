import com.cn.tass.javacard.safemanager.IEnCrypt;
import com.cn.tass.javacard.safemanager.impl.EnCryptImpl;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		IEnCrypt enc = new EnCryptImpl();
		enc.encryptMD5(new byte[]{'a','b','c','d'});
		//$JUnit-END$
		return suite;
	}

}
