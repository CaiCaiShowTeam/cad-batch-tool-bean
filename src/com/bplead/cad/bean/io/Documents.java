package com.bplead.cad.bean.io;

import java.io.Serializable;
import java.util.List;

public class Documents implements Serializable {

    private static final long serialVersionUID = -6809868832088848640L;
    
    private List<Document> documents;

    public List<Document> getDocuments() {
        return documents;
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
