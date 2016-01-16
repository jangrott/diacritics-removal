package pl.jangrot.diacriticsremoval

import org.apache.commons.lang3.StringUtils;

class DiacriticsDeleter {

    static exceptions = [
            { string -> string.replaceAll("ł", "l")},
            { string -> string.replaceAll("Ł", "L")}
    ]
    static removeDiacritics = { StringUtils.stripAccents(it) }

    static deleteFrom(String string) {
        removeDiacriticsAndApplyExceptions(string)
    }

    static removeDiacriticsAndApplyExceptions(string) {
        applyExceptions(removeDiacritics(string))
    }

    static applyExceptions(string) {
        def output = string
        exceptions.each {
            output = it(output)
        }
        output
    }
}
