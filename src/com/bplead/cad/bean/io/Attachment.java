package com.bplead.cad.bean.io;

import java.io.File;
import java.io.Serializable;

import priv.lee.cad.util.ClientAssert;

public class Attachment implements Serializable {

	private static final long serialVersionUID = -3298431148287587866L;
	private String absolutePath;
	private String name;
	private boolean primary;
	
	public Attachment() {
		
	}

	public Attachment(File file, boolean primary) {
		ClientAssert.notNull(file, "File is required");

		this.name = file.getName();
		this.primary = primary;
		this.absolutePath = file.getAbsolutePath();
	}

	public Attachment(String name, boolean primary, String absolutePath) {
		ClientAssert.hasText(name, "Name is required");
		ClientAssert.hasText(absolutePath, "Absolute path is required");

		this.name = name;
		this.primary = primary;
		this.absolutePath = absolutePath;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public String getName() {
		return name;
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
}
