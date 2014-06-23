package main.nuclearcubes.blocks.reactor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.nuclearcubes.ModInformation;
import main.nuclearcubes.NuclearCubes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockReactorGlass extends Block {

	protected IIcon[] icons = new IIcon[16];

	public BlockReactorGlass() {
		super(Material.glass);
		this.setBlockName(ModInformation.ID + ".reactor.glass");
		this.setBlockTextureName(ModInformation.ID + ":machines/reactor/reactorGlass_0");
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(NuclearCubes.tabNuclearCubes);
		this.setHardness(7);
		this.renderAsNormalBlock();
		this.getRenderBlockPass();
		this.shouldSideBeRendered();
		if(shouldGlassGlow()) {
			this.setLightLevel(1F);
			this.setLightOpacity(1);
		}
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item id, CreativeTabs tab, List list) {
		for (int i = 0; i < 2; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 0;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean shouldSideBeRendered() {
		return true;
	}

	public boolean shouldGlassGlow() {
		return true;
	}

//  ALMOST WORKS, NOW :D THE INSIDES JUST KEEP RENDERING AND I DUNNO WHY D:

//	@Override
//	@SideOnly(Side.CLIENT)
//	public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
//		return par1IBlockAccess.getBlockMetadata(par2, par3, par4) == 15 ? icons[0] : getConnectedBlockTexture(par1IBlockAccess, par2, par3, par4, par5, icons);
//	}
//
//	public boolean shouldConnectToBlock(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, Block par5, int par6) {
//		return par5 == (Block) this;
//	}
//
//	public IIcon getConnectedBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5, IIcon[] icons) {
//		if (!ConfigHandler.useConnectedTextures) {
//			return icons[0];
//		}
//
//		boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;
//
//		switch (par5) {
//			case 0:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[11];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[12];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[13];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[14];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[5];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[6];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[8];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[10];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[7];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[9];
//				} else if (isOpenDown) {
//					return icons[3];
//				} else if (isOpenUp) {
//					return icons[4];
//				} else if (isOpenLeft) {
//					return icons[2];
//				} else if (isOpenRight) {
//					return icons[1];
//				}
//				break;
//			case 1:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[11];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[12];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[13];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[14];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[5];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[6];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[8];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[10];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[7];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[9];
//				} else if (isOpenDown) {
//					return icons[3];
//				} else if (isOpenUp) {
//					return icons[4];
//				} else if (isOpenLeft) {
//					return icons[2];
//				} else if (isOpenRight) {
//					return icons[1];
//				}
//				break;
//			case 2:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[13];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[14];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[11];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[12];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[6];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[5];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[9];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[10];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[7];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[8];
//				} else if (isOpenDown) {
//					return icons[1];
//				} else if (isOpenUp) {
//					return icons[2];
//				} else if (isOpenLeft) {
//					return icons[4];
//				} else if (isOpenRight) {
//					return icons[3];
//				}
//				break;
//			case 3:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[13];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[14];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[11];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[12];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[6];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[5];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[9];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[10];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[7];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[8];
//				} else if (isOpenDown) {
//					return icons[1];
//				} else if (isOpenUp) {
//					return icons[2];
//				} else if (isOpenLeft) {
//					return icons[4];
//				} else if (isOpenRight) {
//					return icons[3];
//				}
//				break;
//			case 4:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[14];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[13];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[11];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[12];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[6];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[5];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[10];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[9];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[8];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[7];
//				} else if (isOpenDown) {
//					return icons[1];
//				} else if (isOpenUp) {
//					return icons[2];
//				} else if (isOpenLeft) {
//					return icons[3];
//				} else if (isOpenRight) {
//					return icons[4];
//				}
//				break;
//			case 5:
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
//					isOpenDown = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
//					isOpenUp = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
//					isOpenLeft = true;
//				}
//
//				if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
//					isOpenRight = true;
//				}
//
//				if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[15];
//				} else if (isOpenUp && isOpenDown && isOpenLeft) {
//					return icons[14];
//				} else if (isOpenUp && isOpenDown && isOpenRight) {
//					return icons[13];
//				} else if (isOpenUp && isOpenLeft && isOpenRight) {
//					return icons[11];
//				} else if (isOpenDown && isOpenLeft && isOpenRight) {
//					return icons[12];
//				} else if (isOpenDown && isOpenUp) {
//					return icons[6];
//				} else if (isOpenLeft && isOpenRight) {
//					return icons[5];
//				} else if (isOpenDown && isOpenLeft) {
//					return icons[10];
//				} else if (isOpenDown && isOpenRight) {
//					return icons[9];
//				} else if (isOpenUp && isOpenLeft) {
//					return icons[8];
//				} else if (isOpenUp && isOpenRight) {
//					return icons[7];
//				} else if (isOpenDown) {
//					return icons[1];
//				} else if (isOpenUp) {
//					return icons[2];
//				} else if (isOpenLeft) {
//					return icons[3];
//				} else if (isOpenRight) {
//					return icons[4];
//				}
//				break;
//		}
//
//		return icons[0];
//	}
//
//	@Override
//	public void registerBlockIcons (IIconRegister par1IconRegister) {
//		icons[0] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_0");
//		icons[1] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_1");
//		icons[2] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_2");
//		icons[3] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_3");
//		icons[4] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_4");
//		icons[5] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_5");
//		icons[6] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_6");
//		icons[7] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_7");
//		icons[8] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_8");
//		icons[9] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_9");
//		icons[10] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_10");
//		icons[11] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_11");
//		icons[12] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_12");
//		icons[13] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_13");
//		icons[14] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_14");
//		icons[15] = par1IconRegister.registerIcon(ModInformation.ID + ":machines/reactor/reactorGlass_15");
//	}
}
