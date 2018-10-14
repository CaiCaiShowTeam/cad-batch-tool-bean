package com.bplead.cad.bean.io;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * @author zjw
 * 2018年10月7日上午10:59:09
 * for xml cad.xml
 */
public class CadDocument implements DetailModel, AttachmentModel {

    private static final long serialVersionUID = -7830531959700927185L;

    /**
     * cad:图纸代号/外购件图号 plm:
     */
    @JacksonXmlProperty(isAttribute = true, localName = "number")
    private String number;
    /**
     * cad:图纸名称
     */
    @JacksonXmlProperty(isAttribute = true, localName = "name")
    private String name;
    /**
     * cad:自制件/外购件
     */
    @JacksonXmlProperty(isAttribute = true, localName = "source")
    private String source;
    /**
     * cad:原材料规格/外构件规格 plm:Windchill原材料规格
     */
    @JacksonXmlProperty(localName = "materialModel")
    private String model;
    /**
     * cad:原材料代码/图纸代号 plm:Windchill原材料物料编码
     */
    @JacksonXmlProperty(localName = "materialNum")
    private String material;
    /**
     * cad:零件尺寸 plm:source为自制件时，无该属性
     */
    @JacksonXmlProperty(localName = "partSize")
    private String partSize;
    /**
     * cad:机组型号
     */
    @JacksonXmlProperty(localName = "unitModel")
    private String unitModel;
    /**
     * cad:重量
     */
    @JacksonXmlProperty(localName = "weight")
    private String weight;
    /**
     * cad:比例 plm:Windchill中无对应属性
     */
    @JacksonXmlProperty(localName = "proportion")
    private String proportion;
    /**
     * cad:图幅
     */
    @JacksonXmlProperty(localName = "size")
    private String sheet;
    /**
     * cad:页码 plm:Windchill中无对应属性
     */
    @JacksonXmlProperty(localName = "pageIndex")
    private String pageIndex;
    /**
     * cad:总页码 plm:Windchill中无对应属性
     */
    @JacksonXmlProperty(localName = "pageSize")
    private String pageSize;
    /**
     * cad:关键件标识
     */
    @JacksonXmlProperty(localName = "keyIdentity")
    private String keyIdentity;
    /**
     * cad:零部件类型 plm:source为外购件时，无该属性
     */
    @JacksonXmlProperty(localName = "partType")
    private String partType;
    /**
     * cad:附件列表
     */
    @JacksonXmlProperty(localName = "attachment")
    private List<Attachment> attachments = new ArrayList<Attachment> ();
    /**
     * cad:cad bom details
     */
    @JacksonXmlProperty(localName = "detail")
    private List<CADLink> details = new ArrayList<CADLink> ();

    /*
     * (non-Javadoc)
     * 
     * @see com.bplead.cad.bean.io.AttachmentModel#getAttachments()
     */
    @Override
    public List<Attachment> getAttachments() {
	return attachments;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.bplead.cad.bean.io.AttachmentModel#setAttachments(java.util.List)
     */
    @Override
    public void setAttachments(List<Attachment> attachments) {
	this.attachments = attachments;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bplead.cad.bean.io.DetailModel#getDetail()
     */
    @Override
    public List<? extends Serializable> getDetail() {
	return details;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyIdentity() {
        return keyIdentity;
    }

    public void setKeyIdentity(String keyIdentity) {
        this.keyIdentity = keyIdentity;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public List<CADLink> getDetails() {
        return details;
    }

    public void setDetails(List<CADLink> details) {
        this.details = details;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("CadDocument [number=").append (number).append (", name=").append (name).append (", source=")
		.append (source).append (", model=").append (model).append (", material=").append (material)
		.append (", partSize=").append (partSize).append (", unitModel=").append (unitModel)
		.append (", weight=").append (weight).append (", proportion=").append (proportion).append (", sheet=")
		.append (sheet).append (", pageIndex=").append (pageIndex).append (", pageSize=").append (pageSize)
		.append (", keyIdentity=").append (keyIdentity).append (", partType=").append (partType)
		.append (", attachments=").append (attachments).append (", details=").append (details).append ("]");
	return builder.toString ();
    }

    
    
    
}
