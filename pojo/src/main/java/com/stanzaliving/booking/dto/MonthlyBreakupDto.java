package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.dto.request.ServicePriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyBreakupDto implements Serializable {

    private Double subContract1MonthlyRent;

    private Double subContract2MonthlyRent;

    private Double monthlyFee;

    private Double licenseFee;

    private Double cityHeadBuffer;

    private Double upsell;

    private Double bumpUpPrice;

    private Double pricingStrategyAmount;

    private Double priceBump;

    private ServicePriceDto packagedServicePriceDto;

    private ServicePriceDto foodServicePriceDto;

    private List<ServicePriceDto> vasPriceDto;

    private ServicePriceDto accommodationPriceDto;

    private ServicePriceDto upsellPriceDto;
    private ServicePriceDto bumpUpPriceDto;
    private ServicePriceDto cityBufferPriceDto;

    private ServicePriceDto rentalONMPriceDto;
    private ServicePriceDto serviceONMPriceDto;

    public Double getMonthlyFee() {
        if (Objects.isNull(this.monthlyFee))
            return 0D;
        return this.monthlyFee;
    }

    public void setMonthlyFee(final Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public Double getLicenseFee() {
        if (Objects.isNull(this.licenseFee))
            return 0D;
        return this.licenseFee;
    }

    public void setLicenseFee(final Double licenseFee) {
        this.licenseFee = licenseFee;
    }

    public Double getCityHeadBuffer() {
        if (Objects.isNull(this.cityHeadBuffer))
            return 0D;
        return this.cityHeadBuffer;
    }

    public void setCityHeadBuffer(final Double cityHeadBuffer) {
        this.cityHeadBuffer = cityHeadBuffer;
    }

    public Double getUpsell() {
        if (Objects.isNull(this.upsell))
            return 0D;
        return this.upsell;
    }

    public void setUpsell(final Double upsell) {
        this.upsell = upsell;
    }

    public Double getBumpUpPrice() {
        return Optional.ofNullable(this.bumpUpPrice).orElse(0D);
    }

    public ServicePriceDto getPackagedServicePriceDto() {
        if (Objects.isNull(this.packagedServicePriceDto))
            return new ServicePriceDto();
        return this.packagedServicePriceDto;
    }

    public void setPackagedServicePriceDto(final ServicePriceDto packagedServicePriceDto) {
        this.packagedServicePriceDto = packagedServicePriceDto;
    }

    public ServicePriceDto getFoodServicePriceDto() {
        if (Objects.isNull(this.foodServicePriceDto))
            return new ServicePriceDto();
        return this.foodServicePriceDto;
    }

    public void setFoodServicePriceDto(final ServicePriceDto foodServicePriceDto) {
        this.foodServicePriceDto = foodServicePriceDto;
    }

    public ServicePriceDto getAccommodationPriceDto() {
        if (Objects.isNull(this.accommodationPriceDto))
            return new ServicePriceDto();
        return this.accommodationPriceDto;
    }

    public void setAccommodationPriceDto(final ServicePriceDto accommodationPriceDto) {
        this.accommodationPriceDto = accommodationPriceDto;
    }

    public ServicePriceDto getUpsellPriceDto() {
        if (Objects.isNull(this.upsellPriceDto))
            return new ServicePriceDto();
        return this.upsellPriceDto;
    }

    public void setUpsellPriceDto(final ServicePriceDto upsellPriceDto) {
        this.upsellPriceDto = upsellPriceDto;
    }

    public ServicePriceDto getBumpUpPriceDto() {
        return Optional.ofNullable(this.bumpUpPriceDto).orElse(new ServicePriceDto());
    }

    public void setBumpUpPriceDto(final ServicePriceDto bumpUpPriceDto) {
        this.bumpUpPriceDto = bumpUpPriceDto;
    }

    public ServicePriceDto getCityBufferPriceDto() {
        if (Objects.isNull(this.cityBufferPriceDto))
            return new ServicePriceDto();
        return this.cityBufferPriceDto;
    }



    public void setBumpUpPrice(final Double bumpUpPrice) {
        this.bumpUpPrice = bumpUpPrice;
    }

    public void setCityBufferPriceDto(final ServicePriceDto cityBufferPriceDto) {
        this.cityBufferPriceDto = cityBufferPriceDto;
    }

}