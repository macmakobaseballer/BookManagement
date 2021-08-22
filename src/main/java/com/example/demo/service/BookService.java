package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import com.example.demo.entity.BookFinish;

@Service
public class BookService {

	@Autowired
	BookDao bookDao;

	//1件検索
	public Book findById(int id) {
		return bookDao.findById(id);
	}
	
	//1件検索（詳細画面）
	public Book findByIdDetail(int id) {
		return bookDao.findByIdDetail(id);
	}

	//全件検索(つんどく中）
	public List<Book> bookList(){
		return bookDao.findAll();
	}
	
	//善件検索（読了）
	public List<BookFinish> bookFinishList(){
		return bookDao.findAllFinish();
	}

	//1件登録
	public void insertBookOne(Book book) {
		bookDao.insertOne(book);
	}
	
	//1件登録（ページ数登録）
	public void insertPageOne(Book book) {
		bookDao.insertOneStatus(book);
	}
		
	//1件更新（ページ数）
	public void updateBookOne(int id,
			int readingPage) {
		bookDao.updateOne(id, readingPage);
	}

	//1件削除
	public void deleteBookOne(int id) {
		int count = bookDao.deleteOne(id);
	}
	
	//1件登録（読了テーブル）
	public void insertFinishOne(Book book,int id) {
		bookDao.insertOneFinish(book, id);
	}
}


