package org.jdc.template.model.db.converter

import java.time.LocalDate
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

object ThreeTenFormatter {
    // OffsetDateTime
    fun offsetDateTimeToDBString(d: OffsetDateTime?): String? {
        return if (d != null) {
            DateTimeFormatter.ISO_INSTANT.format(d)
        } else {
            null
        }
    }

    fun dbStringToOffsetDateTime(text: String?): OffsetDateTime? {
        return if (text != null && text.isNotEmpty() && text != "null") {
            try {
                OffsetDateTime.parse(text)
            } catch (e: DateTimeParseException) {
                throw IllegalArgumentException("Cannot parse date text: $text", e)
            }
        } else {
            null
        }
    }

    // Date only
    fun localDateToDBString(d: LocalDate?): String? {
        return if (d != null) {
            DateTimeFormatter.ISO_LOCAL_DATE.format(d)
        } else {
            null
        }
    }

    fun dbStringToLocalDate(text: String?): LocalDate? {
        return if (text != null && text.isNotEmpty() && text != "null") {
            try {
                LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE)
            } catch (e: DateTimeParseException) {
                throw IllegalArgumentException("Cannot parse date text: $text", e)
            }

        } else {
            null
        }
    }

    // Time only
    fun localTimeToDBString(d: LocalTime?): String? {
        return if (d != null) {
            DateTimeFormatter.ISO_LOCAL_TIME.format(d)
        } else {
            null
        }
    }

    fun dbStringToLocalTime(text: String?): LocalTime? {
        return if (text != null && text.isNotEmpty() && text != "null") {
            try {
                LocalTime.parse(text, DateTimeFormatter.ISO_LOCAL_TIME)
            } catch (e: DateTimeParseException) {
                throw IllegalArgumentException("Cannot parse time text: $text", e)
            }

        } else {
            null
        }
    }
}
