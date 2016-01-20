package io.toro.ebay.model

import groovy.transform.ToString

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@ToString(includeNames=true)
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
public class AddressType {
	AddressAttributeType AddressAttribute;
	String AddressID;
	AddressOwnerCodeType AddressOwner;
	AddressUsageCodeType AddressUsage;
	String CityName;
	String CompanyName;
	CountryCodeType Country;
	String CountryName;
	String County;
	String ExternalAddressID;
	String FirstName;
	String InternationalName;
	String InternationalStateAndCity;
	String InternationalStreet;
	String LastName;
	String Name;
	String Phone;
	String Phone2;
	String Phone2AreaOrCityCode;
	CountryCodeType Phone2CountryCode;
	String Phone2CountryPrefix;
	String Phone2LocalNumber;
	String PhoneAreaOrCityCode;
	CountryCodeType PhoneCountryCode;
	String PhoneCountryPrefix;
	String PhoneLocalNumber;
	String PostalCode;
	String ReferenceID;
	String StateOrProvince;
	String Street;
	String Street1;
	String Street2;
}
