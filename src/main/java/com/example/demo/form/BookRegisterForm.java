package com.example.demo.form;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookRegisterForm {
	private int id;

	@NotBlank
	@Email
	private String bookName;

	private String volumeNum;

	@NotBlank
	private String authorName;

	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate registerDate;

}
