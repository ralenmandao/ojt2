package io.toro.ebay.model.bulkdataexchange

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.JobStatus
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'GetJobsRequest')
public class GetJobsRequest {
	String creationTimeFrom
	String creationTimeTo
	List<JobStatus> jobStatus
	List<String> jobType
}
