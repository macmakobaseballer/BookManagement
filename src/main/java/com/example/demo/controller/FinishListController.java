package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.BookFinish;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class FinishListController {

	@Autowired
	BookService bookService;

	BookFinish bookFinish = new BookFinish();

	@GetMapping("/finishlist")
	public String finishlist( String showFinishList, Model model) {
		
		
		//タイトル
		model.addAttribute("title", "読了本一覧");

		//一覧表示ボタンが押されると本一覧をmodelに登録
		List<BookFinish> bookFinishList = bookService.bookFinishList();
		model.addAttribute("bookFinishList", bookFinishList );

		return "finishlist";
	}


}
