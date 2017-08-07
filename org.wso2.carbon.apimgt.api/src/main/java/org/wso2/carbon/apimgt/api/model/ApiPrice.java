package org.wso2.carbon.apimgt.api.model;

import java.sql.Date;
import java.sql.Timestamp;

import org.wso2.carbon.apimgt.api.APIProvider;

/**
 * Details about an ApiPrice
 * @author yumiao
 *
 */
public class ApiPrice {

	public String getApiProvider() {
		return apiProvider;
	}
	public void setApiProvider(String apiProvider) {
		this.apiProvider = apiProvider;
	}
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	private String apiId;
	private String apiName;
	private String apiPrice;
	private Timestamp createdDate;
	private String createdBy;
	private String apiProvider;
	private String apiVersion;
	private String context;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiPrice() {
		return apiPrice;
	}
	public void setApiPrice(String apiPrice) {
		this.apiPrice = apiPrice;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
}
