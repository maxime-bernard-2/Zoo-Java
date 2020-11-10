package model.animals.model;

/**
 * Interface CanSwim
 *
 */
public interface CanSwim {

    public default void swim(String name) {
        System.out.println(name + " est en train de nager \uD83C\uDFCA");
    };

}
