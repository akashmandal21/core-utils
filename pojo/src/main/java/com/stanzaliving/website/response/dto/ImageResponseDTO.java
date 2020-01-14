/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */
public class ImageResponseDTO {

	private int imageId;
	private String imageUrl;
	private String imageType;
	private int imageOrder;
	private boolean enabled;

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public int getImageOrder() {
		return imageOrder;
	}

	public void setImageOrder(int imageOrder) {
		this.imageOrder = imageOrder;
	}
}
