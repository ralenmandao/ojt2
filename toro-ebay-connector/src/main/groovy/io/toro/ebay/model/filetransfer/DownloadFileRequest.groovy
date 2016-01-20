package io.toro.ebay.model.filetransfer

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'DownloadFileRequest')
public class DownloadFileRequest {
	String fileReferenceId
	String taskReferenceId
}
