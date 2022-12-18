package dev.resolvt.git

typealias LineRange = Pair<Int, Int>

val LineRange.start
    get() = this.first
val LineRange.end
    get() = this.second