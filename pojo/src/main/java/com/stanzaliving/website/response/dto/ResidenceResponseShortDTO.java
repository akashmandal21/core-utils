package com.stanzaliving.website.response.dto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceResponseShortDTO {

	private int residenceId;

	private String name;

	private Gender gender;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;

	private int cityId;

	private String cityName;

	private String citySlug;

	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

	private Set<ImageResponseDTO> images = new HashSet<>(0);

	private AddressResponseDTO address;

	private String description;

	private String seoTitle;

	private String seoDescription;

	private String pricingPlan;

	private int startingPrice;

	private double latitude;

	private double longitude;

	private boolean enabled;

	private String slug;

	private Integer fomoBedCount;

	private Double distanceFromPlace;

	private Integer preBookingAmount;

	private String preBookingMode;

	private Set<FacilityResponseDTO> facilites = new HashSet<>(0);

	private String facilitesSortedString;

	private String googleMapLink;

	private Integer sortOrder;

	private boolean soldOut;

	private String virtualTourImage;

	private String fomoTag;

	public Set<ResidenceOccupancyResponseDTO> getResidenceOccupancies() {
		TreeSet<ResidenceOccupancyResponseDTO> occupancyComp = new TreeSet<ResidenceOccupancyResponseDTO>(
				new Comparator<ResidenceOccupancyResponseDTO>() {

					@Override
					public int compare(ResidenceOccupancyResponseDTO o1, ResidenceOccupancyResponseDTO o2) {
						if (o1.getOccupancyOccupancy() > o2.getOccupancyOccupancy()) {
							return 1;
						} else {
							return -1;
						}
					}
				});

		System.out.println(residenceOccupancies);
		if (Objects.nonNull(residenceOccupancies)) {
			occupancyComp.addAll(residenceOccupancies);
		}
		return occupancyComp;
	}

	public Set<ImageResponseDTO> getImages() {
		TreeSet<ImageResponseDTO> imagesComp = new TreeSet<ImageResponseDTO>(new Comparator<ImageResponseDTO>() {

			@Override
			public int compare(ImageResponseDTO o1, ImageResponseDTO o2) {
				if (o1.getImageOrder() > o2.getImageOrder()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		imagesComp.addAll(images);
		return imagesComp;
	}
}
