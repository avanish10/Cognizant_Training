package com.indigo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@ToString(onlyExplicitlyIncluded = true)
@Getter
@RequiredArgsConstructor
public class Model {

	@ToString.Include
	private final String flightType;
	@ToString.Include
	private final String flightNumber;
	//@ToString.Include
	private List<Passengers> list = new ArrayList<Passengers>() ;
	
}
