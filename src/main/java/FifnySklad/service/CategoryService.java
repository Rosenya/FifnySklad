package FifnySklad.service;

import FifnySklad.model.Category;
import FifnySklad.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;

import java.util.List;

@Service

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category>getCategories(){
        return categoryRepository.findAll();
    }

}
