package IntroductionJava.oop;

public enum Color {
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("голубой"),
    INDIGO("синий"),
    VIOLET("фиолетовый"),
    INDETERMINATE(null);


    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
