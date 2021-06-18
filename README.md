<div align="center">
  
# Kotlin
Introduces Kotlin to Bukkit and Bungee.
</div>

# How install?
Well, how do you install your other plugins?
Yea.
<details>
  <summary>If you actually don't know</summary>
Drop this and any plugins file in well, the plugins folder in the server's directory?
I think it's pretty self-explanatory on how you install plugins.
</details>
<br>

# FaQs
### There nothing in this!
It only shaded Kotlin in and that's it. What do you expect?

### Can me resolve as dependency?
Use JetBrains' provided dependencies for Kotlin. This is just a jar file that saves you from having to shade the entire std-lib in.

### But me no understand, what the point of this?
Saves the developer dudes from having to shade the ENTIRE std-lib for Kotlin in EVERY single project that uses the language.

### What name so me can depend in plugin.yml?
It's just "Kotlin".
<details>
  <summary>Example</summary>
  
```yaml
  name: YourAmazingPluginUwU
  main: ur.things.idk
  version: UwU-alpha
  depend: [Kotlin] # <-- This!
```
</details>

### Me thought there are already these out there?
Yea, but JetBrains pushed hot 1.5.0 updates that scream at your face that the methods you were using are deprecated.
