package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class GetJobsRequest {
	Date creationTimeFrom;
	Date creationTimeTo;
	List<JobStatus> jobStatus;
	List<String> jobType;
}
