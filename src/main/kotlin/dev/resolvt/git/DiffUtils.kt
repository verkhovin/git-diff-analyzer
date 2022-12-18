package dev.resolvt.git

object DiffUtils {
    fun trimFilePath(filePath: String) =
        filePath.substringAfter("/").substringBefore(" ")
}