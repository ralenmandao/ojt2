package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class ClientAlertsEventType {
	AskSellerQuestionEventType AskSellerQuestion;
	BestOfferEventType BestOffer;
	BestOfferDeclinedEventType BestOfferDeclined;
	BestOfferPlacedEventType BestOfferPlaced;
	BidPlacedEventType BidPlaced;
	BidReceivedEventType BidReceived;
	CounterOfferReceivedEventType CounterOfferReceived;
	EndOfAuctionEventType EndOfAuction;
	ClientAlertsEventTypeCodeType EventType;
	FeedbackLeftEventType FeedbackLeft;
	FeedbackReceivedEventType FeedbackReceived;
	FeedbackStarChangedEventType FeedbackStarChanged;
	EndOfTransactionEventType FixedPriceEndOfTransaction;
	EndOfTransactionEventType FixedPriceTransaction;
	ItemAddedToWatchListEventType ItemAddedToWatchList;
	ItemEndedEventType ItemEnded;
	ItemListedEventType ItemListed;
	ItemLostEventType ItemLost;
	ItemMarkedPaidEventType ItemMarkedPaid;
	ItemMarkedShippedEventType ItemMarkedShipped;
	ItemRemovedFromWatchListEventType ItemRemovedFromWatchList;
	ItemSoldEventType ItemSold;
	ItemUnsoldEventType ItemUnsold;
	ItemWonEventType ItemWon;
	OutbidEventType Outbid;
	PriceChangeEventType PriceChange;
	SecondChanceOfferEventType SecondChanceOffer;
	WatchedItemEndingSoonEventType WatchedItemEndingSoon;
}
