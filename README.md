#Nuclear Cubes Redstone Armory [![Build Status](http://tehnut.info/jenkins/job/NuclearCubes/badge/icon)](http://tehnut.info/jenkins/job/NuclearCubes/)
==============

Enhancing the Redstone (Flux) revolution!


##Branch Information

###If you are creating a pull request, keep these in mind:

* Latest release = Master (__Never PR this. It will be denied immediately.__)
* 1.6.4 dev = 1.6.4
* 1.7.10 dev =  1.7.10

##Dev setup

1. Clone and run ___gradlew setupDecompWorkspace___ then (if you use Eclipse) ___gradlew eclipse___ or (if you use IDEA) ___gradlew idea___.
2. Open in IDE of your choice.
3. Set the libs folder as an external library. Add ___-Dfml.coreMods.load=cofh.asm.LoadingPlugin___ to your launch settings.
4. You should be all setup now.


__Also comes in other cuboid-ic shapes__

The future GregTech of BigReactors.

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

* __Can you port to Minecraft 1.X.X?__ 
   
   No. Strictly 1.7.10 (If I release before 1.8) and later.

* __Why did you make this?__

   I love BigReactors, but I wanted a different balancing scheme. So instead of writing my own competing mod (like I originally planned), I decided to create an overhaul addon, instead.
