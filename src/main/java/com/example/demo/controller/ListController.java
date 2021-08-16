package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class ListController {

	@Autowired
	BookService bookService;

	@GetMapping("/list")
	public String index( String showList, Model model) {

		//タイトル
		model.addAttribute("title", "つんどく中一覧");

		//一覧表示ボタンが押されると本一覧をmodelに登録
		List<Book> bookList = bookService.bookList();
		model.addAttribute("bookList", bookList);


		return "list";
	}


}
