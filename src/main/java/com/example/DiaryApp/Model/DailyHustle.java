package com.example.DiaryApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyHustle {

    @Id//marks id variable for Spring as Primary Key
    private Integer id;

    private String date;
    private String mood;
    private String content;
}
