package com.cn.tass.javacard.filemanager.impl;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;

import com.cn.tass.javacard.exception.FileException;
import com.cn.tass.javacard.filemanager.FileManager;

public class FileManagerImpl implements FileManager {
	// declare document
	private Document doc;

	// init document
	private void init() {
		try {
			DocumentBuilderFactory docbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docb = docbf.newDocumentBuilder();
			this.doc = docb.newDocument();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	// create documentbuilder object
	public DocumentBuilder getDocumentBuilder() {
		DocumentBuilderFactory docbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder docb = null;
		try {
			docb = docbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return docb;
	}

	// create a file of xml
	public boolean createCard() {
		try {
			// init document
			this.init();
			// create DocumentFragment
			DocumentFragment docf = doc.createDocumentFragment();
			// create root Element
			Element root = doc.createElement("MF");
			// create xml file
			// root--->DocumentFragment
			docf.appendChild(root);
			// DocumentFragment---->Document
			doc.appendChild(docf);
			// create TransformerFactory
			TransformerFactory tff = TransformerFactory.newInstance();
			// create transformer
			Transformer tf = tff.newTransformer();
			// set xml style
			tf.setOutputProperty(OutputKeys.ENCODING, "gb2312");
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			// create DOMSource
			DOMSource ds = new DOMSource(doc);
			// create PrintWriter
			PrintWriter pw = new PrintWriter(new FileOutputStream("test.xml"));
			// create StreamResult
			StreamResult sr = new StreamResult(pw);
			// create xml file
			tf.transform(ds, sr);
			System.out.println("³É¹¦");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	//test method
	public static void main(String[] args) {
		new FileManagerImpl().createCard();

	}

	// delete a file of xml
	public boolean deleteCard() {
		try {

		} catch (Exception e) {
			throw new FileException("deleteCard() is error");
		}
		return false;
	}

}
