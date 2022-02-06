package IntroductionJava.oop;

public enum Material {

    CARDBOARD,
    WOOD("древесина"),
    PLASTIC("пластик"),
    SHEET_IRON("белая жесть");

    private String material;

    Material() {
    }

    Material(String material) {
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material;
    }
}
