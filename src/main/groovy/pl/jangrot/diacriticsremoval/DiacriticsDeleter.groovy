package pl.jangrot.diacriticsremoval

import org.apache.commons.lang3.StringUtils;

class DiacriticsDeleter {

    static removeDiacritics = { StringUtils.stripAccents(it) }

    static deleteFrom(String string) {
        removeDiacritics(string)
                .replaceAll("ł", "l")
                .replaceAll("Ł", "L")
    }
}
