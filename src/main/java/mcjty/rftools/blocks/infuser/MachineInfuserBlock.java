package mcjty.rftools.blocks.infuser;

import mcjty.lib.api.Infusable;
import mcjty.lib.container.GenericGuiContainer;
import mcjty.rftools.RFTools;
import mcjty.rftools.blocks.GenericRFToolsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class MachineInfuserBlock extends GenericRFToolsBlock<MachineInfuserTileEntity, MachineInfuserContainer> implements Infusable {

    public MachineInfuserBlock() {
        super(Material.iron, MachineInfuserTileEntity.class, MachineInfuserContainer.class, "machine_infuser", true);
    }

    @Override
    public int getGuiID() {
        return RFTools.GUI_MACHINE_INFUSER;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Class<? extends GenericGuiContainer> getGuiClass() {
        return GuiMachineInfuser.class;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean whatIsThis) {
        super.addInformation(itemStack, player, list, whatIsThis);

        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add(EnumChatFormatting.WHITE + "With this machine you can improve most other machines");
            list.add(EnumChatFormatting.WHITE + "in RFTools in various ways. This needs dimensional");
            list.add(EnumChatFormatting.WHITE + "shards.");
            list.add(EnumChatFormatting.YELLOW + "Infusing bonus: reduced power consumption.");
        } else {
            list.add(EnumChatFormatting.WHITE + RFTools.SHIFT_MESSAGE);
        }
    }
}
