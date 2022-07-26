package src;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class StickerGenerator {

    void create (InputStream inputStream, String nomeArquivo) throws Exception {
        //ler imagem

        BufferedImage imgOriginal = ImageIO.read(inputStream);

        //cria nova em memória com transparência e novo tamanho
        int width = imgOriginal.getWidth();
        int height = imgOriginal.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        //copiar a imagem original para a nova imagem (em memória)
        Graphics newImageGraphics = newImage.getGraphics();
        newImageGraphics.drawImage(imgOriginal, 0, 0, null);

        //Configurar Fonte
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        newImageGraphics.setColor(Color.YELLOW);
        newImageGraphics.setFont(font);

        //Adicionar frase da figura
        newImageGraphics.drawString("TOPZERA", 100, newHeight - 100);
        //escrever nova imagem num arquivo
        ImageIO.write(newImage, "png", new File(nomeArquivo));
    }

}
