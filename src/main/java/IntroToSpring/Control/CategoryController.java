package IntroToSpring.Control;


import IntroToSpring.Model.Category;
import IntroToSpring.Model.Gif;
import IntroToSpring.data.CategoryRepository;
import IntroToSpring.data.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String getAllCatgeories(ModelMap modelMap){
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";

    }

    @RequestMapping("/catgories/{id}")
    public String category(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        modelMap.put("category",category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        return "category";
    }

}
