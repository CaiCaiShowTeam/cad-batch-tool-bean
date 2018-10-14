package com.bplead.cad.bean;

import priv.lee.cad.model.ClientTemporary;

public class SimpleContainer extends SimpleObject implements ClientTemporary {

    private static final long serialVersionUID = -5858399337433876138L;

    public SimpleContainer() {
    }

    public SimpleContainer(String oid, String name) {
	super (oid, name);
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("SimpleContainer [getName()=").append (getName ()).append (", getOid()=").append (getOid ())
		.append (", isSelected()=").append (isSelected ()).append ("]");
	return builder.toString ();
    }

}
