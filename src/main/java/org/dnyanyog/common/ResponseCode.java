package org.dnyanyog.common;

public enum ResponseCode 
{

	ADD_CUSTOMER_SUCCESS_CODE("001","Success"),
	ADD_CUSTOMER_SUCCESS_MESSAGE("002","Customer added successfully"),
	ADD_CUSTOMER_DUPLICATE_EMAIL_CODE("003","Fail"), 
	ADD_CUSTOMER_DUPLICATE_EMAIL_MESSAGE("004","Customer added successfully"),
	CUSTOMER_NOT_FOUND_CODE("005","Fail"),
	CUSTOMER_NOT_FOUND_MESSAGE("006","Customer not present in the system"),
	CUSTOMER_DETAILS_SUCCESS_CODE("007","Success"),
	CUSTOMER_DETAILS_SUCCESS_MESSAGE("008","Customer Details are as follow"); 
	private final String code;
	private final String message;
	
	 ResponseCode(String code,String message)
	{
		
		this.code=code;
		this.message=message;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
