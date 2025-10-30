import java.util.*;

class DnDCharacter {
    
    private final int strength;
    
    private final int dexterity;
    
    private final int constitution;
    
    private final int intelligence;
    
    private final int charisma;

    private final int wisdom;
    
    private int hitPoint = 10;
    
    private final Random random = new Random();

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.charisma = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.hitPoint += modifier(getConstitution());
    }

    int ability(List<Integer> scores) {
        List<Integer> list = new ArrayList<>(scores);
        list.sort(Comparator.reverseOrder());
        return list.getFirst() + list.get(1) + list.get(2);
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            scores.add(random.nextInt(1, 7));
        }
        return scores;
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoint;
    }
}
