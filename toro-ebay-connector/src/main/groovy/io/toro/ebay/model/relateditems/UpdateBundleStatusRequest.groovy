package io.toro.ebay.model.relateditems

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.BundleStatusMap
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'UpdateBundleStatusRequest')
public class UpdateBundleStatusRequest {
	List<BundleStatusMap> bundleStatusMap
}
