package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Book {
	private int id;
	private String bookName;
	private String volumeNum;
	private String authorName;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate registerDate;
	private int readingPage;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate updateDate ;

}
