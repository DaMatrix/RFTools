package mcjty.rftools.setup;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

// @todo 1.14
public class GuiProxy implements IGuiHandler {

    public static final String SHIFT_MESSAGE = "<Press Shift>";
    /**
     * This is used to keep track of GUIs that we make
     */
    private static int modGuiIndex = 0;
    public static final int GUI_REDSTONE_RECEIVER = modGuiIndex++;
    public static final int GUI_LOCATOR = modGuiIndex++;
    public static final int GUI_PROJECTOR = modGuiIndex++;
    public static final int GUI_SCANNER = modGuiIndex++;
    public static final int GUI_COMPOSER = modGuiIndex++;
    public static final int GUI_ELEVATOR = modGuiIndex++;
    public static final int GUI_STORAGE_TERMINAL_SCANNER = modGuiIndex++;
    public static final int GUI_STORAGE_TERMINAL = modGuiIndex++;
    public static final int GUI_SENSOR = modGuiIndex++;
    public static final int GUI_INVCHECKER = modGuiIndex++;
    public static final int GUI_BOOSTER = modGuiIndex++;
    public static final int GUI_STORAGE_SCANNER = modGuiIndex++;
    public static final int GUI_ENDERMONITOR = modGuiIndex++;
    public static final int GUI_PEARL_INJECTOR = modGuiIndex++;
    public static final int GUI_ENDERGENIC = modGuiIndex++;
    public static final int GUI_LIST_BLOCKS = modGuiIndex++;
    public static final int GUI_DEVELOPERS_DELIGHT = modGuiIndex++;
    public static final int GUI_SECURITY_MANAGER = modGuiIndex++;
    public static final int GUI_ITEMFILTER = modGuiIndex++;
    public static final int GUI_BLOCK_PROTECTOR = modGuiIndex++;
    public static final int GUI_SPAWNER = modGuiIndex++;
    public static final int GUI_MATTER_BEAMER = modGuiIndex++;
    public static final int GUI_ENVIRONMENTAL_CONTROLLER = modGuiIndex++;
    public static final int GUI_SHIELD = modGuiIndex++;
    public static final int GUI_RF_MONITOR = modGuiIndex++;
    public static final int GUI_LIQUID_MONITOR = modGuiIndex++;
    public static final int GUI_RELAY = modGuiIndex++;
    public static final int GUI_POWERCELL = modGuiIndex++;
    public static final int GUI_CHAMBER_DETAILS = modGuiIndex++;
    public static final int GUI_SHAPECARD_COMPOSER = modGuiIndex++;
    public static final int GUI_SHAPECARD = modGuiIndex++;
    public static final int GUI_BUILDER = modGuiIndex++;
    public static final int GUI_MACHINE_INFUSER = modGuiIndex++;
    public static final int GUI_ANALOG = modGuiIndex++;
    public static final int GUI_THREE_LOGIC = modGuiIndex++;
    public static final int GUI_TIMER = modGuiIndex++;
    public static final int GUI_SEQUENCER = modGuiIndex++;
    public static final int GUI_COUNTER = modGuiIndex++;
    public static final int GUI_SCREENCONTROLLER = modGuiIndex++;
    public static final int GUI_SCREEN = modGuiIndex++;
    public static final int GUI_TELEPORTPROBE = modGuiIndex++;
    public static final int GUI_ADVANCEDPORTER = modGuiIndex++;
    public static final int GUI_MATTER_TRANSMITTER = modGuiIndex++;
    public static final int GUI_MATTER_RECEIVER = modGuiIndex++;
    public static final int GUI_DIALING_DEVICE = modGuiIndex++;
    public static final int GUI_REMOTE_STORAGESCANNER_ITEM = modGuiIndex++;
    public static final int GUI_MODULAR_STORAGE_ITEM = modGuiIndex++;
    public static final int GUI_REMOTE_STORAGE_ITEM = modGuiIndex++;
    public static final int GUI_MODIFIER_MODULE = modGuiIndex++;
    public static final int GUI_STORAGE_FILTER = modGuiIndex++;
    public static final int GUI_REMOTE_STORAGE = modGuiIndex++;
    public static final int GUI_MODULAR_STORAGE = modGuiIndex++;
    public static final int GUI_CRAFTER = modGuiIndex++;
    public static final int GUI_COALGENERATOR = modGuiIndex++;
    public static final int GUI_MANUAL_SHAPE = modGuiIndex++;
    /**
     * Set our custom inventory Gui index to the next available Gui index
     */
    public static final int GUI_MANUAL_MAIN = modGuiIndex++;

    @Override
    public Object getServerGuiElement(int guiid, PlayerEntity PlayerEntity, World world, int x, int y, int z) {
//        if (guiid == GUI_MANUAL_MAIN || guiid == GUI_MANUAL_SHAPE || guiid == GUI_TELEPORTPROBE || guiid == GUI_ADVANCEDPORTER
//                || guiid == GUI_SHAPECARD || guiid == GUI_SHAPECARD_COMPOSER
//                || guiid == GUI_CHAMBER_DETAILS || guiid == GUI_DEVELOPERS_DELIGHT || guiid == GUI_LIST_BLOCKS) {
//            return null;
//        } else if (guiid == GUI_REMOTE_STORAGE_ITEM) {
//            return new RemoteStorageItemContainer(PlayerEntity);
//        } else if (guiid == GUI_REMOTE_STORAGESCANNER_ITEM) {
//            // We are in a tablet
//            ItemStack tablet = PlayerEntity.getHeldItemMainhand();
//            int monitordim = RFToolsTools.getDimensionFromModule(tablet);
//            BlockPos pos = RFToolsTools.getPositionFromModule(tablet);
//            ServerWorld w = DimensionManager.getWorld(monitordim);
//            if (w == null) {
//                return null;
//            }
//            TileEntity te = w.getTileEntity(pos);
//            if (!(te instanceof StorageScannerTileEntity)) {
//                return null;
//            }
//            return new StorageScannerContainer(PlayerEntity, (IInventory) te);
//        } else if (guiid == GUI_MODULAR_STORAGE_ITEM) {
//            return new ModularStorageItemContainer(PlayerEntity);
//        } else if (guiid == GUI_STORAGE_FILTER) {
//            return new StorageFilterContainer(PlayerEntity);
//        } else if (guiid == GUI_MODIFIER_MODULE) {
//            return new ModifierContainer(PlayerEntity);
//        }
////        if (guiid == RFTools.GUI_LIST_BLOCKS || guiid == RFTools.GUI_DEVELOPERS_DELIGHT ||
////                guiid == RFTools.GUI_MANUAL_DIMENSION || guiid == RFTools.GUI_CHAMBER_DETAILS || guiid == RFTools.GUI_SHAPECARD) {
////            return null;
////        }
//
//        BlockPos pos = new BlockPos(x, y, z);
//        Block block = world.getBlockState(pos).getBlock();
//        if (block instanceof BaseBlock) {
//            BaseBlock<?, ?> BaseBlock = (BaseBlock<?, ?>) block;
//            TileEntity te = world.getTileEntity(pos);
//            return BaseBlock.createServerContainer(PlayerEntity, te);
//        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int guiid, PlayerEntity PlayerEntity, World world, int x, int y, int z) {
//        if (guiid == GUI_MANUAL_MAIN) {
//            return new GuiRFToolsManual(GuiRFToolsManual.MANUAL_MAIN);
//        } else if (guiid == GUI_MANUAL_SHAPE) {
//            return new GuiRFToolsManual(GuiRFToolsManual.MANUAL_SHAPE);
//        } else if (guiid == GUI_TELEPORTPROBE) {
//            return new GuiTeleportProbe();
//        } else if (guiid == GUI_ADVANCEDPORTER) {
//            return new GuiAdvancedPorter();
//        } else if (guiid == GUI_LIST_BLOCKS) {
//            return new GuiNetworkMonitor();
//        } else if (guiid == GUI_DEVELOPERS_DELIGHT) {
//            return new GuiDevelopersDelight();
//        } else if (guiid == GUI_REMOTE_STORAGE_ITEM) {
//            return new GuiModularStorage(new RemoteStorageItemContainer(PlayerEntity));
//        } else if (guiid == GUI_REMOTE_STORAGESCANNER_ITEM) {
//            ItemStack tablet = PlayerEntity.getHeldItemMainhand();
//            int monitordim = RFToolsTools.getDimensionFromModule(tablet);
//            BlockPos pos = RFToolsTools.getPositionFromModule(tablet);
//            StorageScannerTileEntity te = new StorageScannerTileEntity(PlayerEntity, monitordim) {
//                @Override
//                public BlockPos getCraftingGridContainerPos() {
//                    // We are a handheld so we return a null pos for the craftinggrid
//                    return null;
//                }
//
//                @Override
//                public boolean isOpenWideView() {
//                    TileEntity realTe = RFTools.proxy.getClientWorld().getTileEntity(pos);
//                    if (realTe instanceof StorageScannerTileEntity) {
//                        return ((StorageScannerTileEntity) realTe).isOpenWideView();
//                    }
//                    return true;
//                }
//
//                @Override
//                public BlockPos getStorageScannerPos() {
//                    return pos;
//                }
//            };
//            // The position of the actual storage scanner is set on the dummy te
//            te.setPos(pos);
//            return new GuiStorageScanner(te, new StorageScannerContainer(PlayerEntity, te));
//        } else if (guiid == GUI_MODULAR_STORAGE_ITEM) {
//            return new GuiModularStorage(new ModularStorageItemContainer(PlayerEntity));
//        } else if (guiid == GUI_STORAGE_FILTER) {
//            return new GuiStorageFilter(new StorageFilterContainer(PlayerEntity));
//        } else if (guiid == GUI_MODIFIER_MODULE) {
//            return new GuiModifier(new ModifierContainer(PlayerEntity));
//        } else if (guiid == GUI_SHAPECARD) {
//            return new GuiShapeCard(false);
//        } else if (guiid == GUI_SHAPECARD_COMPOSER) {
//            return new GuiShapeCard(true);
//        } else if (guiid == GUI_CHAMBER_DETAILS) {
//            return new GuiChamberDetails();
//        }
////        if (guiid == RFTools.GUI_LIST_BLOCKS) {
////            return new GuiNetworkMonitor();
////        } else if (guiid == RFTools.GUI_DEVELOPERS_DELIGHT) {
////            return new GuiDevelopersDelight();
////        } else if (guiid == RFTools.GUI_MANUAL_DIMENSION) {
////            return new GuiRFToolsManual(GuiRFToolsManual.MANUAL_DIMENSION);
////        }
//
//        BlockPos pos = new BlockPos(x, y, z);
//        Block block = world.getBlockState(pos).getBlock();
//        if (block instanceof BaseBlock) {
//            BaseBlock<?, ?> BaseBlock = (BaseBlock<?, ?>) block;
//            TileEntity te = world.getTileEntity(pos);
//            return BaseBlock.createClientGui(PlayerEntity, te);
//        }
        return null;
    }
}
