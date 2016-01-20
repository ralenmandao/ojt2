package io.toro.ebay.model.relateditems

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.BundleDetailEnum
import io.toro.ebay.model.BundleFilter
import io.toro.ebay.model.BundleStatusEnum
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'FindBundlesRequest')
public class FindBundlesRequest {
	BundleDetailEnum bundleDetailSelector
	List<BundleFilter> bundleFilter
	BundleStatusEnum findAllByStatus
}
