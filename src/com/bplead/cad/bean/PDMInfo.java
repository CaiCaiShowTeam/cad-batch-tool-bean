package com.bplead.cad.bean;

import java.io.Serializable;

public class PDMInfo implements Serializable {

	/**
	 * @author jiyideguiji
	 */
	private static final long serialVersionUID = -7804593830241269269L;

	private String name;
	private String modifyTime;
	private String modifier;

	public String getModifier() {
		return modifier;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public String getName() {
		return name;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PDMInfo [name=" + name + ", modifyTime=" + modifyTime + ", modifier=" + modifier + "]";
	}

}
