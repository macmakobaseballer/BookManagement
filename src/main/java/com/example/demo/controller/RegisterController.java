package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Book;
import com.example.demo.form.BookRegisterForm;
import com.example.demo.service.BookService;


@Controller
@RequestMapping("/book")
public class RegisterController {


	@Autowired
	private BookService bookService;

	@Autowired
	private ModelMapper modelMapper;


	@RequestMapping("/register")
	public String getRegister(Model model, @ModelAttribute BookRegisterForm form) {

		//タイトル
		model.addAttribute("title", "つんどく登録");

		//ユーザー登録画面に遷移
		return "register";
	}

	@PostMapping("/register")
	public String postBookRegister(Model model,
			@ModelAttribute @Validated BookRegisterForm form , BindingResult bindingResult) {

		if( bindingResult.hasErrors()) {
			return getRegister(model, form);
		}

		
		Book book = modelMapper.map(form,Book.class);

		bookService.insertBookOne(book);

		return "redirect:/book";
	}

}


