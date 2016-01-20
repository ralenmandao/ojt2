package io.toro.ebay.model.filetransfer

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.FileAttachment
import io.toro.ebay.model.AckValue
import io.toro.ebay.model.ErrorMessage
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'DownloadFileResponse')
public class DownloadFileResponse {
	FileAttachment fileAttachment
	AckValue ack
	ErrorMessage errorMessage
	String timestamp
	String version
}
