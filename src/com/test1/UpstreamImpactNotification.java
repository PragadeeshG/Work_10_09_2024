package com.test1;

public class UpstreamImpactNotification {
	private String notificationType;
	private String sourceApplication;
	private boolean healthCheck;
	private Integer upstreamCode;
	private String targetApplicationName;
	private String isEmailMode;
	private Integer isScreenMode;
	private String screenUrl;
	private String screenCredentials;
	private Integer maxEmailCount;
	private String mailTo;
	private String mailCc;
	private String mailBcc;

	public UpstreamImpactNotification() {

	}

	public UpstreamImpactNotification(String notificationType, String sourceApplication, boolean healthCheck,
			Integer upstreamCode, String targetApplicationName, String isEmailMode, Integer isScreenMode,
			String screenUrl, String screenCredentials, Integer maxEmailCount, String mailTo, String mailCc,
			String mailBcc) {
		super();
		this.notificationType = notificationType;
		this.sourceApplication = sourceApplication;
		this.healthCheck = healthCheck;
		this.upstreamCode = upstreamCode;
		this.targetApplicationName = targetApplicationName;
		this.isEmailMode = isEmailMode;
		this.isScreenMode = isScreenMode;
		this.screenUrl = screenUrl;
		this.screenCredentials = screenCredentials;
		this.maxEmailCount = maxEmailCount;
		this.mailTo = mailTo;
		this.mailCc = mailCc;
		this.mailBcc = mailBcc;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
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

	public Integer getUpstreamCode() {
		return upstreamCode;
	}

	public void setUpstreamCode(Integer upstreamCode) {
		this.upstreamCode = upstreamCode;
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

}