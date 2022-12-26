package com.shurjopay.constants;

/**
 * The configuration keys of shurjopay which are passed by properties file.
 * @author Al - Amin
 * @since 2022-10-27
 */
public enum ShurjopayConfigKeys {
	
	/** Merchant username provided by shurjopay.*/
	SP_USER,
	
	/** Merchant password provided by shurjopay.*/
	SP_PASS,
	
	/** ShurjoPay base URL for performing a payment cycle.*/
	SHURJOPAY_API,
	
	/** Callback URL to perform with shurjopay transaction id.*/
	SP_CALLBACK;
}
