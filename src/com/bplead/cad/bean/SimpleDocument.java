package com.bplead.cad.bean;

import com.bplead.cad.bean.io.CadStatus;

public class SimpleDocument extends SimpleObject {

    private static final long serialVersionUID = -5452305568516411601L;

    private CadStatus cadStatus = CadStatus.NOT_EXIST;

    private String number;
    private String version;
    private String modifyTime;
    private String creator;


    public SimpleDocument() {
    }

    public SimpleDocument(String oid, String name, String number) {
	super (oid, name);
	this.number = number;
    }

    public CadStatus getCadStatus() {
        return cadStatus;
    }

    public String getCreator() {
		return creator;
	}

    public String getModifyTime() {
		return modifyTime;
	}

    public String getNumber() {
	return number;
    }

    public String getVersion() {
		return version;
	}

	public void setCadStatus(CadStatus cadStatus) {
        this.cadStatus = cadStatus;
    }

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void setNumber(String number) {
	this.number = number;
    }

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SimpleDocument [cadStatus=" + cadStatus + ", number=" + number + ", version=" + version
				+ ", modifyTime=" + modifyTime + ", creator=" + creator + "]";
	}

}
