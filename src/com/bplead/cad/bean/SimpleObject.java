package com.bplead.cad.bean;

import java.io.Serializable;

public class SimpleObject implements Serializable {

	private static final long serialVersionUID = -1831133151236580050L;
	private String name;
	private String oid;
	private boolean selected = false;

	public SimpleObject() {

	}

	public SimpleObject(String oid, String name) {
		this.oid = oid;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getOid() {
		return oid;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleObject [name=");
		builder.append(name);
		builder.append(", oid=");
		builder.append(oid);
		builder.append(", selected=");
		builder.append(selected);
		builder.append("]");
		return builder.toString();
	}
}
