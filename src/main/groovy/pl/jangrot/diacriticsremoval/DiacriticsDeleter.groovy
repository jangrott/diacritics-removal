package pl.jangrot.diacriticsremoval

import org.apache.commons.lang3.StringUtils;

class DiacriticsDeleter {

    static ret = { return it }
    static diacritics = { StringUtils.stripAccents(it) }

    def from(String string) {
        [delete: { what ->
            [and: { action ->
                action(what(string))
            }]
        }]
    }

    def actOn(String string) {
        from string delete diacritics and ret
    }

    def actOn(File file) {
        def output = from file.text delete diacritics and ret
        file.write(output)
        ret file
    }

}
