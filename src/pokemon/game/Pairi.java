package pokemon.game;

public class Pairi extends Pokemon {
    public String name = "파이리";
    public Pairi(String owner, String[] skills){
        super(owner, skills);
        System.out.printf("%s\n",this.name);
    }

    public void attack(int idx){
        System.out.printf("[파읠파읠] %s의 %s가 %s 공격 시전!\n",owner,this.name,skills[idx]);
    }
}
