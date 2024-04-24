package com.example.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {

	private static final long serialVersionUID = 300002228479017363L;

	private Integer id;
	private String name;
	private String department;
	private String designation;
}
