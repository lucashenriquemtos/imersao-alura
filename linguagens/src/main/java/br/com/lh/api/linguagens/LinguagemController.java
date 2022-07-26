package br.com.lh.api.linguagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens = List.of(
            new Linguagem("Java is a programming language that is concurrent, class-based, object-oriented, and designed to be resizable and " +
                    "garbage-collected.",
                    "https://raw.githubusercontent.com/abrahamcalf/programming-language-logos/master/src/java/java_256x256.png",
                    6)
       /*     new Linguagem("Python", "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python has a design philosophy that emphasizes code readability, notably using whitespace indentation to delimit code blocks."),
            new Linguagem("C#", "C# is a multi-paradigm programming language encompassing strong typing, imperative, declarative, functional programming, generic, object-oriented (class-based), and component-oriented programming disciplines."),
            new Linguagem("C++", "C++ is a general-purpose programming language. It has imperative, object-oriented and generic programming features, while also providing facilities for low-level memory manipulation."),
            new Linguagem("C", "C is a general-purpose, imperative, procedural programming language. It has imperative, object-oriented and generic programming features, while also providing facilities for low-level memory manipulation."),
            new Linguagem("Ruby", "Ruby is a dynamic, reflective, object-oriented, general-purpose programming language. It was created by Yukihiro Matsumoto in the late 1980s."),
            new Linguagem("Swift", "Swift is a modern programming language that is designed for iOS, OS X, tvOS, and watchOS development. It is designed to be a more intuitive language for new programmers than Objective-C."),
            new Linguagem("Kotlin", "Kotlin is a general-purpose, multi-platform, statically typed programming language that is interoperable with Java and C++."),
            new Linguagem("Go", "Go is a statically typed, compiled, concurrent, statically compiled programming language that is designed to be a modern, general-purpose, compiled programming language."),
            new Linguagem("Rust", "Rust is a general-purpose, concurrent, statically typed, compiled programming language that is designed to be a modern, general-purpose, compiled programming language."),
            new Linguagem("Scala", "Scala is a general-purpose, programmable*/
    );

    @GetMapping(value = "/linguagens-preferida")
    public String linguagemPreferida() {
        return "Java";
    }

    @GetMapping(value = "/linguagens")
    public List<Linguagem> listarLinguagens() {
        return linguagens;
    }
}
