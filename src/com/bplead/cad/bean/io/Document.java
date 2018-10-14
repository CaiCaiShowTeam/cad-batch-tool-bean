package com.bplead.cad.bean.io;

import com.bplead.cad.bean.SimpleDocument;

public class Document extends SimpleDocument {

	private static final long serialVersionUID = 5722633359458375578L;
	private Container container;
	private AttachmentModel object;
	private String type;

	public Document() {

	}

	public Document(String oid, String name, String number) {
		super(oid, name, number);
	}

	public Container getContainer() {
		return container;
	}

	public AttachmentModel getObject() {
		return object;
	}

	public String getType() {
		return type;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public void setObject(AttachmentModel object) {
		this.object = object;
	}

	public void setType(String type) {
		this.type = type;
	}
}
