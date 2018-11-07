package com.bplead.cad.bean.io;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CADLink implements Serializable {

    private static final long serialVersionUID = -1286347908512478516L;
    /**
     * 序号
     */
    @JacksonXmlProperty(localName = "sn")
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
     * 明细栏材料规格
     */
    @JacksonXmlProperty(localName = "materialModel")
    private String materialModel;
    /**
     * 单件重量
     */
    @JacksonXmlProperty(localName = "sigletonWeight")
    private String sigletonWeight;
    /**
     * 总重量
     */
    @JacksonXmlProperty(localName = "totalWeight")
    private String totalWeight;
    /**
     * 描述
     */
    @JacksonXmlProperty(localName = "desciption")
    private String desciption;

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

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getSigletonWeight() {
        return sigletonWeight;
    }

    public void setSigletonWeight(String sigletonWeight) {
        this.sigletonWeight = sigletonWeight;
    }

    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("CADLink [order=").append (order).append (", number=").append (number).append (", name=")
		.append (name).append (", quantity=").append (quantity).append (", materialModel=")
		.append (materialModel).append (", sigletonWeight=").append (sigletonWeight).append (", totalWeight=")
		.append (totalWeight).append (", desciption=").append (desciption).append ("]");
	return builder.toString ();
    }

}
