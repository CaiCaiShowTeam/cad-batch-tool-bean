package com.bplead.cad.bean;

import java.io.Serializable;
import java.util.Vector;

public class BOMInfo implements Serializable {

	/**
	 * @author jiyideguiji
	 */
	private static final long serialVersionUID = 6184419556680062339L;

	private String number;
	private String name;
	private String type;
	private String materialModel;
	private String materialNum;
	private String partSize;
	private String unitModel;
	private String weight;
	private String proportion;
	private String size;
	private String pageIndex;
	private String pageSize;
	private String keyIdentity;
	private Vector<SubBOMInfo> subParts;

	public String getKeyIdentity() {
		return keyIdentity;
	}

	public String getMaterialModel() {
		return materialModel;
	}

	public String getMaterialNum() {
		return materialNum;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getPageIndex() {
		return pageIndex;
	}

	public String getPageSize() {
		return pageSize;
	}

	public String getPartSize() {
		return partSize;
	}

	public String getProportion() {
		return proportion;
	}

	public String getSize() {
		return size;
	}

	public Vector<SubBOMInfo> getSubParts() {
		return subParts;
	}

	public String getType() {
		return type;
	}

	public String getUnitModel() {
		return unitModel;
	}

	public String getWeight() {
		return weight;
	}

	public void setKeyIdentity(String keyIdentity) {
		this.keyIdentity = keyIdentity;
	}

	public void setMaterialModel(String materialModel) {
		this.materialModel = materialModel;
	}

	public void setMaterialNum(String materialNum) {
		this.materialNum = materialNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public void setPartSize(String partSize) {
		this.partSize = partSize;
	}

	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setSubParts(Vector<SubBOMInfo> subParts) {
		this.subParts = subParts;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUnitModel(String unitModel) {
		this.unitModel = unitModel;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BOMInfo [number=" + number + ", name=" + name + ", type=" + type + ", materialModel=" + materialModel
				+ ", materialNum=" + materialNum + ", partSize=" + partSize + ", unitModel=" + unitModel + ", weight="
				+ weight + ", proportion=" + proportion + ", size=" + size + ", pageIndex=" + pageIndex + ", pageSize="
				+ pageSize + ", keyIdentity=" + keyIdentity + ", subParts=" + subParts + "]";
	}

}
