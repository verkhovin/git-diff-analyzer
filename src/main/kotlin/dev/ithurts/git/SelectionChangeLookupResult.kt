package dev.ithurts.git

data class SelectionChangeLookupResult(
    val position: LineRange,
    val wasSelectedCodeChanged: Boolean
)
