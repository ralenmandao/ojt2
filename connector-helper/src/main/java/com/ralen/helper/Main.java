package com.ralen.helper;

import java.io.IOException;
import java.util.Arrays;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import com.ralen.helper.sample.ebay.EbayCallMapper;
import com.ralen.helper.sample.ebay.EbayDataTypeResolver;
import com.ralen.helper.sample.ebay.EbayElementFetcher;
import com.ralen.helper.sample.ebay.EbayElementProcessor;
import com.ralen.helper.sample.ebay.EbayServiceMapper;
import com.ralen.helper.sample.ebay.EbaySimpleGroovyFileCreator;
import com.ralen.helper.sample.ebay.EbaySingleClassFetcher;
import com.ralen.helper.sample.ebay.EbaySingleClassProcessor;
import com.ralen.helper.sample.postcode.PCCallMapper;
import com.ralen.helper.sample.postcode.PCElementFetcher;
import com.ralen.helper.sample.postcode.PCElementProcessor;
import com.ralen.helper.sample.postcode.PCServiceMapper;
import com.ralen.helper.sample.trello.TrelloServiceMapper;
import com.ralen.helper.util.Util;

public class Main {
	public static void main(String[] args) throws Exception {
		ebayComplete();
	}

	public static void ebayComplete(){
		ConnectorBootstrap con = new ConnectorBootstrap("com.ralen.helper",
				"https://go.developer.ebay.com/api-documentation", 
				Main.class,
				"src/main/java/");
		
		con.map(new EbayServiceMapper())
			.map((doc) -> Arrays.asList(doc.baseUri().replace("index.html", "types")))
				.map(Util.links("#doc > p:not(.quickPicks) > a.nohi", (doc) -> doc.baseUri().replace("index.html", "")))
					.fetchFromURI(new EbaySingleClassFetcher(), new EbaySingleClassProcessor(), "", "model")
						.clear()
							.mapService(new EbayServiceMapper())
								.mapCall(new EbayCallMapper())
									.fetchFromService(new EbayElementFetcher("#stdInputTable"), new EbayElementProcessor(), "Request")
										.fetchFromService(new EbayElementFetcher("#stdOutputTable"), new EbayElementProcessor(), "Response")
											.build(new EbaySimpleGroovyFileCreator(), new EbayDataTypeResolver());
	}
	
	public static void ebaySample() {
		ConnectorBootstrap con = new ConnectorBootstrap("com.ralen.helper",
														"https://go.developer.ebay.com/api-documentation", 
														Main.class,
														"src/main/java/");
		
		con.mapService(new EbayServiceMapper())
			.mapCall(new EbayCallMapper())
				.fetchFromService(new EbayElementFetcher("#stdInputTable"), new EbayElementProcessor(), "Request")
					.fetchFromService(new EbayElementFetcher("#stdOutputTable"), new EbayElementProcessor(), "Response")
						.build(new EbaySimpleGroovyFileCreator(), new EbayDataTypeResolver());
	}
	
	public static void postCodeSample() {
		ConnectorBootstrap con = new ConnectorBootstrap("com.ralen.helper",
														"https://www.pcapredict.com/support/webservices/", 
														Main.class,
														"src/main/java/");

		con.mapService(new PCServiceMapper())
			.mapCall(new PCCallMapper())
				.fetchFromService(new PCElementFetcher(), new PCElementProcessor(), "Request")
					.build(new EbaySimpleGroovyFileCreator(), new EbayDataTypeResolver());
	}
}