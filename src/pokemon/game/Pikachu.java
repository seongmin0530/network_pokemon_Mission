package pokemon.game;

public class Pikachu extends Pokemon{

    public String name = "피카츄";
    public Pikachu(String owner, String[] skills){
        super(owner, skills);
        System.out.printf("%s\n",this.name);
    }

    public void attack(int idx){
        System.out.printf("[삐까삐까] %s의 %s가 %s 공격 시전!\n",owner,this.name,skills[idx]);
    }
}
