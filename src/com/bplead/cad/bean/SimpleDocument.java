package com.bplead.cad.bean;

import com.bplead.cad.bean.io.CadStatus;

public class SimpleDocument extends SimpleObject {

    private static final long serialVersionUID = -5452305568516411601L;

    private CadStatus cadStatus = CadStatus.NOT_EXIST;

    private String number;

    public SimpleDocument() {
    }

    public SimpleDocument(String oid, String name, String number) {
	super (oid, name);
	this.number = number;
    }

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public CadStatus getCadStatus() {
        return cadStatus;
    }

    public void setCadStatus(CadStatus cadStatus) {
        this.cadStatus = cadStatus;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("SimpleDocument [cadStatus=").append (cadStatus).append (", number=").append (number)
		.append (", getName()=").append (getName ()).append (", getOid()=").append (getOid ())
		.append (", isSelected()=").append (isSelected ()).append (", hashCode()=").append (hashCode ())
		.append ("]");
	return builder.toString ();
    }
}
