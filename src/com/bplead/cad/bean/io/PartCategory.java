/**
 * CadStatus.java
 * 2018年10月22日
 */
package com.bplead.cad.bean.io;

/**
 * 2018年10月22日下午1:18:50
 */
public enum PartCategory {
    
    BUY("外购","buy"),
    MAKE("自制","make");
    
    private String displayName;
    
    private String innerValue;
    
    private PartCategory (String displayName, String innerValue) {
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

    public static PartCategory toEnumeration (String innerValue) {
	PartCategory[] values = PartCategory.values ();
	for (PartCategory value : values) {
	    if (value.innerValue.equalsIgnoreCase (innerValue)) {
		return value;
	    }
	}
	return null;
    }
    
    public static String getInnerValueByDisplayName (String displayName) {
	PartCategory[] values = PartCategory.values ();
	for (PartCategory value : values) {
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
