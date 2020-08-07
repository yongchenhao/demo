package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
public class TBkBookDto extends TBkBook{
    private String genreName;
    private String themeName;
    private List<TBkQuizQuestion> tBkQuizQuestions;
}
