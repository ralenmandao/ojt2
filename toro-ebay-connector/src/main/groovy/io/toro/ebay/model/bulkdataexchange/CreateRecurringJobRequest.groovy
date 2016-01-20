package io.toro.ebay.model.bulkdataexchange

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

import io.toro.ebay.model.DailyRecurrence
import io.toro.ebay.model.DownloadJobRecurringFilter
import io.toro.ebay.model.MonthlyRecurrence
import io.toro.ebay.model.WeeklyRecurrence
@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement(name = 'CreateRecurringJobRequest')
public class CreateRecurringJobRequest {
	DailyRecurrence dailyRecurrence
	DownloadJobRecurringFilter downloadJobRecurringFilter
	String downloadJobType
	int frequencyInMinutes
	MonthlyRecurrence monthlyRecurrence
	String UUID
	WeeklyRecurrence weeklyRecurrence
}
