package pl.jangrot.diacriticsremoval

class StringDiacriticsDeleter implements ActOn<String> {

    @Override
    String actOn(String text) {
        DiacriticsDeleter.deleteFrom text
    }
}
