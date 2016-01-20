package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class FeedbackHistoryType {
	List<AverageRatingDetailsType> AverageRatingDetails;
	List<FeedbackPeriodType> BidRetractionFeedbackPeriods;
	List<FeedbackPeriodType> NegativeFeedbackPeriods;
	long NeutralCommentCountFromSuspendedUsers;
	List<FeedbackPeriodType> NeutralFeedbackPeriods;
	List<FeedbackPeriodType> PositiveFeedbackPeriods;
	List<FeedbackPeriodType> TotalFeedbackPeriods;
	long UniqueNegativeFeedbackCount;
	long UniqueNeutralFeedbackCount;
	long UniquePositiveFeedbackCount;
}
