package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CalculatedShippingRateType {
	AmountType InternationalPackagingHandlingCosts;
	MeasurementSystemCodeType MeasurementUnit;
	String OriginatingPostalCode;
	MeasureType PackageDepth;
	MeasureType PackageLength;
	MeasureType PackageWidth;
	AmountType PackagingHandlingCosts;
	boolean ShippingIrregular;
	ShippingPackageCodeType ShippingPackage;
	MeasureType WeightMajor;
	MeasureType WeightMinor;
}
