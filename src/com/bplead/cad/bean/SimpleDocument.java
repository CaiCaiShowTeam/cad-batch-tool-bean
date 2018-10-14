package com.bplead.cad.bean;

public class SimpleDocument extends SimpleObject {

	private static final long serialVersionUID = -5452305568516411601L;
	private String number;

	public SimpleDocument() {

	}

	public SimpleDocument(String oid, String name, String number) {
		super(oid, name);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}
}
