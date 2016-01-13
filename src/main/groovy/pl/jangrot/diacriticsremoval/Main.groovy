package pl.jangrot.diacriticsremoval

class Main {

    static void main(String[] args) {
        def cli = new CliBuilder(usage: 'diacritics-removal [options] <arguments>')

        cli.with {
            h(longOpt: 'help', 'Usage information')
            t(longOpt: 'text', 'remove diacritics from text', args: 1)
            f(longOpt: 'file', 'remove diacritics from file content', args: 1)
        }

        def options = cli.parse(args)

        if (!options) {
            return
        }

        if (options.h) {
            cli.usage();
            return
        }

        validate(cli, options)

        if (options.t) {
            def inputString = options.t
            def outputString = new StringDiacriticsDeleter().actOn(inputString)
            println "Output string without diacritics:\n${outputString}"
        }

        if (options.f) {
            def inputFile = new File(options.f)
            def outputFile = new FileDiacriticsDeleter().actOn(inputFile)
            println "Output file without diacritics: ${outputFile}"
        }
    }

    static void validate(CliBuilder cli, OptionAccessor options) {
        if (!(options.t || options.f)) {
            println "error: missing required options: t or f"
            cli.usage()
        }
    }
}
