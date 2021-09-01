<div align="center">
  
# Kotlin
![GitHub](https://img.shields.io/github/license/harulol/kotlin?style=plastic) ![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/harulol/kotlin?include_prereleases&style=plastic)
</div>

# NOTICE
This plugin is now deprecated. This will no longer receive maintenance in favor of the new repository for multiple JVM languages at the same time [here](https://github.com/harulol/multi-jvm-lang).
Favor using the other repository as it packs `Kotlin`, `Groovy` and `Scala` all in one jar.


# Instructions below may be deprecated.

### Installation
Just install like any other plugins. It's just a jar with libraries.

### FaQs

<details>
<summary>There are only 2 empty files!</summary>

This project only shades Kotlin's std-lib and reflection library in. It does not add any additional features.
</details>

<details>
<summary>Should I add this as a dependency?</summary>

For Maven/Gradle, no. Use JetBrains' dependencies instead.
If you can shade and relocate yourself, it's ok to not depend on this in `plugin.yml`.
</details>

<details>
<summary>What's the point of this?</summary>

This file saves Kotlin dudes from having to shade the standard library for Kotlin in every project that may use the language. And most of them don't know how relocations work, so it keeps leading to classpath pollution and other nasty things.
</details>

<details>
<summary>How to depend on this in plugin.yml?</summary>

```yaml
  name: YourAmazingPluginUwU
  main: ur.things.idk
  version: UwU-alpha
  depend: [Kotlin] # <-- This!
```
</details>

<details>
<summary>Aren't there already similar projects like this?</summary>

Yes there are. But usually, they update really slowly, use weird versioning conventions or don't properly credit the Kotlin foundation.
</details>

### Legal Notice
This project does not have any written permissions from the foundation.<br>
Kotlin is licensed under Apache License 2.0.<br>
This project is not affiliated with JetBrains, the Kotlin Foundation or any of their sponsors and affiliates.

Until an official notice from them, this project still has the name Kotlin, considering their brand usages:
- Identify that **your software is written in the Kotlin programming language**
- Is **compatible** with the Kotlin programming language
- **Targets** the **Kotlin** programming language
- Is **for use with** the **Kotlin** programming language
- **Contains** the **Kotlin** programming language.
- **Aims to promote** or teach the **Kotlin** programming language

The use must be referential and describe the relationship of your products or services to the Kotlin programming language.
