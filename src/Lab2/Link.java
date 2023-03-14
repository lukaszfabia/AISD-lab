package Lab2;

public class Link {
    public String ref;

    public Link(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return ref;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Link) {
            Link link = (Link) o;
            return this.ref.equals(link.ref);
        }
        return false;
    }
}