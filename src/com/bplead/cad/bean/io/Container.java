package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.bplead.cad.bean.SimpleFolder;
import com.bplead.cad.bean.SimplePdmLinkProduct;

import priv.lee.cad.model.ClientTemporary;

public class Container implements ClientTemporary, Serializable {

    private static final long serialVersionUID = -7944261537208682106L;
    private SimplePdmLinkProduct container;
    private SimpleFolder folder;

    public Container() {
    }

    public Container(SimplePdmLinkProduct container, SimpleFolder folder) {
	this.container = container;
	this.folder = folder;
    }

    public SimplePdmLinkProduct getContainer() {
	return container;
    }

    public SimpleFolder getFolder() {
	return folder;
    }

    public void setContainer(SimplePdmLinkProduct container) {
	this.container = container;
    }

    public void setFolder(SimpleFolder folder) {
	this.folder = folder;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("Container [folder=").append (folder).append (", container=").append (container).append ("]");
	return builder.toString ();
    }

}
