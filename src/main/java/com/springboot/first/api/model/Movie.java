package com.springboot.first.api.model;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue
    private  int movieId;
    private String movieName;
    private  String establishdDate;
    private String releaseDate;





}
