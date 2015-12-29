package pl.jangrot.diacriticsremoval

import spock.lang.Specification

class StringDiacriticsDeleterSpec extends Specification {

    def diacriticsDeleter = new StringDiacriticsDeleter();

    def "deletes diacritics from string"() {
        expect:
        diacriticsDeleter.actOn("ąęćóśźż") == "aecoszz"
    }
}
