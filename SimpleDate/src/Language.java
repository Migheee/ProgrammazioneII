public enum Language {
    IT, US;

    @Override
    public String toString() {
        switch (this) {
            case IT: return "italiano";
            case US: return "american";
            default: return null; // tecnicamente non necessario
        }
    }
}

