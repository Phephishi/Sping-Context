package beans;

public class Jockey {
    
    private String name;
    
    private String weight;
    
    private String age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Jockey{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHorse(Horse horse) {
    }
}
