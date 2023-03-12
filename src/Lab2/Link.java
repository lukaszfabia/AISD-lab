package Lab2;

public class Link{
    public String ref;
    public Link(String ref) {
        this.ref=ref;
    }

    @Override
    public String toString() {
        return ref;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }

        if (!(obj instanceof Link ohterLink)){
            return false;
        }

        return this.ref.equals(ohterLink.ref);
    }
}