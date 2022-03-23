package site.metacoding.serch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import site.metacoding.serch.domain.PostRepository;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/")
    public String list(Model model, @RequestParam(defaultValue = "") String keyword) {
        model.addAttribute("lists", postRepository.findAll());
        model.addAttribute("lists", postRepository.mSearch(keyword));
        return "list";
    }
}
