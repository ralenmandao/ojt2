package com.ralen.helper.model

/**
 * Container for information about this listing's seller.
 */
public class SellerInfo {
	/**
	 * Visual indicator of user's feedback score. feedbackRatingStar values: None No graphic displayed, feedback
	 * score 0-9. Yellow Yellow Star, feedback score 10-49. Blue Blue Star, feedback score 50-99. Turquoise Turquoise
	 * Star, feedback score 100-499. Purple Purple Star, feedback score 500-999. Red Red Star, feedback score
	 * 1,000-4,999. Green Green Star, feedback score 5,000-9,999. YellowShooting Yellow Shooting Star, feedback score
	 * 10,000-24,999. TurquoiseShooting Turquoise Shooting Star, feedback score 25,000-49,999. PurpleShooting Purple
	 * Shooting Star, feedback score 50,000-99,999. RedShooting Red Shooting Star, feedback score 100,000-499,000 and
	 * above. GreenShooting Green Shooting Star, feedback score 500,000-999,000 and above. SilverShooting Silver
	 * Shooting Star, feedback score 1,000,000 or more.
	 */
	String feedbackRatingStar
	/**
	 * The aggregate feedback score of the seller. A seller's feedback score is their net positive feedback minus
	 * their net negative feedback. Feedback scores are a quantitative expression of the desirability of dealing with
	 * a seller in a transaction.
	 */
	long feedbackScore
	/**
	 * The percentage value of a user's positive feedback (their positive feedbackScore divided by their total
	 * positive plus negative feedback).
	 */
	double positiveFeedbackPercent
	/**
	 * The seller's eBay user name; a unique value.
	 */
	String sellerUserName
	/**
	 * Indicates whether the seller of the item is top rated. A Top Rated Seller: Consistently receives highest
	 * buyers' ratings Ships items quickly Has earned a track record of excellent service eBay regularly reviews the
	 * performance of these sellers to confirm that they continue to meet the program's requirements.
	 */
	boolean topRatedSeller
}
