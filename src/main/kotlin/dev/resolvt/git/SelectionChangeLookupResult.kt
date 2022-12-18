package dev.resolvt.git

data class SelectionChangeLookupResult(
    val position: LineRange,
    val wasSelectedCodeChanged: Boolean
)
