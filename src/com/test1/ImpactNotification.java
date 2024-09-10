package com.test1;

public class ImpactNotification {
	private String notificationType;
	private String sourceApplication;
	private String sourceDataset;
	private String allDsApplicable;
	private String dsNmae;
	private String dsScreenId;
	private String notificationMedium;
	private Integer maxAllowedNotification;
	private String followUpRequired;
	private String mainEventType;
	private String entityState;

	public ImpactNotification() {

	}

	public ImpactNotification(String notificationType, String sourceApplication, String sourceDataset,
			String allDsApplicable, String dsNmae, String dsScreenId, String notificationMedium,
			Integer maxAllowedNotification, String followUpRequired, String mainEventType, String entityState) {
		super();
		this.notificationType = notificationType;
		this.sourceApplication = sourceApplication;
		this.sourceDataset = sourceDataset;
		this.allDsApplicable = allDsApplicable;
		this.dsNmae = dsNmae;
		this.dsScreenId = dsScreenId;
		this.notificationMedium = notificationMedium;
		this.maxAllowedNotification = maxAllowedNotification;
		this.followUpRequired = followUpRequired;
		this.mainEventType = mainEventType;
		this.entityState = entityState;
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

	public String getSourceDataset() {
		return sourceDataset;
	}

	public void setSourceDataset(String sourceDataset) {
		this.sourceDataset = sourceDataset;
	}

	public String getAllDsApplicable() {
		return allDsApplicable;
	}

	public void setAllDsApplicable(String allDsApplicable) {
		this.allDsApplicable = allDsApplicable;
	}

	public String getDsNmae() {
		return dsNmae;
	}

	public void setDsNmae(String dsNmae) {
		this.dsNmae = dsNmae;
	}

	public String getDsScreenId() {
		return dsScreenId;
	}

	public void setDsScreenId(String dsScreenId) {
		this.dsScreenId = dsScreenId;
	}

	public String getNotificationMedium() {
		return notificationMedium;
	}

	public void setNotificationMedium(String notificationMedium) {
		this.notificationMedium = notificationMedium;
	}

	public Integer getMaxAllowedNotification() {
		return maxAllowedNotification;
	}

	public void setMaxAllowedNotification(Integer maxAllowedNotification) {
		this.maxAllowedNotification = maxAllowedNotification;
	}

	public String getFollowUpRequired() {
		return followUpRequired;
	}

	public void setFollowUpRequired(String followUpRequired) {
		this.followUpRequired = followUpRequired;
	}

	public String getMainEventType() {
		return mainEventType;
	}

	public void setMainEventType(String mainEventType) {
		this.mainEventType = mainEventType;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}