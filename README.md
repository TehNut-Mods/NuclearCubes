#Cubes of Nuclear Proportion

__Also comes in other prismic shapes__

I wasn't happy with the direction that BigReactors was going in, nor was I happy with the balancing. This was born from it. It is a fresh codebase, so nothing is copied. 

##Notable features:

* Meltdowns and explosions. If you allow your core to overheat, your reactor will melt into Corium. This is a very destructive liquid which can and will melt through almost all blocks. If you allow your casing to overheat, it will explode and leave your base as a crater. No more shall you people get away with running your reactor at 4,000C with no downside besides a bit of lost efficiency.

* There is __no__ CC API. You can't control it with a program from Pastebin. You can't read information, you can't write information. It will not be possible. I am adding my own control system which will get the same results, but be a bit more balanced than "pastebin get XXXXXXXX startup".

* You will have to treat your reactor like a reactor. It's not just a multiblock that sits in your base. It's a multiblock that should be in a protected area as it gives off radiation.

* Plus more! *cough*sphericalreactor*cough*

##How to setup dev:

1. Clone in desktop
2. run "gradlew setupDecompWorkspace idea/eclipse"
3. Make whatever changes you want. Submit a PR with your changes for review.

##How to install:

1. You don't right now. It's not released.

##FAQ:

* __Oh no! I found a bug/leak with it! D:__
   
   Please feel free to make a PR with a fix or open an issue on GitHub.

* __Can you include X feature?__
   
   Maybe. If I say no to something, and you _really_ want it... Code it, submit a PR, and we'll see from there.

* __Is it okay to do this?__
   
  Probably. I'm not copying any code from BigReactors. In early stages, I used BR textures and names as placeholders but they have been/are being fazed out for custom ones.

* __Can you port to Minecraft 1.X.X?__ 
   
   No. Strictly 1.7.10 (If I release before 1.8) and later.

* __Why did you make this?__

   I wasn't happy with BigReactors. It's a great mod, but it wasn't what I wanted. So I began NuclearCubes to provide another great Multiblock Reactor mod that uses similar mechanics, but has a completely different balancing scheme.