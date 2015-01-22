package test;

import junit.framework.TestCase;

import org.junit.Test;

import com.cn.tass.javacard.filemanager.FileManager;
import com.cn.tass.javacard.filemanager.impl.FileManagerImpl;
import com.cn.tass.javacard.safemanager.IEnCrypt;
import com.cn.tass.javacard.safemanager.impl.EnCryptImpl;
import com.cn.tass.javacard.utils.Converts;

public class Testcard extends TestCase {
	@Test
	public void testCreateMf() throws Exception {
		FileManager fm = new FileManagerImpl();
		fm.createCard();
	}
	public void testEnCryptImpl() throws Exception {
		IEnCrypt enc = new EnCryptImpl();
		byte b[] = enc.encryptMD5("1231231231231245643542132564561231ghjgjghjgj2312".getBytes());
		String result = Converts.byteArrayToHexString(b);
		Converts.hexStringToByteArray(result);
		System.out.println(result.getBytes()== b);
		
	}

}
