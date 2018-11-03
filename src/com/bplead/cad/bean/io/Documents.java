package com.bplead.cad.bean.io;

import java.io.Serializable;
import java.util.List;

public class Documents implements Serializable {

    private static final long serialVersionUID = -6809868832088848640L;
    
    private List<Integer> checkRows;
    
    private List<Document> documents;

    public List<Integer> getCheckRows() {
        return checkRows;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setCheckRows(List<Integer> checkRows) {
        this.checkRows = checkRows;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("Documents [documents=").append (documents).append ("]");
	return builder.toString ();
    }
    
}
