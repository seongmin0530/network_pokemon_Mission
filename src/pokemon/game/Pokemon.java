package pokemon.game;

public class Pokemon {
    int count = 0;
    protected String owner;
    public String[] skills;

    public Pokemon(){   //기본 생성자
        System.out.print("포켓몬 생성 : ");
        count = count + 1;
    }

    public Pokemon(String owner, String[] skills){      // 매개변수가 있는 생성자
        this.owner = owner;
        this.skills = skills;
        System.out.print("포켓몬 생성 : ");
        count = count + 1;
    }

    public String get_owner(){
        return this.owner;
    }
    public void set_owner(String owner){
        this.owner = owner;
    }

    public void info(){
        System.out.printf("%s 의 포켓몬이 사용 가능한 스킬", this.owner);
        for(int i=0; i<this.skills.length; i++){
            System.out.printf("%d : %s\n",i+1,this.skills[i]);
        }
    }

    public void attack(int idx){
        System.out.printf("%s 공격 시전!",this.skills[idx]);
    }
}


