/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */
public class VasDetailResidenceResponseDTO {

	private Integer residenceId;
	private String residenceName;
	private Integer charges;
	private String vasName;
	private String vasDuration;
	private String imgUrl;
	private String vasIconImgUrl;
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

	public String getVasName() {
		return vasName;
	}

	public void setVasName(String vasName) {
		this.vasName = vasName;
	}

	public String getVasDuration() {
		return vasDuration;
	}

	public void setVasDuration(String vasDuration) {
		this.vasDuration = vasDuration;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getVasIconImgUrl() {
		return vasIconImgUrl;
	}

	public void setVasIconImgUrl(String vasIconImgUrl) {
		this.vasIconImgUrl = vasIconImgUrl;
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

	public VasDetailResidenceResponseDTO(Integer residenceId, Integer charges, String vasName, String vasDuration, String imgUrl) {
		this.residenceId = residenceId;
		this.charges = charges;
		this.vasName = vasName;
		this.vasDuration = vasDuration;
		this.imgUrl = imgUrl;
	}
	
	public VasDetailResidenceResponseDTO() {
	}

	@Override
	public String toString() {
		return "VasDetailResidenceResponseDTO [residenceId=" + residenceId + ", residenceName=" + residenceName + ", charges=" + charges + ", vasName=" + vasName + ", vasDuration=" + vasDuration
				+ ", imgUrl=" + imgUrl + ", vasIconImgUrl=" + vasIconImgUrl + ", description=" + description + ", disclaimers=" + disclaimers + "]";
	}

}
