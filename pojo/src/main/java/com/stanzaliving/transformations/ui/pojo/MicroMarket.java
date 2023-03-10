package com.stanzaliving.transformations.ui.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MicroMarket implements Serializable {

	private String microMarketName;

	private Long id;

	private String uuid;

	private List<Residence> residences;
}