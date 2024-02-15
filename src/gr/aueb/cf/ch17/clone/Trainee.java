package gr.aueb.cf.ch17.clone;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersion = 123456;
    private String name;
    private City city;
    private transient int hashCode;

    public Trainee() {

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee)                         // recommended way for copies is the copy constructors with depp copies when the instances  are not immutable
    {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return new City(getCity());
    }

    public void setCity(City city) {
        this.city = new City(city.getDescription());
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee =  (Trainee) super.clone();
        City city1 = new City(getCity().getDescription());
        trainee.setCity(city1);
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        if(!Objects.equals(name,trainee.name)) return false;
        return Objects.equals(city, trainee.city);
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
