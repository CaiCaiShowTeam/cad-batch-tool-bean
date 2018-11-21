package com.bplead.cad.bean;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import priv.lee.cad.model.ClientTemporary;

public class SimpleFolder extends SimpleObject implements ClientTemporary {

    private static final long serialVersionUID = 2731584492526156589L;
    @JacksonXmlElementWrapper(localName = "children")
    @JacksonXmlProperty(localName = "child")
    private List<SimpleFolder> children;
    private String folderPath;

    public SimpleFolder() {
    }

    public SimpleFolder(String oid, String name) {
	super (oid, name);
    }

    public List<SimpleFolder> getChildren() {
	return children;
    }

    public void setChildren(List<SimpleFolder> children) {
	this.children = children;
    }
    

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("SimpleFolder [children=").append (children).append (", folderPath=").append (folderPath)
		.append (", getChildren()=").append (getChildren ()).append (", getFolderPath()=")
		.append (getFolderPath ()).append (", getName()=").append (getName ()).append (", getOid()=")
		.append (getOid ()).append (", isSelected()=").append (isSelected ()).append (", toString()=")
		.append (super.toString ()).append (", getClass()=").append (getClass ()).append (", hashCode()=")
		.append (hashCode ()).append ("]");
	return builder.toString ();
    }
}
