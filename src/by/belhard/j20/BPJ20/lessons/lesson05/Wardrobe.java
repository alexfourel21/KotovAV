package by.belhard.j20.BPJ20.lessons.lesson05;

public class Wardrobe {

    private int shelves;

    private final String[] items;

    public Wardrobe(int shelves) {

        if (shelves <1)
            shelves = 3;

        this.shelves = shelves;

    }

    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public String[] getItems() {
        return items;
    }

    public void printinfo() {


    }

}
