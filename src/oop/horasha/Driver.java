package oop.horasha;

public class Driver extends Person {
    private String kindOfBlood;
    private int LicenseNumber;
    String kindOfLicense;

    public Driver(String name, int age, int id, String kindOfBlood, int licenseNumber, String kindOfLicense) {
        super(name, age, id);
        this.kindOfBlood = kindOfBlood;
        LicenseNumber = licenseNumber;
        this.kindOfLicense = kindOfLicense;
    }

    public String getKindOfBlood() {
        return kindOfBlood;
    }

    public void setKindOfBlood(String kindOfBlood) {
        this.kindOfBlood = kindOfBlood;
    }

    public int getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        LicenseNumber = licenseNumber;
    }

    public String getKindOfLicense() {
        return kindOfLicense;
    }

    public void setKindOfLicense(String kindOfLicense) {
        this.kindOfLicense = kindOfLicense;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "kindOfBlood='" + kindOfBlood + '\'' +
                ", LicenseNumber=" + LicenseNumber +
                ", kindOfLicense='" + kindOfLicense + '\'' +
                '}';
    }
    public void printDriver(){
        printBasic();
        System.out.println(toString());
    }
}
