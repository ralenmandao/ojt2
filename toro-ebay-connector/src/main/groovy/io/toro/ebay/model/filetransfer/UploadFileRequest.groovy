package io.toro.ebay.model.filetransfer

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.FileAttachment
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'UploadFileRequest')
public class UploadFileRequest {
	FileAttachment fileAttachment
	String fileFormat
	String fileReferenceId
	String taskReferenceId
}
