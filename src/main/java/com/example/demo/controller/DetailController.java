package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Book;
import com.example.demo.form.BookDetailForm;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class DetailController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/*ユーザー詳細画面を表示*/
	@GetMapping("/detail{id:.+}")
	public String getBook(BookDetailForm form,Model model,
			@PathVariable("id") int id) {
		
		//ユーザーを1件取得
		Book book = bookService.findByIdDetail(id);
		
		//bookをformにコピー
		form = modelMapper.map(book,BookDetailForm.class);
		
		//Modelに登録
		model.addAttribute("bookDetailForm", form);
	
		
		return "detail";
	}
	
	@PostMapping(value ="/detail" , params = "update")
		public String updateBook(BookDetailForm form,Model model) {
		
		//Bookのページ数を更新
		bookService.updateBookOne(form.getId(),form.getReadingPage());
		
		//一覧画面へリダイレクト
		return "redirect:/book/list";
	}
	
	
}
