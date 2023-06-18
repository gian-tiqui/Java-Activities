package idk;

public class OnePieceCharacter {

    String name;
    int age;
    long bounty;
    DevilFruit devilFruit;

    public OnePieceCharacter(String name, long bounty, int age, DevilFruit devilFruit) {
        this.name = name;
        this.bounty = bounty;
        this.age = age;
        this.devilFruit = devilFruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DevilFruit getDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(DevilFruit devilFruit) {
        this.devilFruit = devilFruit;
    }

}
