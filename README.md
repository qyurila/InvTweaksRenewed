# Inventory Twea*Q*s Renewed

> Inventory Tweaks Renewed but with Quark's sorting order

## Note

- This is not intended to be released as a separate mod; it's just **a quick drop-in replacement patch** for *Inventory Tweaks Renewed*.
- This is for the people who plays 1.16.5 modpacks with *Inventory Tweaks Renewed* and:
  - prefer *Quark*'s sorting system but don't like it's incompatibility with other mods
  - don't like ITR's sorting order but too lazy to replace it with another and configure all the things again

## Why I Made This

[Inventory Tweaks Renewed](https://www.curseforge.com/minecraft/mc-mods/inventory-tweaks-renewed)
is a great mod that many 1.16.5 modpacks (at least the ones by FTB) contains and offers as a primary inventory sorter.
(e.g. FTB University 1.16 which I am currently playing).
I think the reason is that it works with many other mods' GUIs without hassle.
One of the problems though is that its wacky sorting order.
It sorts items [by registry name](https://www.reddit.com/r/feedthebeast/comments/ej3rm2/comment/fcx9yar).
it seems that it was somewhat draft implementation and author meant to change later, but the fix never happened.

Meanwhile, I really love [Quark](https://quarkmod.net)'s inventory sort feature.
It is not just depend on item name, id or creative tab order and call it a day.
It has quite sophisticated sorting logic that takes care of food's filling, enchantments tier, etc.
But sadly, in many Minecraft 1.16.5 modpacks, Quark seems to be not very compatible with other mods.
According my experience, it works only about 30% of the time, where ITR works 90% of the time.
As far as I researched, Quark for 1.12.2 had "Forced UI" option which could give it some compatibility with other mods,
but there are no equivalent option in Quark for 1.16.5.

I seeked for other options like [Inventory Sorter](https://www.curseforge.com/minecraft/mc-mods/inventory-sorter)
or [Inventory Profiles Next](https://www.curseforge.com/minecraft/mc-mods/inventory-profiles-next),
but I **really missed Quark's sorting order** when trying them.
Also I didn't really want to make extra GUI blacklists for all the modpacks I will be playing.

So I made this. I just took the Quark's sorting code, modified it for 1.16.4 forge, and replaced ITR's one with it.
You would just replace `invtweaks-1.16.4-1.0.1.jar` in your mods folder with this file (just replace `q` with `k` in filename.)
It's identical to Inventory Tweaks Renewed except for the sorting logic which is from Quark.
I didn't change even the modId concerning the compatibility with the original (sorry if it's a dumb concern, I'm not a mod dev.)

## License

It's somewhat complicated, please refer to [LICENSE.md](LICENSE.md). (ChatGPT helped a lot to write this)
