package com.bplead.cad.bean.io;

import java.io.File;
import java.io.Serializable;

import priv.lee.cad.util.ClientAssert;

public class Attachment implements Serializable {

    private static final long serialVersionUID = -3298431148287587866L;
    private String absolutePath;
    private String name;
    private boolean primary;
    private String realName;

    public Attachment() {
    }

    public Attachment(File file, boolean primary) {
	ClientAssert.notNull (file,"File is required");

	this.name = file.getName ();
	this.primary = primary;
	this.absolutePath = file.getAbsolutePath ();
    }

    public Attachment(String name, String realName, boolean primary, String absolutePath) {
	ClientAssert.hasText (name,"Name is required");
	ClientAssert.hasText (absolutePath,"Absolute path is required");

	this.name = name;
	this.realName = realName;
	this.primary = primary;
	this.absolutePath = absolutePath;
    }

    public String getAbsolutePath() {
	return absolutePath;
    }

    public String getName() {
	return name;
    }

    public String getRealName() {
	return realName;
    }

    public boolean isPrimary() {
	return primary;
    }

    public void setAbsolutePath(String absolutePath) {
	this.absolutePath = absolutePath;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPrimary(boolean primary) {
	this.primary = primary;
    }

    public void setRealName(String realName) {
	this.realName = realName;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("Attachment [absolutePath=").append (absolutePath).append (", name=").append (name)
		.append (", realName=").append (realName).append (", primary=").append (primary).append ("]");
	return builder.toString ();
    }
}
