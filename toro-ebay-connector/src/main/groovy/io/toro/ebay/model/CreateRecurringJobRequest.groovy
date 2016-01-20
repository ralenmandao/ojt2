package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class CreateRecurringJobRequest {
	DailyRecurrence dailyRecurrence;
	DownloadJobRecurringFilter downloadJobRecurringFilter;
	String downloadJobType;
	int frequencyInMinutes;
	MonthlyRecurrence monthlyRecurrence;
	String UUID;
	WeeklyRecurrence weeklyRecurrence;
}
