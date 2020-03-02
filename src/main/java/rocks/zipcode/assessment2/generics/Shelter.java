package rocks.zipcode.assessment2.generics;


import com.sun.org.apache.xpath.internal.objects.XNumber;
import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable<_> {
    ArrayList<Object> residentsNum = new ArrayList<>();

    public Shelter() {
        this.residentsNum = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.residentsNum.size();
    }

    public void add(Object object) {
        this.residentsNum.add(object);
    }

    public Boolean contains(Object object) {
        return this.residentsNum.contains(object);
    }

    public void remove(Object object) {
        this.residentsNum.remove(object);
    }

    public Object get(Integer index) {
        return this.residentsNum.get(index);
    }

    public Integer getIndexOf(Object ageable) {
     return this.residentsNum.indexOf(ageable);
    }

    @Override
    public Iterator<_> iterator() {
        return null;
    }
}