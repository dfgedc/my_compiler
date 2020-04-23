package com.craftinginterpreters.tool;
abstract class Pastry {
    abstract void accept(PastryVisitor visitor);
}
