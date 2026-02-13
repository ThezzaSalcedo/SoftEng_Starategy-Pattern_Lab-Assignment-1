public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    private String name;

    // Constructor requires name and strategies
    public Character(String name, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        System.out.print(name + ": ");
        attackStrategy.performAttack();
    }

    public void defend() {
        System.out.print(name + ": ");
        defenseStrategy.performDefense();
    }

    public String getName() {
        return name;
    }
}