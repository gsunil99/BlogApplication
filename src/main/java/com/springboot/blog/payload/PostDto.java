package com.springboot.blog.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Api(description = "Post model information")
@Data
public class PostDto {
    @ApiModelProperty(value = "Blog post Id ")
    private long id;
    @ApiModelProperty(value = "Blog post Title ")
    @NotEmpty
    @Size(min = 2,message = "Post title should have at least 2 characters")
    private String title;

    @ApiModelProperty(value = "Blog post description ")
    @NotEmpty
    @Size(min=10,message = "Post description should have atleast 10 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
