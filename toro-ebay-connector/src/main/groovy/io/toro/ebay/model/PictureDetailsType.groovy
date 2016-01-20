package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class PictureDetailsType {
	ExtendedPictureDetailsType ExtendedPictureDetails;
	List<URL> ExternalPictureURL;
	String GalleryDuration;
	String GalleryErrorInfo;
	GalleryStatusCodeType GalleryStatus;
	GalleryTypeCodeType GalleryType;
	URL GalleryURL;
	PhotoDisplayCodeType PhotoDisplay;
	PictureSourceCodeType PictureSource;
	List<URL> PictureURL;
}
