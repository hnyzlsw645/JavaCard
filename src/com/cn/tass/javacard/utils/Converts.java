package com.cn.tass.javacard.utils;

public final class Converts {
	//十进制---》十六进制字符串
	
	//十进制---》十六进制byte[]
	
	//字符----》byte[]
	
	//byte[]--->String
	public static String byteArrayToHexString(byte data[]){
		int i; 
		StringBuffer buf = new StringBuffer(""); 
		for (int offset = 0; offset < data.length; offset++) { 
		i = data[offset]; 
		System.out.print(i+"**");
		if(i<0) i+= 256; 
		if(i<16) 
		buf.append("0"); 
		System.out.print("++"+buf.toString()+"++");
		
		buf.append(Integer.toHexString(i));
		System.out.print(buf.toString()+"==");
		System.out.println();
		} 
		System.out.println("result: " + buf.toString());//32位的加密 

		System.out.println("result: " + buf.toString().substring(8,24));//16位的加密 
		return buf.toString();
	}
	//hexString---->byte[]
	public static byte[] hexStringToByteArray(String data){
		
		return null;
	}
	//byte-->hex
	public static String byteToHex(byte data){
		String result = null;
		byte temp = data;
		int bt1 = (temp>>4)& 0xf + 0x30;
		System.out.println((temp>>4)&0xf + 0x30);
		if(bt1 > 0x39) bt1 = bt1 - 10 - 0x30 + 0x41;
		System.out.println(bt1);
		int bt2 = (temp)& 0xf + 0x30;
		if(bt2 > 0x39) bt2 = bt2 - 10 - 0x30 + 0x41;
		System.out.println(bt2);
		System.out.println(temp&0xf);
		result = Integer.toHexString(bt1)+Integer.toHexString(bt2);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Converts.byteToHex((byte)'a'));
		
	}

}
