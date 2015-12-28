package pl.jangrot.diacriticsremoval;

import spock.lang.Specification

class DiacriticsDeleterSpec extends Specification {

    def "deletes diacritics"() {
        expect:
        DiacriticsDeleter.deleteDiacritics("ąęćóśźż") == "aecoszz"
    }
}
