package com.example.filetest.models.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String desc;

    private String content;

    public Post(String name, String desc, String content) {
        this.name = name;
        this.desc = desc;
        this.content = content;
    }
}
