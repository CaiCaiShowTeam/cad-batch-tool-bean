package com.bplead.cad.bean.io;

import com.bplead.cad.bean.SimpleDocument;

public class Document extends SimpleDocument {

    private static final long serialVersionUID = 5722633359458375578L;

    /**
     * 是否驱动BOM结构,默认为驱动
     */
    private Boolean buildBom = true;
    /**
     * 构建关联关系类型,默认为7-所有者
     */
    private int buildType = 7;
    /**
     * 产品容器信息和文件夹信息
     */
    private Container container;
    /**
     * 解析XML得到的检入数据信息CadDocument
     */
    private AttachmentModel object;
    /**
     * 是否关联部件默认为关联
     */
    private Boolean relatedPart = true;

    public Document() {
    }

    public Document(String oid, String name, String number) {
	super (oid, name, number);
    }

    public Boolean getBuildBom() {
	return buildBom;
    }

    public int getBuildType() {
	return buildType;
    }

    public Container getContainer() {
	return container;
    }

    public AttachmentModel getObject() {
	return object;
    }

    public Boolean getRelatedPart() {
	return relatedPart;
    }

    public void setBuildBom(Boolean buildBom) {
	this.buildBom = buildBom;
    }

    public void setBuildType(int buildType) {
	this.buildType = buildType;
    }

    public void setContainer(Container container) {
	this.container = container;
    }

    public void setObject(AttachmentModel object) {
	this.object = object;
    }

    public void setRelatedPart(Boolean relatedPart) {
	this.relatedPart = relatedPart;
    }

}
