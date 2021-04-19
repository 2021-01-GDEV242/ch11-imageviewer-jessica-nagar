import java.awt.Color;
/**
 * Write a description of class RedChannelFilter here.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class RedChannelFilter extends Filter
{

    /**
     * Constructor for objects of class RedChannelFilter
     */
    public RedChannelFilter(String name)
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
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int brightness = (pixel.getRed());
                if(brightness <= 85) {
                    image.setPixel(x, y, Color.BLACK);
                }
                else if(brightness <= 127) {
                    image.setPixel(x, y, Color.DARK_GRAY);
                }
                else if(brightness <= 170) {
                    image.setPixel(x, y, Color.GRAY);
                }
                else if(brightness <= 212) {
                    image.setPixel(x, y, Color.LIGHT_GRAY);
                }
                else {
                    image.setPixel(x, y, Color.WHITE);
                }
            }
        }
    }
}
