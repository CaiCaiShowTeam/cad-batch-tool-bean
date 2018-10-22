/**
 * CadStatus.java
 * 2018年10月22日
 */
package com.bplead.cad.bean.io;

/**
 * @author zjw
 * 2018年10月22日下午1:18:50
 */
public enum CadStatus {
    
    NOT_EXIST("新建","notExist"),
    CHECK_OUT("检出","checkout"),
    CHECK_IN("检入","checkin");
    
    private String displayName;
    
    private String innerValue;
    
    private CadStatus (String displayName, String innerValue) {
	this.displayName = displayName;
	this.innerValue = innerValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInnerValue() {
        return innerValue;
    }

    public void setInnerValue(String innerValue) {
        this.innerValue = innerValue;
    }

    public static CadStatus toEnumeration (String innerValue) {
	CadStatus[] values = CadStatus.values ();
	for (CadStatus value : values) {
	    if (value.innerValue.equalsIgnoreCase (innerValue)) {
		return value;
	    }
	}
	return null;
    }
    
    public static String getInnerValueByDisplayName (String displayName) {
	CadStatus[] values = CadStatus.values ();
	for (CadStatus value : values) {
	    if (value.displayName.equalsIgnoreCase (displayName)) {
		return value.innerValue;
	    }
	}
	return null;
    }
    
    public static String getDisplayNameByInnerValue (String innerValue) {
	return toEnumeration (innerValue).displayName;
    }
}
