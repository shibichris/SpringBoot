package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Book;
import repository.BookRepository;

@RestController
public class BookController {
     
	@Autowired
	private BookRepository bookrepository;
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Book book) {
		bookrepository.save(book);
		return "Added book with id :"+book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBook(){
		return bookrepository.findAll()
	}
}
