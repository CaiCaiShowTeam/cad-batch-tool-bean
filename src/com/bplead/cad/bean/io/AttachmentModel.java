package com.bplead.cad.bean.io;

import java.io.Serializable;
import java.util.List;

public interface AttachmentModel extends Serializable {

	public List<Attachment> getAttachments();

	public void setAttachments(List<Attachment> attachments);

}
