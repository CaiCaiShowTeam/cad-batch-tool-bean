package com.bplead.cad.bean;

import priv.lee.cad.model.ClientTemporary;

public class SimpleConatiner extends SimpleObject implements ClientTemporary {

	private static final long serialVersionUID = -5858399337433876138L;

	public SimpleConatiner() {

	}

	public SimpleConatiner(String oid, String name) {
		super(oid, name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimplePdmLinkProduct [name=");
		builder.append(getName());
		builder.append(", oid=");
		builder.append(getOid());
		builder.append(", selected=");
		builder.append(isSelected());
		builder.append("]");
		return builder.toString();
	}
}
