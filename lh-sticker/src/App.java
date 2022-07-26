package src;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class App {
    public static void main (String[] args) throws Exception {


        //Criar conexão HTTP e buscar os TOP 250 filmes;
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";

        HttpClient httpClient = HttpClient.newHttpClient();
        URI endereco = new URI(url);
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        String body = response.body();

        /*System.out.println(body);*/

        //Extrair somente os dados que interessam (Titulo, poster e classificação);
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // Exibir e manipular os dados;
        StickerGenerator stickerGenerator = new StickerGenerator();
        for (int i = 0; i < 10; i++) {

            Map<String, String> filme = listaDeFilmes.get(i);
            String urlImagem = filme.get("image").replaceAll("(@+)(.*).jpeg$", "$1.jpeg");

            String titulo = filme.get("title");

            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = "saida/" + titulo + ".png";

            stickerGenerator.create(inputStream, nomeArquivo);
            System.out.println(titulo);
            System.out.println(titulo);

        }
    /*    for (Map<String, String> filme : listaDeFilmes) {

            System.out.println(filme.get("title"));
            InputStream inputStream = new URL(filme.get("image")).openStream();


            stickerGenerator.create(inputStream, filme.get("title") + ".png");
            System.out.println();

        }*/
    }
}