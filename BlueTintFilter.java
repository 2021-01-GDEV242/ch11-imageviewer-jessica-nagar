import java.awt.Color;
/**
 * Write a description of class BlueTintFilter here.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class BlueTintFilter extends Filter
{

    /**
     * Constructor for objects of class BlueTintFilter
     */
    public BlueTintFilter(String name)
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
        Color blue = new Color (0, 0, 255); 
        Color lightBlue = new Color (0, 0, 200);
        Color medBlue = new Color (0, 0, 150);
        Color darkBlue = new Color (0, 0, 100);
        Color black = new Color(0, 0, 0);
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int brightness = (pixel.getRed());
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
