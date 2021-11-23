package pl.jakub.pizza.remote.rest.dto.common;

public class PersonOrderDto {
private String name;
private String phone;
private String email;
private String address;
private Integer floor;

    public PersonOrderDto(String name, String phone, String email, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
