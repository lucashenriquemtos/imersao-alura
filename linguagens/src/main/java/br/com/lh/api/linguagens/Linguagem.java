package br.com.lh.api.linguagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Linguagem implements Serializable {

    private String title;
    private String image;
    private int ranking;
}
