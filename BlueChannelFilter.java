import java.awt.Color;
/**
 * Write a description of class BlueChannelFilter here.
 *
 * @author Jessica Nagar
 * @version 2021.04.19
 */
public class BlueChannelFilter extends Filter
{

    /**
     * Constructor for objects of class BlueChannelFilter
     */
    public BlueChannelFilter(String name)
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
                int brightness = (pixel.getBlue());
                if(brightness <= 85) {
                    image.setPixel(x, y, Color.BLACK);
                }
                else if(brightness <= 170) {
                    image.setPixel(x, y, Color.GRAY);
                }
                else {
                    image.setPixel(x, y, Color.WHITE);
                }
            }
        }
    }
}
