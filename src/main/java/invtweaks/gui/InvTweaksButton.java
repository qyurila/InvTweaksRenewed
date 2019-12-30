package invtweaks.gui;

import java.lang.reflect.*;

import com.google.common.base.Throwables;

import invtweaks.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.screen.inventory.*;
import net.minecraft.client.gui.widget.button.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.client.config.*;
import net.minecraftforge.fml.common.*;

public class InvTweaksButton extends GuiButtonExt {
	private ResourceLocation tex;
	private int tx, ty;
	
	protected static final ResourceLocation BUTTON_SPRITES = new ResourceLocation(InvTweaksMod.MODID, "textures/gui/button_sprites.png");
	
	public InvTweaksButton(int x, int y, int tx, int ty, ResourceLocation tex, Button.IPressable handler) {
		super(x, y, 12, 12, "", handler);
		this.tex = tex;
		this.tx = tx;
		this.ty = ty;
	}
	
	//private static final Field tabPageF = ObfuscationReflectionHelper.findField(CreativeScreen.class, "tabPage");
	
	@Override
	protected void renderBg(Minecraft mc, int mouseX, int mouseY) {
		/*try {
			visible = tabPageF.getInt(null) == ItemGroup.INVENTORY.getIndex();
		} catch (Exception e) {
			Throwables.throwIfUnchecked(e);
			throw new RuntimeException(e);
		}*/
		if (visible) {
			//System.out.println("Meh!");
			mc.textureManager.bindTexture(tex);
			GuiUtils.drawTexturedModalRect(
					x, y, tx, ty,
					width, height,
					this.blitOffset);
		}
	}
}
