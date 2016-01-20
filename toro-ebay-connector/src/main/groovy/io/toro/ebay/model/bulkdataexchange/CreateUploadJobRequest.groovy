package io.toro.ebay.model.bulkdataexchange

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.FileType
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateUploadJobRequest')
public class CreateUploadJobRequest {
	FileType fileType
	String uploadJobType
	String UUID
}
