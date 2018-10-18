package com.bplead.cad.bean.io;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import priv.lee.cad.util.XmlUtils;

/**
 * @author zjw
 * 2018年10月7日上午10:59:09
 * for xml cad.xml
 */
@JacksonXmlRootElement(localName = "cad")
public class CadDocuments implements Serializable {

    private static final long serialVersionUID = -2529832353034651499L;

    public static CadDocuments newInstance(File file) {
	return XmlUtils.read (file,CadDocuments.class);
    }

    /**
     * cad文档信息
     */
    @JacksonXmlProperty(localName = "simpleDoc")
    private List<CadDocument> cadDocs;

    public List<CadDocument> getCadDocs() {
        return cadDocs;
    }

    public void setCadDocs(List<CadDocument> cadDocs) {
        this.cadDocs = cadDocs;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("CadDocuments [cadDocs=").append (cadDocs).append ("]");
	return builder.toString ();
    }

}
