package com.codeit.blog.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
//@Setter -> Entity에서 setter 사용은 권장하지 않습니다.
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    private Long id;
    private String title;
    private String content;
    private String author;
    private Category category;
    private int viewCount;
    private String thumbnailPath;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
