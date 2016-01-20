package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class DSRSummary {
	double DSRAverage;
	String DSRType;
	int rating1Count;
	int rating2Count;
	int rating3Count;
	int rating4Count;
	int rating5Count;
	int totalRatingCount;
}
