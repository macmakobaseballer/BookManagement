package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Book;
import com.example.demo.form.BookSearchForm;
import com.example.demo.service.BookService;


@Controller
@RequestMapping("/book")

public class TopController {

	@Autowired
	private BookService bookService;


	@RequestMapping("")
	public String index(BookSearchForm bookForm,Model model) {
		//タイトル
		model.addAttribute("title", "つんどく管理あぷり");

		//bookform(formクラス）がnullじゃなかったら1件検索
		if(bookForm.getId() > 0 ) {
			Book book = bookService.findById(bookForm.getId());
			model.addAttribute("book", book);
		}
		return "index";

	}




}
