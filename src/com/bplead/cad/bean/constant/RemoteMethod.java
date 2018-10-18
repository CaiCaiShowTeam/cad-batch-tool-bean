package com.bplead.cad.bean.constant;

import priv.lee.cad.constant.RMIMethod;

public class RemoteMethod extends RMIMethod {
    
    	public static final String INIT_DATA = "initialize";

	public static final String CHECKIN = "checkin";

	public static final String CHECKOUT_DOWNLOAD = "checkoutAndDownload";

	public static final String GET_SIMPLE_FOLDERS = "getSimpleFolders";
	
	public static final String GET_SIMPLE_CONTAINERS = "getSimpleContainers";
	
	public static final String CLEAR_DETAILS = "clearDetails";
	
	public static final String EXPORT_DETAILS = "exportDetails";
	
	public static final String CHECKOUT = "checkout";
	
	public static final String UNDO_CHECKOUT = "undoCheckout";
	
	public static final String CLEAR_DETAIL_LISTENNER = "clearDetailListenner";
	
	public static final String EXPORT_DETAIL_LISTENNER = "exportDetailListenner";
	
	public static final String CANCLE_CHECKOUT_LISTENNER = "cancleCheckoutListenner";
	
	public static final String CHECKOUT_DOWNLOAD_LISTENNER = "checkoutAndDownloadListener";
	
}
