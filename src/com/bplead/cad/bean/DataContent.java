package com.bplead.cad.bean;

import java.io.File;
import java.io.Serializable;

public class DataContent implements Serializable {

    private static final long serialVersionUID = 1744737660546992407L;
    private File clientFile;
    private File serverFile;
    private File shareDirectory;
    private boolean transfered;

    public DataContent(File clientFile, File serverFile, File shareDirectory, boolean transfered) {
	this.clientFile = clientFile;
	this.serverFile = serverFile;
	this.shareDirectory = shareDirectory;
	this.transfered = transfered;
    }

    public File getClientFile() {
	return clientFile;
    }

    public File getServerFile() {
	return serverFile;
    }

    public File getShareDirectory() {
	return shareDirectory;
    }

    public boolean isTransfered() {
	return transfered;
    }

    public void setClientFile(File clientFile) {
	this.clientFile = clientFile;
    }

    public void setServerFile(File serverFile) {
	this.serverFile = serverFile;
    }

    public void setShareDirectory(File shareDirectory) {
	this.shareDirectory = shareDirectory;
    }

    public void setTransfered(boolean transfered) {
	this.transfered = transfered;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder ();
	builder.append ("DataContent [clientFile=").append (clientFile).append (", serverFile=").append (serverFile)
		.append (", shareDirectory=").append (shareDirectory).append (", transfered=").append (transfered)
		.append ("]");
	return builder.toString ();
    }
}
