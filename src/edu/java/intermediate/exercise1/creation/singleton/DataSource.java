package edu.java.intermediate.exercise1.creation.singleton;

public class DataSource {

    private static DataSource dataSource;

    private String address;

    private String user;

    private String password;

    private DataSource(String address, String user, String password) {
        this.address = address;
        this.user = user;
        this.password = password;
    }

    public static DataSource getInstance(String address, String user, String password){
        if (dataSource == null){
            dataSource = new DataSource(address, user, password);
        }
        return dataSource;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "address='" + address + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
