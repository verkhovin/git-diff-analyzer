package dev.resolvt.git

import dev.resolvt.application.internal.diff.git.Diffs.ONE_LINE_ADDED
import dev.resolvt.application.internal.diff.git.Diffs.TWO_LINES_ADDED
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GitDiffApplyingTest {
    private val diffAnalyzer = GitDiffAnalyzer(HunkResolvingStrategy())

    @Test
    fun `diff with 2 lines added is applied and binding is around second line`() {
        val result = diffAnalyzer.lookupCodeRangeChange(LineRange(30, 32), TWO_LINES_ADDED)
        assertEquals(SelectionChangeLookupResult(LineRange(31, 34), true), result)
    }

    @Test
    fun `diff with line added is applied and binding is under the hunk`() {
        val result = diffAnalyzer.lookupCodeRangeChange(LineRange(30, 32), ONE_LINE_ADDED)
        assertEquals(SelectionChangeLookupResult(LineRange(31, 33), false), result)
    }
}