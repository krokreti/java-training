public class Person extends Human{
    private String name;

    public void eat() {
        System.out.println("Comendo");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
