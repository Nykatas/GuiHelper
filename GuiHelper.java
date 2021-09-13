package your.package.here;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class GuiHelper {

    private static Minecraft mc = Minecraft.getMinecraft();
    public GuiHelper() {}
    
    /**
     * Renders a picture anywhere on the screen.
     *
     * @param x | Specify the x position of the image.
     * @param y | Specify the y position of the image.
     * @param width | Specify the width of the image.
     * @param height | Specify the height of the image.
     * @param location | Specify the location of the image.
     *
     */
    public void drawPicture(int x, int y, int width, int height, ResourceLocation location) {
        ResourceLocation loc = new ResourceLocation(location);
        mc.getTextureManager().bindTexture(loc);
        Gui.drawModalRectWithCustomSizedTexture(x, y, 0, 0, width, height, width, height);
    }

    /**
     * Used to draw a background picture on your screen.
     * 
     * @param width | Used tp specify the height of the image. ( Normally #getScaledWidth() )
     * @param height | Used tp specify the height of the image. ( Normally #getScaledHeight() )
     * @param location | Used to specify the location of the image.
     *                 
     */
    public void drawBackgroundPicture(int width, int height, ResourceLocation location) {
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        ResourceLocation loc = new ResourceLocation(location);
        mc.getTextureManager().bindTexture(loc);
        Gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight(), scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight());
        Gui.drawRect(0, 0, width, height, 0x40000000);
    }
    
}
