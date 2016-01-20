package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class JobProfile {
	Date completionTime;
	Date creationTime;
	int errorCount;
	String fileReferenceId;
	String inputFileReferenceId;
	String jobId;
	JobStatus jobStatus;
	String jobType;
	double percentComplete;
	Date startTime;
}
