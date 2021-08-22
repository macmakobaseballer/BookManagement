package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Book;


@Mapper
public interface BookDao {
	//1件検索
	Book findById(int id);
	
	//1件検索（詳細画面）
	Book findByIdDetail(int id);

	//全件取得
	List <Book> findAll();

	//1件登録
	void insertOne(Book book);
	
	//1件登録
	void insertOneStatus(Book book);

	//1件更新（ページ数）
	void updateOne(@Param("id") int id,
			@Param("readingPage") int readingPage);
}
