package oop.musicalInstrumets;

public abstract class ManagerMusical {
    private String model,manuFactor;
   private ColorMusical color;


    public ManagerMusical(String model, String manuFactor, ColorMusical color) {
        this.model = model;
        this.manuFactor = manuFactor;
        this.color = color;
    }

    public ManagerMusical() {
      getModel();
      getManuFactor();
      getColor();

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManuFactor() {
        return manuFactor;
    }

    public ColorMusical getColor() {
        return color;
    }

    public void setColor(ColorMusical color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", manuFactor='" + manuFactor + '\'' +
                ", color='" + color + '\'';
    }
}
