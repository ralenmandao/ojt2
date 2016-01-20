package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class SellingManagerProductDetailsType {
	String CustomLabel;
	long FolderID;
	String Note;
	long ProductID;
	String ProductName;
	int QuantityAvailable;
	boolean RestockAlert;
	int RestockThreshold;
	AmountType UnitCost;
	SellingManagerVendorDetailsType VendorInfo;
}
