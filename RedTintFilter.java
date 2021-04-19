import java.awt.Color;
/**
 * Write a description of class RedTintFilter here.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class RedTintFilter extends Filter
{

    /**
     * Constructor for objects of class RedTintFilter
     */
    public RedTintFilter(String name)
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
        Color red = new Color (255, 0, 0); 
        Color lightRed = new Color (200, 0, 0);
        Color medRed = new Color (150, 0, 0);
        Color darkRed = new Color (100, 0, 0);
        Color black = new Color(0, 0, 0);
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
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
    }
}
