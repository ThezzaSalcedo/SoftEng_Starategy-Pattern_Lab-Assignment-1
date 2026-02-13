public class GameDemo {
    public static void main(String[] args) {
        // Create characters with names
        Character knight = new Character("Knight", new SwordAttack(), new ShieldDefense());
        Character wizard = new Character("Wizard", new SpellAttack(), new MagicDefense());
        Character archer = new Character("Archer", new ArrowAttack(), new DodgeDefense());
        
       
        knight.attack();
        knight.defend();
        
        knight.setDefenseStrategy(new DodgeDefense());
        knight.defend();
        
        knight.setDefenseStrategy(new MagicDefense());
        knight.defend();
        System.out.println(); 
        wizard.attack();
        wizard.defend();
        System.out.println(); 
        archer.attack();
        archer.defend();
        
    }
}
