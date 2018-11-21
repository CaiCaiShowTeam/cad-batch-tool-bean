package com.bplead.cad.bean;

import priv.lee.cad.model.ClientTemporary;

public class SimplePdmLinkProduct extends SimpleObject implements ClientTemporary {

    private static final long serialVersionUID = -5858399337433876138L;
	private String modifyTime;
	private String modifier;

    public SimplePdmLinkProduct() {
    }

    public SimplePdmLinkProduct(String oid, String name) {
	super (oid, name);
    }

    public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	@Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("SimpleContainer [getName()=").append (getName ()).append (", getOid()=").append (getOid ())
		.append (", isSelected()=").append (isSelected ()).append ("]");
	return builder.toString ();
    }

}
