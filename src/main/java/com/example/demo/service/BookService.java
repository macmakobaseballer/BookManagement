package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@Service
public class BookService {

	@Autowired
	BookDao bookDao;


	//1件検索
	public Book findById(int id) {;
		return bookDao.findById(id);
	}

	//全件検索
	public List<Book> bookList(){
		return bookDao.findAll();
	}

	//1件登録
	public void insertOne(Book book) {
		bookDao.insertOne(book);

	}
}


