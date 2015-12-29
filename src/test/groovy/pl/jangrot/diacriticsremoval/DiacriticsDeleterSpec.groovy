package pl.jangrot.diacriticsremoval;

import spock.lang.Specification

class DiacriticsDeleterSpec extends Specification {

    def diacriticsDeleter = new DiacriticsDeleter()
    def file = new File(getClass().getClassLoader().getResource("test_data.txt").path)

    def "deletes diacritics from string"() {
        expect:
        diacriticsDeleter.actOn("ąęćóśźż") == "aecoszz"
    }

    def "deletes diacritics from file content"() {
        expect:
        diacriticsDeleter.actOn(file).text == "aecoszz"
    }
}
