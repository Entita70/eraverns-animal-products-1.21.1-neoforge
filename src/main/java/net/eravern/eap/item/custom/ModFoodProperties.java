package net.eravern.eap.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_HORSE_STEAK = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.4f).build();
    public static final FoodProperties COOKED_HORSE_STEAK = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.9f).build();
    public static final FoodProperties RAW_WILD_MEAT = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build();
    public static final FoodProperties COOKED_WILD_MEAT = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.7f).build();
    public static final FoodProperties SQUID_TENTACLE = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).fast().build();
    public static final FoodProperties COOKED_SQUID_TENTACLE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6f).fast().build();
    public static final FoodProperties BEE = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).effect(new MobEffectInstance(MobEffects.POISON, 200, 0), 0.7f).build();
    public static final FoodProperties COOKED_BEE = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.7f).build();
    public static final FoodProperties FROG_LEG = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.2f).fast().effect(new MobEffectInstance(MobEffects.HUNGER, 400, 0), 0.8f).build();
    public static final FoodProperties COOKED_FROG_LEG = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.5f).fast().build();
    public static final FoodProperties COLD_STRIDER_SHANK = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 0.9f).build();
    public static final FoodProperties HOT_STRIDER_SHANK = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.8f).build();
    public static final FoodProperties RAW_ANCIENT_MEATCHOP = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6f).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 800, 0), 0.7f).build();
    public static final FoodProperties COOKED_ANCIENT_MEATCHOP = (new FoodProperties.Builder()).nutrition(9).saturationModifier(1.1f).build();
    public static final FoodProperties RAW_CAMEL_MEAT = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_CAMEL_MEAT = (new FoodProperties.Builder()).nutrition(7).saturationModifier(0.9f).build();
    public static final FoodProperties RAW_CARNIVORE_MEAT = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.POISON, 200, 0), 0.8f).effect(new MobEffectInstance(MobEffects.HUNGER, 800, 0), 0.9f).build();
    public static final FoodProperties COOKED_CARNIVORE_MEAT = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.5f).build();
    public static final FoodProperties AXOLOTL_TAIL = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build();
    public static final FoodProperties COOKED_AXOLOTL_TAIL = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.6f).build();

}
