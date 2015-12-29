package pl.jangrot.diacriticsremoval

class FileDiacriticsDeleter implements ActOn<File> {

    @Override
    File actOn(File file) {
        def fileContent = file.text
        file.write(DiacriticsDeleter.deleteFrom(fileContent))
        file
    }
}
