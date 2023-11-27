package nba.back.services;

import java.util.List;
import java.util.Optional;
import nba.back.models.Book;
import nba.back.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  private BookRepository repository;

  public List<Book> list() {
    return repository.findAll();
  }

  public Book insert(Book book) {
    return repository.save(book);
  }

  public Optional<Book> findById(String matricule) {
    return repository.findById(Integer.valueOf(matricule));
  }

  public void deleteById(String id) {
    repository.deleteById(Integer.valueOf(id));
  }
}
