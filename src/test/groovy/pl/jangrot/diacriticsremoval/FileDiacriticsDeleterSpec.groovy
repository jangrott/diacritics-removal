package pl.jangrot.diacriticsremoval

import spock.lang.Specification

class FileDiacriticsDeleterSpec extends Specification {

    def diacriticsDeleter = new FileDiacriticsDeleter()
    def file = new File(getClass().getClassLoader().getResource("test_data.txt").path)

    def "deletes diacritics from file content"() {
        expect:
        diacriticsDeleter.actOn(file).text == "aecoszz"
    }
}
