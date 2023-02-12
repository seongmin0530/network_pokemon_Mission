package pokemon.game;

public class Ggoboogi extends Pokemon {
    public String name = "꼬부기";
    public Ggoboogi(String owner, String[] skills){
        super(owner, skills);
        System.out.printf("%s\n",this.name);
    }

    public void attack(int idx){
        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격 시전!\n",owner,this.name,skills[idx]);
    }

    public void swim(){
        System.out.printf("%s 가 수영을 합니다.\n",this.name);
    }
}
