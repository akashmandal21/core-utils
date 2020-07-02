/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */
public class AmenitiesResidenceResponseDTO {

	private Integer residenceId;
	private String residenceName;
	private String amenitiesName;
	private String imgUrl;

	public Integer getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(Integer residenceId) {
		this.residenceId = residenceId;
	}

	public String getResidenceName() {
		return residenceName;
	}

	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}

	public String getAmenitiesName() {
		return amenitiesName;
	}

	public void setAmenitiesName(String amenitiesName) {
		this.amenitiesName = amenitiesName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public AmenitiesResidenceResponseDTO() {
	}

	@Override
	public String toString() {
		return "AmenitiesResidenceResponseDTO [residenceId=" + residenceId + ", residenceName=" + residenceName + ", amenitiesName=" + amenitiesName + ", imgUrl=" + imgUrl + "]";
	}

}
