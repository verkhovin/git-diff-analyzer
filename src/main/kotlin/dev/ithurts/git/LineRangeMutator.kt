package dev.ithurts.git

data class LineRangeMutator(
    var start: Int,
    var end: Int,
) {
    fun toLineRange(): LineRange {
        return LineRange(start, end)
    }

    companion object {
        fun of(lineRange: LineRange) = LineRangeMutator(
            lineRange.start,
            lineRange.end
        )
    }
}