package oop.homework1;

public class Samsung extends ManagementSoftware{
    private Boolean isOutbreak;

    public void Samsung() {
        setOutbreak(isOutbreak);
    }

    public Samsung(String model, String manufacturer, int screenSize, Boolean isOutbreak) {
        super(model, manufacturer, screenSize);
        this.isOutbreak = isOutbreak;
    }

    public Boolean getOutbreak() {
        return isOutbreak;
    }

    public void setOutbreak(Boolean outbreak) {
        this.isOutbreak = isOutbreak;
    }

    @Override
    public String toString() {
        return super.toString()+"Samsung{" +
                "isOutbreak=" + isOutbreak +
                '}';
    }
}
