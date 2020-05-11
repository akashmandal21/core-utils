package com.stanzaliving.core.food.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.stanzaliving.core.food.enums.FoodOrderImageType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UploadImageDto {

	private FoodOrderImageType foodOrderImageType;

	private List<MultipartFile> multipartFiles;

}
