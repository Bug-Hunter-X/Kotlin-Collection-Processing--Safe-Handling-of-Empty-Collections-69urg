# Kotlin Collection Processing: Avoiding Exceptions with Empty Collections

This example demonstrates a common issue when working with Kotlin collections: the potential for exceptions when accessing the first or last element of an empty collection.  Functions like `first()` and `last()` throw exceptions if called on an empty list.  This repository shows how to handle this using `firstOrNull()` and `lastOrNull()`. These functions return `null` instead of throwing an exception if the collection is empty, providing a safer and more robust solution.

## Bug

The `bug.kt` file contains code that illustrates the exception-throwing behavior of `first()` and `last()`. 

## Solution

The `bugSolution.kt` file demonstrates how to use `firstOrNull()` and `lastOrNull()` to safely handle potentially empty collections.