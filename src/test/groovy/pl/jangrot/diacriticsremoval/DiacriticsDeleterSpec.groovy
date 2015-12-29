package pl.jangrot.diacriticsremoval;

import spock.lang.Specification

class DiacriticsDeleterSpec extends Specification {

    def "deletes diacritics"() {
        expect:
        new DiacriticsDeleter().deleteFrom("ąęćółśźżĄĘĆÓŁŚŹŻ") == "aecolszzAECOLSZZ"
    }

}
