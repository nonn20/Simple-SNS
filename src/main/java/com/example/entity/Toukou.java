package com.example.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Toukou {
	@Id
	private Integer id;
	
	@NotNull(message="name is not enterd")
	@NotBlank(message="name is not enterd")
	private String name;
	
	@NotNull(message="content is not enterd")
	@NotBlank(message="content is not enterd")
	private String content;
}
