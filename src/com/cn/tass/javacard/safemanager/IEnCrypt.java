package com.cn.tass.javacard.safemanager;

public interface IEnCrypt {
	//Des  Encrypt
	
	//3Des Encrypt
	
	//Mac
	
	//奇偶校验
	
	//过程密钥
	
	//分散
	
	//MD5算法
	public byte[] encryptMD5(byte[] data);
	//SHA算法
	public byte[] encryptSHA(byte[] data);

}
