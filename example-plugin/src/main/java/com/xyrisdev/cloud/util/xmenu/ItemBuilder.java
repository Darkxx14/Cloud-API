package com.xyrisdev.cloud.util.xmenu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ItemBuilder {
	private final ItemStack item;

	public static ItemBuilder copyOf(ItemStack item) {
		return new ItemBuilder(item.clone());
	}

	public ItemBuilder(Material material) {
		this(new ItemStack(material));
	}

	public ItemBuilder(ItemStack item) {
		this.item = (ItemStack)Objects.requireNonNull(item, "item");
	}

	public ItemBuilder edit(Consumer<ItemStack> function) {
		function.accept(this.item);
		return this;
	}

	public ItemBuilder meta(Consumer<ItemMeta> metaConsumer) {
		return this.edit((item) -> {
			ItemMeta meta = item.getItemMeta();
			if (meta != null) {
				metaConsumer.accept(meta);
				item.setItemMeta(meta);
			}

		});
	}

	public <T extends ItemMeta> ItemBuilder meta(Class<T> metaClass, Consumer<T> metaConsumer) {
		return this.meta((meta) -> {
			if (metaClass.isInstance(meta)) {
				metaConsumer.accept((T) metaClass.cast(meta));
			}

		});
	}

	public ItemBuilder type(Material material) {
		return this.edit((item) -> {
			item.setType(material);
		});
	}

	public ItemBuilder data(int data) {
		return this.durability((short)data);
	}

	public ItemBuilder durability(short durability) {
		return this.edit((item) -> {
			item.setDurability(durability);
		});
	}

	public ItemBuilder amount(int amount) {
		return this.edit((item) -> {
			item.setAmount(amount);
		});
	}

	public ItemBuilder enchant(Enchantment enchantment) {
		return this.enchant(enchantment, 1);
	}

	public ItemBuilder enchant(Enchantment enchantment, int level) {
		return this.meta((meta) -> {
			meta.addEnchant(enchantment, level, true);
		});
	}

	public ItemBuilder removeEnchant(Enchantment enchantment) {
		return this.meta((meta) -> {
			meta.removeEnchant(enchantment);
		});
	}

	public ItemBuilder name(String name) {
		return this.meta((meta) -> {
			meta.setDisplayName(name);
		});
	}

	public ItemBuilder lore(String lore) {
		return this.lore(Collections.singletonList(lore));
	}

	public ItemBuilder lore(String... lore) {
		return this.lore(Arrays.asList(lore));
	}

	public ItemBuilder lore(List<String> lore) {
		return this.meta((meta) -> {
			meta.setLore(lore);
		});
	}

	public ItemBuilder addLore(String line) {
		return this.meta((meta) -> {
			List<String> lore = meta.getLore();
			if (lore == null) {
				meta.setLore(Collections.singletonList(line));
			} else {
				lore.add(line);
				meta.setLore(lore);
			}
		});
	}

	public ItemBuilder addLore(String... lines) {
		return this.addLore(Arrays.asList(lines));
	}

	public ItemBuilder addLore(List<String> lines) {
		return this.meta((meta) -> {
			List<String> lore = meta.getLore();
			if (lore == null) {
				meta.setLore(lines);
			} else {
				lore.addAll(lines);
				meta.setLore(lore);
			}
		});
	}

	public ItemBuilder flags(ItemFlag... flags) {
		return this.meta((meta) -> {
			meta.addItemFlags(flags);
		});
	}

	public ItemBuilder flags() {
		return this.flags(ItemFlag.values());
	}

	public ItemBuilder removeFlags(ItemFlag... flags) {
		return this.meta((meta) -> {
			meta.removeItemFlags(flags);
		});
	}

	public ItemBuilder removeFlags() {
		return this.removeFlags(ItemFlag.values());
	}

	public ItemBuilder armorColor(Color color) {
		return this.meta(LeatherArmorMeta.class, (meta) -> {
			meta.setColor(color);
		});
	}

	public ItemStack build() {
		return this.item;
	}
}
