package com.dk.libManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository lib;
	
	public List<Book> getAllBooks(){
		return lib.findAll();
	}
	
	public Book getBooksById(Long id) {
		return lib.findById(id).orElse(null);
	}
	
	public Book saveBook(Book book) {
		return lib.save(book);
	}
	
	public void deleteBook(Long id) {
		lib.deleteById(id); 
	}
	
}
