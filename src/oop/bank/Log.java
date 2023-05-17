package oop.bank;

import java.util.Date;

public  class Log {
   private Date timestamp;
    private int id;
    private String description;
    private float amount;

    public Log(Date timestamp, int id, String description, float amount) {
        this.timestamp = timestamp;
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Log{" +
                "timestamp=" + timestamp +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
