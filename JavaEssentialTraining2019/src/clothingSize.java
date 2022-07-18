public enum clothingSize {
    S("Small"), M("Medium"), L("Large");
    private String description;

    clothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
