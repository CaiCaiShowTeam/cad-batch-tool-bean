package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.bplead.cad.bean.SimpleFolder;
import com.bplead.cad.bean.SimpleContainer;

import priv.lee.cad.model.ClientTemporary;

public class Container implements ClientTemporary, Serializable {

    private static final long serialVersionUID = -7944261537208682106L;
    private SimpleFolder folder;
    private SimpleContainer product;

    public Container() {

    }

    public Container(SimpleContainer product, SimpleFolder folder) {
	this.product = product;
	this.folder = folder;
    }

    public SimpleFolder getFolder() {
	return folder;
    }

    public SimpleContainer getProduct() {
	return product;
    }

    public void setFolder(SimpleFolder folder) {
	this.folder = folder;
    }

    public void setProduct(SimpleContainer product) {
	this.product = product;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("Container [folder=").append (folder).append (", product=").append (product).append ("]");
	return builder.toString ();
    }

}
