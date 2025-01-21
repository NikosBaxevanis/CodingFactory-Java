package gr.aueb.cf.ch17.builder.knight;

//Σταθερές που αναφερόμαστε σε αυτές με την " . "

public enum MissionStatus {
    STARTED,
    NOT_STARTED
}

//Τα enums είναι σαν τις κλάσεις. Είναι τύπος δεδομένων. Περιέχει μόνο σταθερές ώστε να οργανώνουμε related finals μέσα σε μία δόμη.
// Π.χ αν είχαμε δύο σταθερές ENABLED, DISABLED, αντί να έχουμε final String ENABLED = "ENABLED"; και final String DISABLED = "DISABLED", μπορούμε να έχουμε ένα enum {ENABLED, DISABLED}
