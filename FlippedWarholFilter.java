import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.awt.Color;
/**
 * Write a description of class FlippedWarholFilter here.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class FlippedWarholFilter extends Filter
{

    /**
     * Constructor for objects of class FlippedWarholFilter
     */
    public FlippedWarholFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    { 
        int height = image.getHeight();
        int width = image.getWidth();
 
        int halfHeight = height/2;
        int halfWidth = width/2;
        
        Color red = new Color (255, 0, 0);
        Color lightRed = new Color (200, 0, 0);
        Color medRed = new Color (150, 0, 0);
        Color darkRed = new Color (100, 0, 0);
        
        Color green = new Color (0, 255, 0);
        Color lightGreen = new Color (0, 200, 0);
        Color medGreen = new Color (0, 150, 0);
        Color darkGreen = new Color (0, 100, 0);
        
        Color blue = new Color (0, 0, 255);
        Color lightBlue = new Color (0, 0, 200);
        Color medBlue = new Color (0, 0, 150);
        Color darkBlue = new Color (0, 0, 100);
        
        Color black = new Color (0, 0, 0);
        
        for(int y = 0; y < halfHeight; y++){
            for(int x = 0; x < halfWidth; x++){
                Color pixel = image.getPixel(x,y);
            }
        }
        
        for(int y = 0; y < halfHeight; y++) {
            for(int x = halfWidth; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(halfWidth - 1 - x, y));
                image.setPixel(halfWidth - 1 - x, y, pixel);
                int brightness = (pixel.getRed());
                if(brightness <= 85) {
                    image.setPixel(x, y, black);
                }
                else if(brightness <= 127) {
                    image.setPixel(x, y, darkRed);
                }
                else if(brightness <= 170) {
                    image.setPixel(x, y, medRed);
                }
                else if(brightness <= 212) {
                    image.setPixel(x, y, lightRed);
                }
                else {
                    image.setPixel(x, y, red);
                }
            }
        }
        
        for(int y = halfHeight; y < height; y++) {
            for(int x = 0; x < halfWidth; x++) {
                Color pixel = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(x, halfHeight - 1 - y));
                image.setPixel(x, halfHeight - 1 - y, pixel);
                int brightness = (pixel.getGreen());
                if(brightness <= 85) {
                    image.setPixel(x, y, black);
                }
                else if(brightness <= 127) {
                    image.setPixel(x, y, darkGreen);
                }
                else if(brightness <= 170) {
                    image.setPixel(x, y, medGreen);
                }
                else if(brightness <= 212) {
                    image.setPixel(x, y, lightGreen);
                }
                else {
                    image.setPixel(x, y, green);
                }
            }
        }
        
        for(int y = halfHeight; y < height; y++) {
            for(int x = halfWidth; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(halfWidth - 1 - x, halfHeight - 1 - y));
                image.setPixel(halfWidth - 1 - x, halfHeight - 1 - y, pixel);
                int brightness = (pixel.getBlue());
                if(brightness <= 85) {
                    image.setPixel(x, y, black);
                }
                else if(brightness <= 127) {
                    image.setPixel(x, y, darkBlue);
                }
                else if(brightness <= 170) {
                    image.setPixel(x, y, medBlue);
                }
                else if(brightness <= 212) {
                    image.setPixel(x, y, lightBlue);
                }
                else {
                    image.setPixel(x, y, blue);
                }
            }
        }
    }
}
