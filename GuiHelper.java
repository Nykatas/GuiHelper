package your.package.here;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class GuiHelper {

    private static Minecraft mc = Minecraft.getMinecraft();

    public static void drawPicture(int x, int y, int width, int height, String location) {
        ResourceLocation loc = new ResourceLocation(location);
        mc.getTextureManager().bindTexture(loc);
        Gui.drawModalRectWithCustomSizedTexture(x, y, 0, 0, width, height, width, height);
    }

    public static void drawBackgroundPicture(int width, int height, String location) {
        ScaledResolution scaledResolution = new ScaledResolution(mc);
        ResourceLocation loc = new ResourceLocation(location);
        mc.getTextureManager().bindTexture(loc);
        Gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight(), scaledResolution.getScaledWidth(), scaledResolution.getScaledHeight());
        Gui.drawRect(0, 0, width, height, 0x40000000);
    }

}
