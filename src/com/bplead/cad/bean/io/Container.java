package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.bplead.cad.bean.SimpleFolder;
import com.bplead.cad.bean.SimplePdmLinkProduct;

import priv.lee.cad.model.ClientTemporary;

public class Container implements ClientTemporary, Serializable {

    private static final long serialVersionUID = -7944261537208682106L;
    private SimplePdmLinkProduct product;
    private SimpleFolder folder;

    public Container() {
    }

    public Container(SimplePdmLinkProduct product, SimpleFolder folder) {
	this.product = product;
	this.folder = folder;
    }

    public SimplePdmLinkProduct getProduct() {
	return product;
    }

    public SimpleFolder getFolder() {
	return folder;
    }

    public void setProduct(SimplePdmLinkProduct product) {
	this.product = product;
    }

    public void setFolder(SimpleFolder folder) {
	this.folder = folder;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("Container [folder=").append (folder).append (", container=").append (product).append ("]");
	return builder.toString ();
    }

}
