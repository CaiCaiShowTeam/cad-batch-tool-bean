package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.bplead.cad.bean.SimpleFolder;
import com.bplead.cad.bean.SimpleContainer;

import priv.lee.cad.model.ClientTemporary;

public class Container implements ClientTemporary, Serializable {

    private static final long serialVersionUID = -7944261537208682106L;
    private SimpleContainer container;
    private SimpleFolder folder;

    public Container() {
    }

    public Container(SimpleContainer container, SimpleFolder folder) {
	this.container = container;
	this.folder = folder;
    }

    public SimpleContainer getContainer() {
	return container;
    }

    public SimpleFolder getFolder() {
	return folder;
    }

    public void setContainer(SimpleContainer container) {
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
