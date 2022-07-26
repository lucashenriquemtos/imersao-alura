package br.com.lh;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main (String[] args) throws Exception {

        var http = new ClienteHTTP();

        /*String urlIMBD = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";
        String json = http.buscaDados(urlIMBD);
        ExtratorConteudo extratorConteudo = new ExtratorConteudoIMBD();
        List<Conteudo> conteudos = extratorConteudo.extrairConteudos(json);*/



        String urlAPI = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";
        String json = http.buscaDados(urlAPI);
        ExtratorConteudo extratorConteudo = new ExtratorConteudoDaNasa();
        List<Conteudo> conteudos = extratorConteudo.extrairConteudos(json);

        var generator = new StickerGenerator();

        for (int i = 0; i < 2; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            generator.create(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();

        }
    }
}