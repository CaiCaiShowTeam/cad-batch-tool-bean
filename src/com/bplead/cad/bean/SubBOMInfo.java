package com.bplead.cad.bean;

import java.io.Serializable;

public class SubBOMInfo implements Serializable {
	/**
	 * @author jiyideguiji
	 * subBom
	 */
	private static final long serialVersionUID = -8208270161857097159L;

	private String sn;
	private String number;
	private String name;
	private String quantity;
	private String materialModel;
	private String sigletonWeight;
	private String totalWeight;
	private String desciption;

	public String getDesciption() {
		return desciption;
	}

	public String getMaterialModel() {
		return materialModel;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getSigletonWeight() {
		return sigletonWeight;
	}

	public String getSn() {
		return sn;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public void setMaterialModel(String materialModel) {
		this.materialModel = materialModel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setSigletonWeight(String sigletonWeight) {
		this.sigletonWeight = sigletonWeight;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	@Override
	public String toString() {
		return "SubBOMInfo [sn=" + sn + ", number=" + number + ", name=" + name + ", quantity=" + quantity
				+ ", materialModel=" + materialModel + ", sigletonWeight=" + sigletonWeight + ", totalWeight="
				+ totalWeight + ", desciption=" + desciption + "]";
	}

}
