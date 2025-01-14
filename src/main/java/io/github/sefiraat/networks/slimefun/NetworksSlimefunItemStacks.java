package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.slimefun.network.NetworkMemoryWiper;
import io.github.sefiraat.networks.slimefun.tools.NetworkCard;
import io.github.sefiraat.networks.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.text.MessageFormat;

/**
 * Creating SlimefunItemstacks here due to some items being created in Enums so this will
 * act as a one-stop-shop for the stacks themselves.
 */
@UtilityClass
public class NetworksSlimefunItemStacks {

    // Materials
    public static final SlimefunItemStack OPTIC_GLASS;
    public static final SlimefunItemStack OPTIC_CABLE;
    public static final SlimefunItemStack OPTIC_STAR;
    public static final SlimefunItemStack RADIOACTIVE_OPTIC_STAR;

    // Network Items
    public static final SlimefunItemStack NETWORK_CONTROLLER;
    public static final SlimefunItemStack NETWORK_BRIDGE;
    public static final SlimefunItemStack NETWORK_MONITOR;
    public static final SlimefunItemStack NETWORK_IMPORT;
    public static final SlimefunItemStack NETWORK_EXPORT;
    public static final SlimefunItemStack NETWORK_GRABBER;
    public static final SlimefunItemStack NETWORK_PUSHER;
    public static final SlimefunItemStack NETWORK_PURGER;
    public static final SlimefunItemStack NETWORK_GRID;
    public static final SlimefunItemStack NETWORK_CRAFTING_GRID;
    public static final SlimefunItemStack NETWORK_CELL;
    public static final SlimefunItemStack NETWORK_MEMORY_SHELL;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_1;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_2;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_3;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_4;

    // Tools
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_1;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_2;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_3;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_4;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_5;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_6;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_7;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_8;
    public static final SlimefunItemStack NETWORK_PROBE;

    static {

        OPTIC_GLASS = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_GLASS",
            new ItemStack(Material.GLASS),
            Theme.CRAFTING,
            "Optic Glass",
            "A simple glass that is able to",
            "transfer small bits of information."
        );

        OPTIC_CABLE = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_CABLE",
            new ItemStack(Material.STRING),
            Theme.CRAFTING,
            "Optic Cable",
            "A simple wire that is able to",
            "transfer large bits of information."
        );

        OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_STAR",
            new ItemStack(Material.NETHER_STAR),
            Theme.CRAFTING,
            "Optic Star",
            "A crystalline star structure that",
            "can transfer large bits of information."
        );

        RADIOACTIVE_OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_RADIOACTIVE_OPTIC_STAR",
            getPreEnchantedItemStack(Material.NETHER_STAR, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "Radioactive Optic Star",
            "A crystalline star structure that",
            "can store insane amounts of information."
        );

        NETWORK_CONTROLLER = Theme.themedSlimefunItemStack(
            "NTW_CONTROLLER",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.MACHINE,
            "Network Controller"
            , "The Network controller is the brain",
            "for the whole network. Max 1 per network."
        );

        NETWORK_BRIDGE = Theme.themedSlimefunItemStack(
            "NTW_BRIDGE",
            new ItemStack(Material.WHITE_STAINED_GLASS),
            Theme.MACHINE,
            "Network Bridge"
            , "The bridge allows you to cheaply",
            "connect network objects together."
        );

        NETWORK_MONITOR = Theme.themedSlimefunItemStack(
            "NTW_MONITOR",
            new ItemStack(Material.GREEN_STAINED_GLASS),
            Theme.MACHINE,
            "Network Monitor",
            "The Network Monitor allows simple",
            "import/export interaction with adjacent",
            "objects.",
            "",
            "Currently Supports:",
            "Infinity Barrels"
        );

        NETWORK_IMPORT = Theme.themedSlimefunItemStack(
            "NTW_IMPORT",
            new ItemStack(Material.RED_STAINED_GLASS),
            Theme.MACHINE,
            "Network Importer",
            "The Network Importer brings any",
            "item inside it into the network, up",
            "to 9 stacks per SF tick.",
            "Accepts items in from cargo."
        );

        NETWORK_EXPORT = Theme.themedSlimefunItemStack(
            "NTW_EXPORT",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.MACHINE,
            "Network Exporter",
            "The Network Exporter can be set to",
            "constantly export 1 stack of any",
            "given item.",
            "Accepts item withdrawal from cargo."
        );

        NETWORK_GRABBER = Theme.themedSlimefunItemStack(
            "NTW_GRABBER",
            new ItemStack(Material.MAGENTA_STAINED_GLASS),
            Theme.MACHINE,
            "Network Grabber",
            "The Network Grabber will try",
            "to grab the first item it finds",
            "from within the selected machine."
        );

        NETWORK_PUSHER = Theme.themedSlimefunItemStack(
            "NTW_PUSHER",
            new ItemStack(Material.BROWN_STAINED_GLASS),
            Theme.MACHINE,
            "Network Pusher",
            "The Network Pusher will try",
            "to push a matching item from a",
            "given item into the chosen machine."
        );

        NETWORK_PURGER = Theme.themedSlimefunItemStack(
            "NTW_TRASH",
            new ItemStack(Material.OBSERVER),
            Theme.MACHINE,
            "Network Purger",
            "The Network Purger will pull",
            "matching items from the network",
            "and instantly void them.",
            "Use with great care!"
        );

        NETWORK_GRID = Theme.themedSlimefunItemStack(
            "NTW_GRID",
            new ItemStack(Material.NOTE_BLOCK),
            Theme.MACHINE,
            "Network Grid",
            "The Network Grid shows you all",
            "the items you have in the network",
            "and lets you insert or withdraw",
            "directly."
        );

        NETWORK_CRAFTING_GRID = Theme.themedSlimefunItemStack(
            "NTW_CRAFTING_GRID",
            new ItemStack(Material.REDSTONE_LAMP),
            Theme.MACHINE,
            "Network Crafting Grid",
            "The Network Crafting Grid acts",
            "like a normal grid but displays less",
            "items but allows crafting using items",
            "directly from the network."
        );

        NETWORK_CELL = Theme.themedSlimefunItemStack(
            "NTW_CELL",
            new ItemStack(Material.HONEYCOMB_BLOCK),
            Theme.MACHINE,
            "Network Cell",
            "The Network Cell is a large",
            "(double chest) inventory that can",
            "be accessed both from the network",
            "and in the world."
        );

        NETWORK_MEMORY_SHELL = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_SHELL",
            new ItemStack(Material.DEEPSLATE_TILES),
            Theme.MACHINE,
            "Network Memory Shell",
            "The Network Shell is a block",
            "that provides the network access",
            "to the memory cards inside of it."
        );

        NETWORK_MEMORY_WIPER_1 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_1",
            new ItemStack(Material.BASALT),
            Theme.MACHINE,
            "Network Memory Wiper α",
            "The Network Wiper is a block",
            "that will slowly try to empty a",
            "memory card's content back into",
            "the network.",
            "",
            MessageFormat.format("{0}Speed: {1}{2} Stack(s)/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.STACKS_TO_PUSH[0])
        );

        NETWORK_MEMORY_WIPER_2 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_2",
            new ItemStack(Material.POLISHED_BASALT),
            Theme.MACHINE,
            "Network Memory Wiper β",
            "The Network Wiper is a block",
            "that will slowly try to empty a",
            "memory card's content back into",
            "the network.",
            "",
            MessageFormat.format("{0}Speed: {1}{2} Stack(s)/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.STACKS_TO_PUSH[1])
        );

        NETWORK_MEMORY_WIPER_3 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_3",
            new ItemStack(Material.SMOOTH_BASALT),
            Theme.MACHINE,
            "Network Memory Wiper γ",
            "The Network Wiper is a block",
            "that will slowly try to empty a",
            "memory card's content back into",
            "the network.",
            "",
            MessageFormat.format("{0}Speed: {1}{2} Stack(s)/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.STACKS_TO_PUSH[2])
        );

        NETWORK_MEMORY_WIPER_4 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_4",
            new ItemStack(Material.POLISHED_BLACKSTONE),
            Theme.MACHINE,
            "Network Memory Wiper δ",
            "The Network Wiper is a block",
            "that will slowly try to empty a",
            "memory card's content back into",
            "the network.",
            "",
            MessageFormat.format("{0}Speed: {1}{2} Stack(s)/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.STACKS_TO_PUSH[3])
        );

        NETWORK_MEMORY_CARD_1 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_1",
            new ItemStack(Material.LIGHT_GRAY_DYE),
            Theme.TOOL,
            "Network Memory Card (4K)",
            "Stores " + NetworkCard.SIZES[0] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_2 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_2",
            new ItemStack(Material.GRAY_DYE),
            Theme.TOOL,
            "Network Memory Card (32K)",
            "Stores " + NetworkCard.SIZES[1] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_3 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_3",
            new ItemStack(Material.LIME_DYE),
            Theme.TOOL,
            "Network Memory Card (262K)",
            "Stores " + NetworkCard.SIZES[2] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_4 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_4",
            new ItemStack(Material.GREEN_DYE),
            Theme.TOOL,
            "Network Memory Card (2M)",
            "Stores " + NetworkCard.SIZES[3] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_5 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_5",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            Theme.TOOL,
            "Network Memory Card (16M)",
            "Stores " + NetworkCard.SIZES[4] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_6 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_6",
            new ItemStack(Material.BLUE_DYE),
            Theme.TOOL,
            "Network Memory Card (134M)",
            "Stores " + NetworkCard.SIZES[5] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_7 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_7",
            new ItemStack(Material.PINK_DYE),
            Theme.TOOL,
            "Network Memory Card (1B)",
            "Stores " + NetworkCard.SIZES[6] + " items",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_MEMORY_CARD_8 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_8",
            new ItemStack(Material.RED_DYE),
            Theme.TOOL,
            "Network Memory Card (∞)",
            "Stores ∞ items... almost",
            "",
            "Right click with an item in your",
            "offhand to set the card's item.",
            "Card must be empty to set item.",
            "",
            Theme.WARNING + "Voids extra incoming items.",
            Theme.WARNING + "Upgrading will wipe memory.",
            "",
            Theme.WARNING + "Empty"
        );

        NETWORK_PROBE = Theme.themedSlimefunItemStack(
            "NTW_PROBE",
            new ItemStack(Material.CLOCK),
            Theme.TOOL,
            "Network Probe",
            "When used on a controller, this will",
            "show the nodes on the network."
        );
    }

    @Nonnull
    @SafeVarargs
    public static ItemStack getPreEnchantedItemStack(Material material, boolean hide, @Nonnull Pair<Enchantment, Integer>... enchantments) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        for (Pair<Enchantment, Integer> pair : enchantments) {
            itemMeta.addEnchant(pair.getFirstValue(), pair.getSecondValue(), true);
        }
        if (hide) {
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
