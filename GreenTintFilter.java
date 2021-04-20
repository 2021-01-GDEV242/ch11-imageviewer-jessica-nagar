import java.awt.Color;
/**
 * An image filter to make the image different shades of green.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class GreenTintFilter extends Filter
{

    /**
     * Constructor for objects of class GreenTintFilter
     * @param name The name of the filter.
     */
    public GreenTintFilter(String name)
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
        Color green = new Color (0, 255, 0); 
        Color lightGreen = new Color (0, 200, 0);
        Color medGreen = new Color (0, 150, 0);
        Color darkGreen = new Color (0, 100, 0);
        Color black = new Color(0, 0, 0);
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int brightness = (pixel.getRed());
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
    }
}
