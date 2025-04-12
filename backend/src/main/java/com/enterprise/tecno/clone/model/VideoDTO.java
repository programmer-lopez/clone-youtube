package com.enterprise.tecno.clone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(value = "Video")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoDTO {
    @Id
    private String id;
    private String description;
    private String title;
    private String userId;
    private String likes;
    private Integer disLikes;
    private Set<String> tags;
    private String url;
    private VideoStatusDTO videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<CommentDTO> comments;


}
