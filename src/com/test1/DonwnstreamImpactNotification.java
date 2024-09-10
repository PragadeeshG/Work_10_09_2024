package com.test1;

public class DonwnstreamImpactNotification {
	private String sourceApplication;
	private boolean healthCheck;
	private Integer downstreamCode;
	private String targetApplicationName;
	private String isEmailMode;
	private Integer isScreenMode;
	private String screenUrl;
	private String screenCredentials;
	private Integer maxEmailCount;
	private String mailTo;
	private String mailCc;
	private String mailBcc;
	private String impactAnalysis;
	private String rootCauseTracker;
	private String entityState;
	private String remarks;

	public DonwnstreamImpactNotification() {

	}

	public DonwnstreamImpactNotification(String sourceApplication, boolean healthCheck, Integer downstreamCode,
			String targetApplicationName, String isEmailMode, Integer isScreenMode, String screenUrl,
			String screenCredentials, Integer maxEmailCount, String mailTo, String mailCc, String mailBcc,
			String impactAnalysis, String rootCauseTracker, String entityState, String remarks) {
		super();
		this.sourceApplication = sourceApplication;
		this.healthCheck = healthCheck;
		this.downstreamCode = downstreamCode;
		this.targetApplicationName = targetApplicationName;
		this.isEmailMode = isEmailMode;
		this.isScreenMode = isScreenMode;
		this.screenUrl = screenUrl;
		this.screenCredentials = screenCredentials;
		this.maxEmailCount = maxEmailCount;
		this.mailTo = mailTo;
		this.mailCc = mailCc;
		this.mailBcc = mailBcc;
		this.impactAnalysis = impactAnalysis;
		this.rootCauseTracker = rootCauseTracker;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public String getSourceApplication() {
		return sourceApplication;
	}

	public void setSourceApplication(String sourceApplication) {
		this.sourceApplication = sourceApplication;
	}

	public boolean isHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(boolean healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getDownstreamCode() {
		return downstreamCode;
	}

	public void setDownstreamCode(Integer downstreamCode) {
		this.downstreamCode = downstreamCode;
	}

	public String getTargetApplicationName() {
		return targetApplicationName;
	}

	public void setTargetApplicationName(String targetApplicationName) {
		this.targetApplicationName = targetApplicationName;
	}

	public String getIsEmailMode() {
		return isEmailMode;
	}

	public void setIsEmailMode(String isEmailMode) {
		this.isEmailMode = isEmailMode;
	}

	public Integer getIsScreenMode() {
		return isScreenMode;
	}

	public void setIsScreenMode(Integer isScreenMode) {
		this.isScreenMode = isScreenMode;
	}

	public String getScreenUrl() {
		return screenUrl;
	}

	public void setScreenUrl(String screenUrl) {
		this.screenUrl = screenUrl;
	}

	public String getScreenCredentials() {
		return screenCredentials;
	}

	public void setScreenCredentials(String screenCredentials) {
		this.screenCredentials = screenCredentials;
	}

	public Integer getMaxEmailCount() {
		return maxEmailCount;
	}

	public void setMaxEmailCount(Integer maxEmailCount) {
		this.maxEmailCount = maxEmailCount;
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getMailCc() {
		return mailCc;
	}

	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}

	public String getMailBcc() {
		return mailBcc;
	}

	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}

	public String getImpactAnalysis() {
		return impactAnalysis;
	}

	public void setImpactAnalysis(String impactAnalysis) {
		this.impactAnalysis = impactAnalysis;
	}

	public String getRootCauseTracker() {
		return rootCauseTracker;
	}

	public void setRootCauseTracker(String rootCauseTracker) {
		this.rootCauseTracker = rootCauseTracker;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
