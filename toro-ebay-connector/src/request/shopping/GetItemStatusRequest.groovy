package io.toro.ebay.model.shopping

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetItemStatusRequest')
public class GetItemStatusRequest {
	List<String> ItemID
	String MessageID
}
