package jintran.post.model.post;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PostDTO {
    @NotEmpty(message = "Empty title")
    private String title;
    @NotEmpty(message = "Empty content")
    private String content;
    @Size(min=10, message = "Min 10 characters")
    @Size(max =  2000, message = "Max 2000")
    private String description;
    private MultipartFile imageFile;

    public PostDTO() {
    }

    public PostDTO(String title, String content, String description, MultipartFile imageFile) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.imageFile = imageFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
