package com.cn.tass.javacard.safemanager.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.cn.tass.javacard.utils.*;
import com.cn.tass.javacard.safemanager.IEnCrypt;

public class EnCryptImpl implements IEnCrypt{

	//MD5
	public byte[] encryptMD5(byte[] data) {
		try {
			MessageDigest md = MessageDigest.getInstance(Constant.KEY_MD5);
			md.update(data);
			return md.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	//SHA
	public byte[] encryptSHA(byte[] data) {
		
		return null;
	}

}
