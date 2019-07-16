package com.bplead.cad.bean.io;

import java.util.ArrayList;
import java.util.List;

import com.bplead.cad.annotation.IbaField;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 2018年10月7日上午10:59:09 for xml cad.xml
 */
public class CadDocument implements DetailModel, AttachmentModel {

    private static final long serialVersionUID = -7830531959700927185L;

    /**
     * cad:图纸代号  plm:代号
     */
    @JacksonXmlProperty(localName = "number")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "CINDEX")
    private String number;
    /**
     * cad:图纸名称 plm:零部件名称
     */
    @JacksonXmlProperty(localName = "name")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "CNAME", panelAttr = true)
    private String name;
    /**
     * cad:零部件类型
     */
    @JacksonXmlProperty(localName = "type")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "SOURCE_MADE")
    private String source;
    /**
     * cad:原材料规格 plm:原材料规格
     */
    @JacksonXmlProperty(localName = "materialModel")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "RAW_MAT_SPEC", panelAttr = true)
    private String materialModel;
    /**
     * cad:外构件规格 plm:原材料规格
     */
    @JacksonXmlProperty(localName = "buyModel")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "RAW_MAT_SPEC", panelAttr = true)
    private String buyModel;
    /**
     * cad:原材料代码 plm:原材料物料编码
     */
    @JacksonXmlProperty(localName = "materialNum")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "MAT_CODE_YL", panelAttr = true)
    private String materialNum;
    /**
     * cad:外购件图号 plm:原材料物料编码
     */
    @JacksonXmlProperty(localName = "buyNum")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "DRAWING_NO", panelAttr = true)
    private String buyNum;
    /**
     * cad:零件尺寸 plm:source为自制件时，无该属性
     */
    @JacksonXmlProperty(localName = "partSize")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "PART_DIMENSION", panelAttr = true)
    private String partSize;
    /**
     * cad:机组型号
     */
    @JacksonXmlProperty(localName = "unitModel")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "UNIT_MODEL", panelAttr = true)
    private String unitModel;
    /**
     * cad:重量
     */
    @JacksonXmlProperty(localName = "weight")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "CMASS", panelAttr = true)
    private String weight;
    /**
     * cad:关键件标识
     */
    @JacksonXmlProperty(localName = "keyIdentity")
    @IbaField(target = "EPMDocument,WTPart", ibaName = "KEY_PART_ID", panelAttr = true)
    private String keyIdentity;
    /**
     * cad:比例
     */
    @JacksonXmlProperty(localName = "proportion")
    private String proportion;
    /**
     * cad:图幅
     */
    @IbaField(target = "EPMDocument,WTPart", ibaName = "SHEET")
    @JacksonXmlProperty(localName = "size")
    private String sheet;
    /**
     * cad:页码
     */
    @JacksonXmlProperty(localName = "pageIndex")
    private String pageIndex;
    /**
     * cad:总页码
     */
    @JacksonXmlProperty(localName = "pageSize")
    private String pageSize;
    /**
     * cad:附件列表
     */
    @JacksonXmlProperty(localName = "attatchment")
    private List<Attachment> attachments = new ArrayList<Attachment> ();
    /**
     * cad:cad bom details
     */
    @JacksonXmlProperty(localName = "Detail")
    private List<CADLink> detail = new ArrayList<CADLink> ();

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
    public List<CADLink> getDetail() {
	return detail;
    }

    public void setDetails(List<CADLink> detail) {
	this.detail = detail;
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

    public String getBuyModel() {
        return buyModel;
    }

    public void setBuyModel(String buyModel) {
        this.buyModel = buyModel;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    public String getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(String buyNum) {
        this.buyNum = buyNum;
    }

    public void setDetail(List<CADLink> detail) {
        this.detail = detail;
    }
    
}
