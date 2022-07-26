package br.com.lh.api.linguagens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "linguagens")
public class Linguagem implements Serializable {

    @Id
    private String id;

    private String title;
    private String image;
    private int ranking;
}
