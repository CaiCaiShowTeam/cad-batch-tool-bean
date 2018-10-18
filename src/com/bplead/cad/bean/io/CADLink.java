package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CADLink implements Serializable {

    private static final long serialVersionUID = -1286347908512478516L;
    /**
     * 序号
     */
    @JacksonXmlProperty(localName = "order")
    private String order;
    /**
     * 图纸代号/外购件图号
     */
    @JacksonXmlProperty(localName = "number")
    private String number;
    /**
     * 图纸名称
     */
    @JacksonXmlProperty(localName = "name")
    private String name;
    /**
     * 数量
     */
    @JacksonXmlProperty(localName = "quantity")
    private String quantity;
    /**
     * 单位
     */
    @JacksonXmlProperty(localName = "unit")
    private String unit;
    /**
     * 总重
     */
    @JacksonXmlProperty(localName = "weight")
    private String weight;
    /**
     * 规格
     */
    @JacksonXmlProperty(localName = "model")
    private String model;
    /**
     * 关键件标识
     */
    @JacksonXmlProperty(localName = "keyIdentity")
    private String keyIdentity;
    /**
     * 规零件尺寸
     */
    @JacksonXmlProperty(localName = "partSize")
    private String partSize;
    /**
     * 机组型号
     */
    @JacksonXmlProperty(localName = "unitModel")
    private String unitModel;

    public CADLink() {
    }

    public String getOrder() {
	return order;
    }

    public void setOrder(String order) {
	this.order = order;
    }

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getQuantity() {
	return quantity;
    }

    public void setQuantity(String quantity) {
	this.quantity = quantity;
    }

    public String getUnit() {
	return unit;
    }

    public void setUnit(String unit) {
	this.unit = unit;
    }

    public String getWeight() {
	return weight;
    }

    public void setWeight(String weight) {
	this.weight = weight;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public String getKeyIdentity() {
	return keyIdentity;
    }

    public void setKeyIdentity(String keyIdentity) {
	this.keyIdentity = keyIdentity;
    }

    public String getPartSize() {
	return partSize;
    }

    public void setPartSize(String partSize) {
	this.partSize = partSize;
    }

    public String getUnitModel() {
	return unitModel;
    }

    public void setUnitModel(String unitModel) {
	this.unitModel = unitModel;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("CADLink [order=").append (order).append (", number=").append (number).append (", name=")
		.append (name).append (", quantity=").append (quantity).append (", unit=").append (unit)
		.append (", weight=").append (weight).append (", model=").append (model).append (", keyIdentity=")
		.append (keyIdentity).append (", partSize=").append (partSize).append (", unitModel=")
		.append (unitModel).append ("]");
	return builder.toString ();
    }


}
