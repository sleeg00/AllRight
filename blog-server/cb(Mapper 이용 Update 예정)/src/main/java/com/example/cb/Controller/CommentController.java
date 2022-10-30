package com.example.cb.Controller;


import com.example.cb.DTO.CommentForm;
import com.example.cb.Entity.Comment;
import com.example.cb.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommentController {

    private CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @PostMapping("/comment/create")
    public String create(CommentForm form){
        Comment comment = form.toEntity();
        System.out.println(comment.toString());

        Comment saved= commentRepository.save(comment);
        System.out.println(saved.toString());

        return "";
    }
    /*
    @GetMapping
    public Iterable<Comment> list() { return commentRepository.findAll();}
    */

    /*
    @GetMapping(value={"/id"})
    public Optional<Comment> findOne(@PathVariable String comment_id){
        return commentRepository.findById(comment_id);
    }

     */
    /*
    @PutMapping(value={"/id"})
    public Comment update(@PathVariable String comment_id, @RequestParam String post_id, @RequestParam String id, @RequestParam String author,
                          @RequestParam String content, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date last_edited_at,
                          @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date created_at,
                          @RequestParam Boolean is_secret,  @RequestParam Long _like){
        Optional <Comment> comment = commentRepository.findById(comment_id);
        comment.get().setComment_post_id(post_id);
        return commentRepository.save(comment.get());
    }

    @DeleteMapping
    public void delete(@RequestParam String comment_id){
        commentRepository.deleteById(Long.valueOf(comment_id));
    }

     */
}
