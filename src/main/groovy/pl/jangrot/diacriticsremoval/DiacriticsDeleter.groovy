package pl.jangrot.diacriticsremoval

import org.apache.commons.lang3.StringUtils;

class DiacriticsDeleter {

    static deleteDiacritics = { String str -> StringUtils.stripAccents(str) }

}
