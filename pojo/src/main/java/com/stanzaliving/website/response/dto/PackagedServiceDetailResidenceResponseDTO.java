/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */
public class PackagedServiceDetailResidenceResponseDTO {

	private Integer residenceId;
	private String residenceName;
	private Integer charges;
	private String PackagedServiceName;
	private String PackagedServiceDuration;
	private String backgroundImgUrl;
	private String iconImgUrl;
	private String description;
	private String disclaimers;

	public Integer getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(Integer residenceId) {
		this.residenceId = residenceId;
	}

	public Integer getCharges() {
		return charges;
	}

	public void setCharges(Integer charges) {
		this.charges = charges;
	}

	public String getPackagedServiceName() {
		return PackagedServiceName;
	}

	public void setPackagedServiceName(String packagedServiceName) {
		PackagedServiceName = packagedServiceName;
	}

	public String getPackagedServiceDuration() {
		return PackagedServiceDuration;
	}

	public void setPackagedServiceDuration(String packagedServiceDuration) {
		PackagedServiceDuration = packagedServiceDuration;
	}

	public String getBackgroundImgUrl() {
		return backgroundImgUrl;
	}

	public void setBackgroundImgUrl(String backgroundImgUrl) {
		this.backgroundImgUrl = backgroundImgUrl;
	}

	public String getIconImgUrl() {
		return iconImgUrl;
	}

	public void setIconImgUrl(String iconImgUrl) {
		this.iconImgUrl = iconImgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisclaimers() {
		return disclaimers;
	}

	public void setDisclaimers(String disclaimers) {
		this.disclaimers = disclaimers;
	}

	public String getResidenceName() {
		return residenceName;
	}

	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}
	
	public PackagedServiceDetailResidenceResponseDTO() {
	}

	@Override
	public String toString() {
		return "PackagedServiceDetailResidenceResponseDTO [residenceId=" + residenceId + ", residenceName=" + residenceName + ", charges=" + charges + ", PackagedServiceName=" + PackagedServiceName
				+ ", PackagedServiceDuration=" + PackagedServiceDuration + ", backgroundImgUrl=" + backgroundImgUrl + ", iconImgUrl=" + iconImgUrl + ", description=" + description + ", disclaimers="
				+ disclaimers + "]";
	}
}
