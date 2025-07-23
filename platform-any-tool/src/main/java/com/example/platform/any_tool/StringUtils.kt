package com.example.platform.any_tool

object StringUtils {
    fun toLowerCase(input: String): String {
        return input.lowercase()
    }

    fun toUpperCase(input: String): String {
        return input.uppercase()
    }

    fun capitalize(input: String): String {
        return input.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }

    fun isNullOrEmpty(input: String?): Boolean {
        return input.isNullOrEmpty()
    }

    fun isNotNullOrEmpty(input: String?): Boolean {
        return !isNullOrEmpty(input)
    }

    fun containsIgnoreCase(input: String, search: String): Boolean {
        return input.contains(search, ignoreCase = true)
    }

    fun split(input: String, delimiter: String): List<String> {
        return input.split(delimiter)
    }

    fun join(input: List<String>, delimiter: String): String {
        return input.joinToString(delimiter)
    }
}
