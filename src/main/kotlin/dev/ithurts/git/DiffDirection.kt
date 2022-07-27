package dev.ithurts.git

import io.reflectoring.diffparser.api.model.Line

enum class DiffDirection(
    val FROM: Line.LineType,
    val TO: Line.LineType
) {
    DIRECT(Line.LineType.FROM, Line.LineType.TO),
    REVERSE(Line.LineType.TO, Line.LineType.FROM)
}