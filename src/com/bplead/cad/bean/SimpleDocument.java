package com.bplead.cad.bean;

public class SimpleDocument extends SimpleObject {

    private static final long serialVersionUID = -5452305568516411601L;

    private Boolean editEnable;

    private String number;

    public SimpleDocument() {
    }

    public SimpleDocument(String oid, String name, String number) {
	super (oid, name);
	this.number = number;
    }

    public Boolean getEditEnable() {
	return editEnable;
    }

    public String getNumber() {
	return number;
    }

    public void setEditEnable(Boolean editEnable) {
	this.editEnable = editEnable;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("SimpleDocument [editEnable=").append (editEnable).append (", number=").append (number)
		.append ("]");
	return builder.toString ();
    }

}
